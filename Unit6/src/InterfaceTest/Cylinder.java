package InterfaceTest;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(){}

    public Cylinder(int x,int y,double radius,double height)
    {
        super(x,y,radius);
        setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void draw()
    {
        System.out.println("Cylinder!");
    }

    @Override
    public String toString() {
        return super.toString()+"\nCylinder [height=" + height + "]";
    }

    
}