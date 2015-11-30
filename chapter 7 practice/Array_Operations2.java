import java.util.Arrays;

public class Array_Operations2
{
    
    private int[] values;
    
    
    public void ArrayMeathods(int[] initialvalues)
    {
        values = initialvalues;
    }
    
     public void swapFirstandLast( int posA, int posB)
    {
        int temp = this.values[ posA ];
        this.values[ posA] = this.values[ posB];
        this.values[ posB ] = temp;
    }

    public void shiftRight (int last)
    {
        for (int i = 0; i < values.length; i++)
        {
            values[i] = i + 1;
            
        }
    }
}
