package Assessment2;

/**
 *
 * Name: John David
 * Student ID: 21130196
 *
 *
 */

public class EntityPlayer extends EntityCharacter 
{
    private int uniqueID;
    private int highestStageNum = 1;
    private int maxHealth = 100;
    private int toLevelUp = 0;
    private boolean active = true;

    public EntityPlayer(String charName, int level, int exp) 
    {
        super(charName, level, exp);        
    }    
    
    // getter method for player ID
    public int getUniqueID() 
    {
        return uniqueID;
    }

    // setter method for player ID
    public void setUniqueID(int uniqueID) 
    {
        this.uniqueID = uniqueID;
    }
    
    // getter method for player highest stage number
    public int getHighestStageNum() 
    {
        return highestStageNum;
    }

    // setter method for player highest stage number
    public void setHighestStageNum(int highestStageNum) 
    {
        this.highestStageNum = highestStageNum;
    }

    // getter method for player max hp
    public int getMaxHealth() 
    {
        return maxHealth;
    }

    // setter method for player max hp
    public void setMaxHealth(int maxHealth) 
    {
        this.maxHealth = maxHealth;
    }

    // getter method for player exp remaining to level up
    public int getToLevelUp()
    {
        return toLevelUp;
    }

    // setter method for player exp remaining to level up
    public void setToLevelUp(int toLevelUp) 
    {
        this.toLevelUp = toLevelUp;
    }     

    // getter method for player status
    public boolean getActive() 
    {
        return active;
    }
    
    // setter method for player status
    public void setActive(boolean active) 
    {
        this.active = active;
    }   
}
