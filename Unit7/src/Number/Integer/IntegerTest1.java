package Number.Integer;

public class IntegerTest1{
    public static String f(Object o)
    {
        return o.toString();
    }

    public static void main(String[] args)
    {
        int a = 1314;
        Integer e = a;//调用构造方法在version 9以后不建议这么做,自动装箱
        a = Integer.parseInt("123");
        System.out.println(f(e)+"\n"+a);
    }
}