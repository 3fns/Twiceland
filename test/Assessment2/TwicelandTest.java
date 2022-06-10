/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessment2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GGPC
 */
public class TwicelandTest {

    public TwicelandTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Twiceland.
     */
    @Test
    public void testMain() {
        String[] args = null;
        Twiceland.main(args);
    }

    // test if the entered user input for name is captured
    @Test
    public void testName() {
        PanelNewGame newGame = new PanelNewGame();

        newGame.enterNameField.setText("name");

        String expectedValue = newGame.enterNameField.getText();
        String finalValue = "name";
        Assert.assertEquals(finalValue, expectedValue);
    }

    // test to check if player has been slain
    @Test
    public void isDead() {
        Model model = new Model();
        model.player = new EntityPlayer("name", 1, 1500);

        boolean checker = model.checkVitality(0, model.player.getStats());

        Assert.assertFalse(checker);
    }

    // test if Floor is reset if required
    @Test
    public void stageFloorReset() {
        Model model = new Model();
        model.resetFloor();

        Assert.assertEquals(1, model.stageNum);
    }

    // test if Twicestones is used when attribute increases
    @Test
    public void attributeIncreased() {
        Model model = new Model();
        model.player = new EntityPlayer("name", 1, 1500);
        model.playerStats = model.player.getStats();
                        
        String attribute = model.increaseAttribute("Strength");
        
        Assert.assertNotEquals(1500, model.player.getExp());        
    }
    
    // test if floor is cleared when all monsters has been slain
    @Test
    public void testIfCleared() {
        Model model = new Model();
        model.player = new EntityPlayer("name", 1, 1500);
        model.monsterSize = 0;
        
        boolean checker = model.isCleared();
        
        Assert.assertTrue(checker);
    }
}
