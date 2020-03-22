import java.util.Scanner;
public class Test11{
    static void add(double a,double b,double c,double d)
    {
        System.out.println((a+c)+"i+("+(b+d)+")");
    }
    static void subtract(double a,double b,double c,double d)
    {
        System.out.println((a-c)+"i+("+(b-d)+")");
    }
    static void mutiply(double a,double b,double c,double d)
    {
        System.out.println((a*d+b*c)+"i+("+(b*d-a*c)+")");
    }
    public static void main(String args[])
    {1
        double a,b,c,d;
        Scanner input =new Scanner(System.in);
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
        d=input.nextDouble();
        add(a,b,c,d);
        subtract(a,b,c,d);
        mutiply(a,b,c,d);
    }
}