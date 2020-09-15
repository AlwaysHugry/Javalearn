package Test5;
import java.util.Scanner;
public class test {
    public static void main(String[] args)
    {
        try{
            Scanner input = new Scanner(System.in);
            String s1 = input.next();
            String s2 = input.next();
            double a = Double.parseDouble(s1);
            double b = Double.parseDouble(s2);
            System.out.println(a+b);
            input.close();
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("over");
        }
    }
}