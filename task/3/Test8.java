import java.util.Scanner;
class Test8{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x,sum1=0,sum2=0;
        x=input.nextInt();
        while(x!=0)
        {
            if(x>0)
            sum1++;
            else sum2++;
            x=input.nextInt();
        }
        System.out.println("sum1="+sum1+" sum2="+sum2);
    }
}