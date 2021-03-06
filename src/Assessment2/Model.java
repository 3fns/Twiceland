/**
 *
 * Name: John David
 * Student ID: 21130196
 *
 *
 */
package Assessment2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;

public class Model extends Observable {

    public DBManager db;
    public EntityPlayer player = new EntityPlayer("", 1, 1500);
    public HashMap<String, Integer> playerStats = new HashMap<String, Integer>();
    public List<EntityEnemy> monsterList;
    public int playerAttack = 0;
    public int def = 0;
    public int heal = 0;
    private int charID = 0;
    public int monsterSize = 0;
    public int stageNum = 1;
    public int currentHP;

    public Model() {
        this.db = new DBManager();
        this.db.establishConnection();
    }

    // loads player names from database
    public String[] loadPlayerNames() {
        ResultSet rs = this.db.queryDB("Select * from characterTable WHERE STATUS = true");

        String[] characterList = new String[100];

        try {
            int i = 1;
            while (rs.next()) {
                String name = rs.getString("NAME");
                characterList[i - 1] = name;

                i++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return characterList;
    }

    // loads player IDs from database
    public int[] loadPlayerIDs() {
        ResultSet rs = this.db.queryDB("Select * from characterTable WHERE STATUS = true");

        int[] idList = new int[100];

        try {
            int i = 1;
            while (rs.next()) {
                int id = rs.getInt("ID");
                idList[i - 1] = id;

                i++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return idList;
    }

    // loads selected player
    public void loadedPlayer(String charName, int chosenID) {
        ResultSet rs = this.db.queryDB("Select * from characterTable WHERE ID = " + chosenID);
        charID = chosenID;

        try {
            while (rs.next()) {
                player.setCharName(rs.getString("NAME"));
                player.setExp(rs.getInt("TWICESTONES"));
                player.setLevel(rs.getInt("LEVEL"));
                player.setMaxHealth(rs.getInt("VITALITY"));
                playerStats.put("Strength", rs.getInt("STRENGTH"));
                playerStats.put("Vitality", rs.getInt("VITALITY"));
                playerStats.put("Intelligence", rs.getInt("INTELLIGENCE"));
                player.setStats(playerStats);

                player.setHighestStageNum(rs.getInt("HIGHESTSTAGE"));
                player.setToLevelUp(rs.getInt("ATTRIBUTESINCREASED"));

            }
            currentHP = playerStats.get("Vitality");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    // initialise and adds new character to database
    public int newPlayer(String charName) {
        try {
            Statement statement = this.db.getConnection().createStatement();

            statement.execute("INSERT INTO characterTable (NAME) VALUES ('" + charName + "')", Statement.RETURN_GENERATED_KEYS);

            player = new EntityPlayer(charName, 1, 1500);
            playerStats = player.getStats();
            currentHP = playerStats.get("Vitality");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return charID;
    }

    // updates player database and reset HP back to player Vitality 
    public void returnTown() {
        this.db.updateDB("UPDATE characterTable SET HIGHESTSTAGE = " + player.getHighestStageNum() + " "
                + ", LEVEL = " + player.getLevel() + " "
                + ", ATTRIBUTESINCREASED = " + player.getToLevelUp() + " "
                + ", TWICESTONES = " + player.getExp() + " "
                + ", STRENGTH = " + playerStats.get("Strength") + " "
                + ", VITALITY = " + playerStats.get("Vitality") + " "
                + ", INTELLIGENCE = " + playerStats.get("Intelligence")
                + " WHERE ID = " + charID);
        currentHP = playerStats.get("Vitality");
    }

    // increases attribute with Twicestones and level up player after certain spend 
    public String increaseAttribute(String attribute) {
        if (player.getExp() - 150 >= 0) {
            player.setToLevelUp(player.getToLevelUp() + 1);

            playerStats.replace(attribute, playerStats.get(attribute) + 1);
            player.setExp(player.getExp() - 150);

            if (player.getToLevelUp() % 5 == 0) {
                player.setLevel(player.getLevel() + 1);
            }
        }
        return playerStats.get(attribute).toString();
    }

    // create a single monster with an appropriate level passed through
    public EntityEnemy createMonster(int level) {
        EntityEnemy monsterX = new EntityEnemy("monsterX", level);
        monsterX.setCharName(monsterX.getMobType());
        setMonsterStats(monsterX);
        setMonsterExp(monsterX);

        return monsterX;
    }

    // create a list of Monsters, randomised from 1 to 3
    public List<EntityEnemy> createMonsters() {
        int randAmount = (int) (Math.random() * 3) + 1;
        monsterList = new ArrayList<>();

        for (int i = 0; i < randAmount; i++) {
            // set monsters level corresponding to floor level +1/ -2
            int monsterLevelMAX = stageNum + 1;
            int monsterLevelMIN = stageNum - 2;

            if (monsterLevelMIN <= 0) {
                monsterLevelMIN = 1;
            }

            int monsterLevel = (int) ((Math.random() * (monsterLevelMAX - monsterLevelMIN)) + monsterLevelMIN);
            monsterList.add(i, createMonster(monsterLevel));
        }
        monsterSize = monsterList.size();

        return monsterList;
    }

    // set monster stat of an individual monster according to monster type
    private void setMonsterStats(EntityEnemy monsterX) {
        HashMap<String, Integer> monsterStats = new HashMap();

        // stats double per monster level
        monsterStats = this.db.getMonsterType(monsterX.getMobType(), monsterX.getLevel());

        monsterX.setStats(monsterStats);
    }

    // set monster given twicestones
    private void setMonsterExp(EntityEnemy monsterX) {
        switch (monsterX.getMobType()) {
            case "Skeleton":
                monsterX.setExp(monsterX.getLevel() * 50);
                break;
            case "Undead":
                monsterX.setExp(monsterX.getLevel() * 75);
                break;
            case "Golem":
                monsterX.setExp(monsterX.getLevel() * 200);
                break;
            case "Vampire":
                monsterX.setExp(monsterX.getLevel() * 100);
                break;
            case "Slime":
                monsterX.setExp(monsterX.getLevel() * 25);
                break;
        }
    }

    // checker for floor clear / all monsters slain in floor
    public boolean isCleared() {
        if (monsterSize == 0) {
            stageNum++;
            if (stageNum > player.getHighestStageNum()) {
                player.setHighestStageNum(stageNum);
            }
            return true;
        }
        return false;
    }

    // character action for attack in tower
    public boolean characterAttack(int selectedMonster) {
        // formula to calc damage
        // dmg = (str * random number from 0 to (str/2)) + (str * 1.25) 
        int randNum = (int) (Math.random() * (player.getStats().get("Strength") / 2));
        playerAttack = (int) Math.floor(randNum + (player.getStats().get("Strength") * 1.25));

        HashMap<String, Integer> stats = monsterList.get(selectedMonster).getStats();
        int rem = stats.get("Vitality") - playerAttack;

        // check monster health remaining and returning twicestones if dead
        int twiceStones = checkVitality(selectedMonster, rem, stats);

        if (twiceStones > 0) {
            player.setExp(twiceStones + player.getExp());
            return true;
        }

        return false;
    }

    // character action for heal in tower
    public void characterHeal() {
        // formula to calc heal amount
        // heal = int * random number between 0.9 - 1.5
        int maxIntelligence = (int) Math.floor(player.getStats().get("Intelligence") * 1.5);
        int minIntelligence = (int) Math.floor(maxIntelligence * 0.9);
        heal = (int) (Math.random() * (maxIntelligence - minIntelligence)) + minIntelligence;

        int newHealth = heal + currentHP;

        // check if amount heal is bigger than maxhealth to avoid overhealing
        if (newHealth > player.getMaxHealth()) {
            currentHP = playerStats.get("Vitality");
        } else {
            currentHP = newHealth;
        }
    }

    // character action for defend in tower
    public void characterDefend() {
        // formula to calc defending 
        // def = (str + vit) * 0.125
        def = (int) Math.floor((player.getStats().get("Strength") + player.getStats().get("Vitality")) * 0.125);
    }

    // all monsters attack the player after character action
    public boolean monsterAction() {
        for (int i = 0; i < monsterList.size(); i++) {
            // calculate for monster damage
            if (monsterList.get(i).getStats().get("Vitality") > 0) {
                int randNum = (int) (Math.random() * (monsterList.get(i).getStats().get("Strength") / 2));
                int dmg = (int) Math.floor(randNum + (monsterList.get(i).getStats().get("Strength") * 1.5));

                if (dmg <= 0) {
                    dmg = 0;
                }

                currentHP = (currentHP + def) - dmg;
                int finalDamage = dmg - def;

                // check if damage is defended
                if (finalDamage <= 0) {
                    finalDamage = 0;
                }
                checkVitality(currentHP, playerStats);
                def = 0;

                // check if character is dead           
                if (currentHP <= 0) {
                    return true;
                }
            }
        }

        return false;
    }

    //check damage from player against the selected monster
    private int checkVitality(int selectedMonster, int rem, HashMap<String, Integer> stats) {
        // returns amount of twicestones earned
        int twiceStones = 0;

        // player twiceStones reset to 0 when player's HP goes to 0 
        if (rem <= 0) {
            twiceStones = monsterList.get(selectedMonster).getExp();
            monsterSize--;
        } else {
            stats.replace("Vitality", rem);
            monsterList.get(selectedMonster).setStats(stats);
        }

        return twiceStones;
    }

    // check damage from monster to player
    public boolean checkVitality(int rem, HashMap<String, Integer> stats) {
        if (rem <= 0) {
            player.setExp(0);
            return false;
        } else {
            //stats.replace("Vitality", rem);
            //player.setStats(stats);
            return true;
        }
    }

    // resets player HP equal to player Vitality
    public void resetHP() {
        currentHP = playerStats.get("Vitality");
    }

    // resets player runback to tower to 1
    public void resetFloor() {
        stageNum = 1;
    }

    // removes player from database through retiring 
    public void retirePlayer() {
        this.db.updateDB("UPDATE characterTable SET STATUS = false"
                + " WHERE ID = " + charID);
    }
}
