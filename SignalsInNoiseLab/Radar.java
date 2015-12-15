import java.util.Scanner;
/**
 * The model for radar scan and accumulator
 * 
 * @author @gcschmit
 * @version 19 July 2014
 */
public class Radar
{
    
    // stores whether each cell triggered detection for the current scan of the radar
    // (true represents a detected monster, which may be a false positive)
    private boolean[][] currentScan;
    
    // value of each cell is incremented for each scan in which that cell triggers detection
    private int[][] accumulator;
    
    // location of the monster
    private int monsterLocationRow;
    private int monsterLocationCol;

    // probability that a cell will trigger a false detection (must be >= 0 and < 1)
    private double noiseFraction;
    
    // number of scans of the radar since construction
    private int numScans;

    /**
     * Constructor for objects of class Radar
     * 
     * @param   rows    the number of rows in the radar grid
     * @param   cols    the number of columns in the radar grid
     */
    public Radar(int rows, int cols)
    {
        // initialize the currentScan 2D array and the accumulator 2D array
        
        
        //
        // !!! add code here !!!
        //
        Scanner in = new Scanner (System.in );
        System.out.println("would you like to define where the monster starts?");
        String answer = in.next();
        
        if( answer.equals( "y") )
        {
            Scanner i = new Scanner(System.in);
            System.out.println("Please enter the row number you would like the monster to be on");
            int monsterLocationRow = i.nextInt();
            
            Scanner j = new Scanner(System.in);
            System.out.println("Please enter the colomn number you would like the monster to be on");
            int monsterLocationCol = j.nextInt();
            
            setMonsterLocation(monsterLocationRow,monsterLocationCol);
        }
        currentScan = new boolean [rows][cols]; 
        accumulator = new int [rows][cols];
        // randomly set the location of the monster (can be explicity set through the
        //  setMonsterLocation method for the unit test
        if( answer.equals("n"))
        {
            monsterLocationRow = (int)(Math.random() * rows);
            monsterLocationCol = (int)(Math.random() * cols);
        }
        noiseFraction = 0.05;
        numScans= 0;
    }
    
    /**
     * Performs a scan of the radar. Noise is injected into the grid and the accumulator is updated.
     * 
     */
    public void scan()
    {
        // algorithm for performing a scan:
        //    1. set all cells in the currentScan 2D array to false
        //    2. set the location of the monster in the currentScan 2D array
        //    3. inject noise into the grid
        //    4. update the accumulator 2D array based on the state of the currentScan 2D array
        //    5. increment the numScans instance variable
                
        //
        // !!! add code here !!!
        //
        
        //step 1
        for (int i = 0; i < accumulator.length; i++)
        {
            for ( int j = 0; j <currentScan.length; j++)
            {
                currentScan[i][j] = false;
            }
        }
        
        //step2
        
        setMonsterLocation(monsterLocationRow,monsterLocationCol);
        
        //step3
        injectNoise();
        
        //step4
         for (int i = 0; i < accumulator.length; i++)
        {
            for ( int j = 0; j < accumulator[i].length; j++)
            {
                if(currentScan[i][j])
               {
                   this.accumulator[i][j]++;
               }
            }
        }
        
        //step5
        numScans++;
    }

    /**
     * Sets the location of the monster
     * 
     * @param   row     the row in which the monster is located
     * @param   col     the column in which the monster is located
     * @pre row and col must be within the bounds of the radar grid
     */
    public void setMonsterLocation(int row, int col)
    {
        // remember the row and col of the monster's location
        monsterLocationRow = row;
        monsterLocationCol = col;
        
        // update the radar grid to show that something was detected at the specified location
        currentScan[row][col] = true;
    }
    
     /**
     * Sets the probability that a given cell will generate a false detection
     * 
     * @param   fraction    the probability that a given cell will generate a flase detection expressed
     *                      as a fraction (must be >= 0 and < 1)
     */
    public void setNoiseFraction(double fraction)
    {
        noiseFraction = fraction;
    }
    
    /**
     * Returns true if the specified location in the radar grid triggered a detection.
     * 
     * @param   row     the row of the location to query for detection
     * @param   col     the column of the location to query for detection
     * @return true if the specified location in the radar grid triggered a detection
     */
    public boolean isDetected(int row, int col)
    {
        return currentScan[row][col];
    }
    
    /**
     * Returns the number of times that the specified location in the radar grid has triggered a
     *  detection since the constructor of the radar object.
     * 
     * @param   row     the row of the location to query for accumulated detections
     * @param   col     the column of the location to query for accumulated detections
     * @return the number of times that the specified location in the radar grid has
     *          triggered a detection since the constructor of the radar object
     */
    public int getAccumulatedDetection(int row, int col)
    {
        return accumulator[row][col];
    }
    
    /**
     * Returns the number of rows in the radar grid
     * 
     * @return the number of rows in the radar grid
     */
    public int getNumRows()
    {
        return currentScan.length;
    }
    
    /**
     * Returns the number of columns in the radar grid
     * 
     * @return the number of columns in the radar grid
     */
    public int getNumCols()
    {
        return currentScan[0].length;
    }
    
    /**
     * Returns the number of scans that have been performed since the radar object was constructed
     * 
     * @return the number of scans that have been performed since the radar object was constructed
     */
    public int getNumScans()
    {
        return numScans;
    }
    
    /**
     * Sets cells as falsely triggering detection based on the specified probability
     * 
     */
    private void injectNoise()
    {
        // Iterate through all cells in the currentScan 2D array to inject noise by setting false positives.
        // The noiseFraction instance variable is the probability that a given cell will be
        // detected as a false positive. Use the Math.random method to determine if each cell should be set
        // as a false positive.
        
        
        //
        // !!! add code here !!!
        //
        for( int i = 0; i< currentScan.length; i++)
        {
            for(int j = 0; j< currentScan.length; j++)
            {
                double num = Math.random();
                if (num <= this.noiseFraction)
                {
                    currentScan[i][j] = true;
                }
            }
        }
        
    }
    
}
