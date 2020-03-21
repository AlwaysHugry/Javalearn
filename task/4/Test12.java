public class Test12{
    public static void main(String[] args)
    {
        Box a= new Box(1,2,3);
        System.out.println(a.getSize());
    }
}
class Box{
    double length,width,height;
    public Box(double l,double w,double h)
    {
        length = l;
        width = w;
        height = h;
    }
    public double getSize()
    {
        double s=length*(width*height);
        return s;
    }
}