package Number.Integer;

public class IntegerTest1{
    public static String f(Object o)
    {
        return o.toString();
    }

    public static void main(String[] args)
    {
        int a = 1314;
        Integer e = a;//���ù��췽����version 9�Ժ󲻽�����ô��,�Զ�װ��
        a = Integer.parseInt("123");
        System.out.println(f(e)+"\n"+a);
    }
}