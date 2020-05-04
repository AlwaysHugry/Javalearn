package InterfaceTest;

public class Circle extends Point {
    private double radius;

    public Circle() {}

    public Circle(int x,int y,double r)
    {
        super(x,y);
        radius = r;
    }

    public void draw()
    {
        System.out.println("Circle!");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Circle [radius=" + radius + "]";
    }

    
}