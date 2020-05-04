public class Point {
    protected int x,y;

    public Point()
    {
        x = 0;
        y = 0;
        System.out.println("Point default construction!");
    }

    public Point(int x,int y)
    {
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

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
    
    public void finalize()
    {
        System.out.println("Point finalizer!");
    }
    
}