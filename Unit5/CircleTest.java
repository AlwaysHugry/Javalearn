class CircleTest {
    public static void main(String[] args) {
        Point o = new Point();
        Point a = new Point(1, 1);
        Circle r1 = new Circle(o.getX(), o.getY(), 3);
        Circle r2 = new Circle(a.getX(), a.getY(), 2);
        Point t = r1;// ���������Ա������������,������������,����ƻ����ˮ��,ˮ������ƻ��;
        Circle v = (Circle) o;// ��Ҫת���Ļ�,�������ǿ��ת��
        v.getArea();//�˴��ᷢ�����д���,��Ϊ�ö����޸÷���;
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