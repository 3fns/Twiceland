package Assessment2;

/**
 *
 * Name: John David
 * Student ID: 21130196
 *
 *
 */

import java.util.HashMap;

public class EntityCharacter 
{
    private String charName;
    private int level = 1;
    private int exp = 0;
    private HashMap<String, Integer> stats;
    
    public EntityCharacter(String charName, int level, int exp)
    {
        this.level = level;
        this.charName = charName;
        this.stats = new HashMap();
        this.exp = exp;   
                
        this.stats.put("Strength", 15);
        this.stats.put("Vitality", 100);
        this.stats.put("Intelligence", 15);
    }
    
    // getter method for character name 
    public String getCharName()
    {
        return charName;
    }
    
    // setter method for character name 
    public void setCharName(String charName)
    {
        this.charName = charName;
    }
    
    // getter method for character level
    public int getLevel()
    {
        return level;
    }
    
    // stter method for character level
    public void setLevel(int level)
    {
        this.level = level;
    }

    // getter method for character experience / TwiceStones
    public int getExp() 
    {
        return exp;
    }

    // stter method for character experience / TwiceStones
    public void setExp(int exp) 
    {
        this.exp = exp;
    }
      
    // getter method for character stats
    public HashMap<String, Integer> getStats() 
    {
        return stats;
    }

    // stter method for character stats
    public void setStats(HashMap<String, Integer> stats) 
    {
        this.stats = stats;
    }        
}
