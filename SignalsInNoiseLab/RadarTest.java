

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Scanner;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
       
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void creatObject()
    {
        Radar radar = new Radar (7,10);
        radar.setMonsterLocation(6,8);
        for (int i = 0; i < 100; i++)
        {
            radar.scan();
        }
        
        radar.getAccumulatedDetection(6,8);
        assertEquals(7, radar.getNumRows());
        assertEquals(10, radar.getNumCols());
    }
    @Test
    public void creatObject2()
    {
        Radar radar = new Radar (6,20);
        radar.setMonsterLocation(3,6);
        for (int i = 0; i < 100; i++)
        {
            radar.scan();
        }
        
        radar.getAccumulatedDetection(3,6);
        assertEquals(6, radar.getNumRows());
        assertEquals(20, radar.getNumCols());
    }

}
