import java.util.Scanner;
class Test19{
    public static void main(String[] args)
    {
        
        Scanner input=new Scanner(System.in);
        int n;
        n=input.nextInt();
        int f[]=new int[n+2];
        f[0]=1;
        f[1]=1;
        for(int i=2;i<=n;i++)
        f[i]=f[i-1]+f[i-2];
        System.out.println("fibonacci("+n+")="+f[n]);
    }
}