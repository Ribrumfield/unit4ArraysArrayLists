import java.util.ArrayList;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
       String [] arraynames = {"Alice", "Bob", "Connie", "David", "Edward", "Fran", "Gomez", "Harry"};
       for(int i =0; i <arraynames.length;i++)
       {
           String personname = arraynames[i];
           names.add(personname);
        }
       System.out.println(names);
       
       String firstname = names.get(0);
       String lastname = names.get(arraynames.length-1);
       System.out.println(firstname + " " +  lastname);
       
       int lengtharray = names.size();
       System.out.println(lengtharray);
       
       String lastname2 = names.get(names.size()-1);
       System.out.println(lastname2);
       
       names.set(0,"Alice B.Toklas");
       System.out.println(names);
       
       names.add(3,"Doug");
       System.out.println(names);
       
       for(String value : names)
       {
           System.out.println(value);
       }
       
       
   }
} 