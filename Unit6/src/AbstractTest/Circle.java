package AbstractTest;
public class Circle extends Point{
    private int radius;
    final static double PI = 3.1415927;

    public Circle(){//�����ȵ��ó�����޲������췽��
        System.out.println("Circle default construction!");
    }

    public Circle(int x,int y,int r)
    //�������û����ʽ���ø���Ĺ��췽��,���Զ����ø����Ĭ�Ϲ��췽��
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

    public void finalize()//���ȵ��������finalize����
    {
        System.out.println("Circle finalizer!");
        super.finalize();//ȷ���������в���
    }
    
}