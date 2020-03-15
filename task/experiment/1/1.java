import java.util.Scanner;
public class MyApplication{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        double num1,num2;
        double sum;
        double product;
        System.out.print("输入第一个数:");
        number1=input.nextDouble();
        System.out.print("输入第二个数:");
        number2=input.nextDouble();
        sum=number1+number2;
        product+=number1*number2;
        System.out.printf("和为%lf,积为%lf的\n",sum,product);
        System.out.printf("差为%lf,商为%lf的\n",num1-num2,num1/num2);
    }
}