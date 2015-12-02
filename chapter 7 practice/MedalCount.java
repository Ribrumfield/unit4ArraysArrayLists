

public class MedalCount
{
    final int COUNTRIES = 7;
    final int MEDALS = 3;
    
    int[] [] counts =
        {
            {1,0,2},
            {4,5,2},
            {6,3,6},
            {8,6,2},
            {4,7,3},
            {0,1,0},
            {8,0,1},
        };
        
    public MedalCount()
    {
       // alternative way to initialize the 2D array
       // counts = new int [COUNTRIES] [MEDALS];
    }
    
    public String toString()
    {
        String str = "";
        
        // good :for ( int i = 0; i < COUNTRIES; i++)
        // better:
        for( int i =0; i< counts.length; i++)
        {
            // good : for( int j = 0; j < counts[0].length; j++)
            // better:
            for( int j = 0; j < counts[i].length; j++)
            {
                str += counts[i][j] + "\t";
            }
            
            str +="\n";
        }
        System.out.println(str);
        return str;
    }
    
    public int medalCount(int countryIndex)
    {
        int total = 0;
        
        for (int j = 0; j < counts[countryIndex].length; j++)
        {
            total += counts[countryIndex][j];
        }
        
        return total;
    }
    
    public int countPerMedal( int medalIndex )
    {
        int total = 0;
        
        for (int i = 0; i < counts.length; i ++)
        {
            total+= counts[i][medalIndex];
        }
        
        return total;
    }
}
