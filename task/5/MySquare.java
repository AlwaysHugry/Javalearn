class MySquare extends MyRectangle{
    public MySquare(double s)
    {
        super(s,s);
    }
    public double getArea()
    {
        return super.getArea();
    }
    public String toString()
    {
        return "±ß³¤ÊÇ:"+super.getWidth();
    }
}