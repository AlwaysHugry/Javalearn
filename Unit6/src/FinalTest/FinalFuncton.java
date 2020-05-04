package FinalTest;

public class FinalFuncton {
    final public double PI = 3.1416;//常量,必须赋值,且不能改变

    public FinalFuncton(){}

    final public String getPI()//final方法不能重载,private方法可以视为隐式的final方法
    {
        return PI+"";
    }
}