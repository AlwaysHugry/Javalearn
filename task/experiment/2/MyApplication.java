import java.util.Scanner;
public class MyApplication{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        double number1,number2;
        double sum=0;
        double product=0;
        System.out.print("�����һ����:");
        number1=input.nextDouble();
        System.out.print("����ڶ�����:");
        number2=input.nextDouble();
        sum=number1+number2;
        product+=number1*number2;
        System.out.printf("��Ϊ%f,��Ϊ%f��\n",sum,product);
        System.out.printf("��Ϊ%f,��Ϊ%f��\n",number1-number2,number1/number2);
    }
}