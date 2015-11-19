

public class Array_Op
{
    public static void main(String[]args)
    {
        double[] x = {8,4,5,21,7,9,18,2,100};
        System.out.println(" the number of numbers in this array is: " + x.length);
        System.out.println(x[0]);
        System.out.println(x[8]);
        System.out.println(x[x.length - 1]);
        
        for (int i = 0; i < x.length; i++)
        {
             System.out.println(x[i]);
        }
        for (int i = 0; i < x.length; i++)
        {
             System.out.println("this is value: " + i);
             System.out.println(x[i]);
        }
       
        for (double value : x )
        {
        System.out.println(value);
        }
    }
}
