import java.util.Scanner;
public class MyApplication{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        double number1,number2;
        double sum=0;
        double product=0;
        System.out.print("输入第一个数:");
        number1=input.nextDouble();
        System.out.print("输入第二个数:");
        number2=input.nextDouble();
        sum=number1+number2;
        product+=number1*number2;
        System.out.printf("和为%f,积为%f的\n",sum,product);
        System.out.printf("差为%f,商为%f的\n",number1-number2,number1/number2);
    }
}