package equation;
import java.lang.Math;
public class Equation{
    private int a,b,c;
    public Equation(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double solve1()
    {
        return (-b+Math.sqrt(b*b-4*a*c))/2*a;
    }
    public double solve2()
    {
        return (-b-Math.sqrt(b*b-4*a*c))/2*a;
    } 
}