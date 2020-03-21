class Test8{
    public static void main(String args[])
    {
        MySquare a =new MySquare(3.5);
        System.out.println("Area is :"+a.getArea());
        System.out.println(a);
        MyRectangle b = new MyRectangle(12,3);
        System.out.println("Area is :"+b.getArea());
        System.out.println(b);
        b.setWidth(5);
        System.out.println(b);
    }
}