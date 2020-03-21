public class MyRectangle{
    private double width;
    private double length;
    public MyRectangle(double a,double b)
    {
        width=a;
        length=b;
    }
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public void setLength(double a)
    {
        length=a;
    }
    public void setWidth(double b)
    {
        width=b;
    }
    public double getArea()
    {
        return width*length;
    }
    public String toString()
    {
        return "³£Îª:"+length+",¿íÎª:"+width;
    }
}