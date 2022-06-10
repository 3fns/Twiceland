package Assessment2;

/**
 *
 * Name: John David
 * Student ID: 21130196
 *
 *
 */



public class EntityEnemy extends EntityCharacter
{
    private String mobType = "";
    private final String[] mobTypeList = {"Skeleton", "Undead", "Golem", "Vampire", "Slime"};
    
    // instantiates an entityMonster
    public EntityEnemy(String charName, int level) 
    {
        super(charName, level, 0);
        this.mobType = getRandomMobType(this.mobTypeList);
    }    

    // getter method for monster type
    public String getMobType() 
    {
        return mobType;
    }

    // setter method for monster type
    public void setMobType(String mobType) 
    {
        this.mobType = mobType;
    }      
    
    // gets a random monster type
    private String getRandomMobType(String[] mobTypeList)
    {                
        int randNum = (int)(Math.random() * mobTypeList.length); 
                
        return mobTypeList[randNum];
    }
}
