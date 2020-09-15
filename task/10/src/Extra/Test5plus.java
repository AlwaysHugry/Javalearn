package Extra;

import java.util.Scanner;

class Exception1 extends Exception{
    /**
     *
     */
    private static final long serialVersionUID = -5439949687883287283L;
    private int value;
    public Exception1(int v)
    {
        value = v;
    }
    public int getValue()
    {
        return value;
    }
}
//�������2λ��,���ӷ�;�粻��2λ��,���׳��쳣,����ĩ���11�µ�һ��
public class Test5plus {
    public static void main(String[] args)
    {
        try{
            int a,b;
            Scanner input = new Scanner(System.in);
            a = input.nextInt();
            b = input.nextInt();
            input.close();
            if(a>=100||a<=9){
                throw new Exception1(a);
            }
            if(b>=100||b<=9){
                throw new Exception1(b);
            }
            System.out.println(a+b);
        }
        catch(Exception1 e)
        {
            System.out.println("Exception:"+e.getValue());
        }
    }
}