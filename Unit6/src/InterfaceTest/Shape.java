package InterfaceTest;
/*
1.接口不能实现任何方法
2.接口可以多继承
3.没有联系的类可以实现相同的接口
*/
public interface Shape{
    public final static double PI = 3.1416;//常量声明
    public abstract void draw();//抽象方法声明
} 