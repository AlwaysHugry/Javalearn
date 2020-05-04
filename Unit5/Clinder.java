public class Clinder extends Circle{
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public Clinder(int x,int y,int r,double h)
    {
        super(x,y,r);
        height = h;
    }

    public double getArea()
    {
        return 2*super.getArea()+super.getDiameter()*height;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Clinder [height=" + height + "]";
    }
    
}