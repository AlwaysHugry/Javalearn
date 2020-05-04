package AbstractTest;
public class Circle extends Point{
    private int radius;
    final static double PI = 3.1415927;

    public Circle(){//会优先调用超类的无参数构造方法
        System.out.println("Circle default construction!");
    }

    public Circle(int x,int y,int r)
    //如果子类没有显式调用父类的构造方法,会自动调用父类的默认构造方法
    {
        setX(x);
        setY(y);
        setRadius(r);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public int getDiameter(){
        return 2*radius;
    }

    public double Circumference()
    {
        return 2*radius*PI;
    }

    public double getArea()
    {    
        return PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]"+'\n'+super.toString();
    }

    public void finalize()//优先调用子类的finalize方法
    {
        System.out.println("Circle finalizer!");
        super.finalize();//确保结束所有部分
    }
    
}