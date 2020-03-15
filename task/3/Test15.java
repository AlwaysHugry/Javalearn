import java.util.Scanner;
class Test15{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        int x=128,sum=0;
        for(int i=0;i<8;i++)
        {
            sum+=(s.charAt(i)-'0')*x;
            x/=2;
        }
        System.out.println("sum="+sum);
    }
}