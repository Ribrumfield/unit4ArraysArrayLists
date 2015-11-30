import java.util.Arrays;

public class ArrayPractice
{
    public static void exceptionExample()
    {
        int[] values = { 1, 4 ,9 , 16, 25};
       
    }
    
    public static void filling()
    {
        int[] values = new int[100];
        for ( int i = 0; i < values.length; i++)
        {
          values[i] = i * i;  
        }
        System.out.println( values);
        System.out.println( Arrays.toString(values));
    }
    
    public static int findMax()
    {
        int[] values = { 10, 45 ,19 , 216, 25};
        
        int largest = values[0];
        for (int i = 1; i < values.length; i++ )
        {
            if ( values[i] > largest)
            {
                largest = values[i];
            }
        }
        return largest;
    }    
    
    public static void main(String[]args)
    {
        int searchValue = 100;
        int[] values = { 80, 90, 100, 120, 110 };
        int pos = 0;
        boolean found = false;
        while ( pos < values.length && !found )
        {
           if ( values[pos] == searchValue )
           {
              found = true;
           }
           else
           {
              pos++;
           }
        }
        
        if ( found )
        {
           System.out.println("Found at position: " + pos);
        }
        else
        {
           System.out.println("Not found");
        }

    }
}