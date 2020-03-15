import java.util.Scanner;
class Test19_1{
    public static void main(String[] args)
    {
        
        Scanner input=new Scanner(System.in);
        int n;
        n=input.nextInt();
        System.out.println("fibonacci("+n+")="+f(n));
    }
    static int f(int n)
    {
        if(n==0||n==1)
        return 1;
        else {
            return f(n-1)+f(n-2);
        }
    }
}