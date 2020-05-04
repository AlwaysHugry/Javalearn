class CircleTest {
    public static void main(String[] args) {
        Point o = new Point();
        Point a = new Point(1, 1);
        Circle r1 = new Circle(o.getX(), o.getY(), 3);
        Circle r2 = new Circle(a.getX(), a.getY(), 2);
        Point t = r1;// 子类对象可以被父类变量引用,反过来不可以,正如苹果是水果,水果并非苹果;
        Circle v = (Circle) o;// 非要转换的话,并须进行强制转换
        v.getArea();//此处会发生运行错误,因为该对象并无该方法;
        t.getX();
        o = null;
        a = null;
        System.gc();
        System.out.println(r1 + "\n" + r1.getDiameter() + " " + r1.getArea());
        System.out.println(r2 + "\n" + r2.getDiameter() + " " + r2.getArea());
        r1 = null;
        r2 = null;
        System.gc();
    }
}