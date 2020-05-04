package AbstractTest;
public class Point extends Shape{
    private int x;
    private int y;
    public Point(){}

    public Point(int x,int y){
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName()
    {
        return "Point";
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
    
    public void finalize()
    {
        
    }
    
}