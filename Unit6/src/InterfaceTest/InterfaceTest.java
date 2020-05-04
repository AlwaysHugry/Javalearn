package InterfaceTest;

import javax.swing.JOptionPane;

public class InterfaceTest {
    public static void main(String[] args) {
        Point p = new Point(7, 11);
        Circle c = new Circle(22, 8, 5);
        Cylinder l = new Cylinder(0, 0, 3, 10);
        String output = "";

        Shape arrayOfShapes[] = new Shape[3];//接口也可以这样执行
        arrayOfShapes[0] = p;
        arrayOfShapes[1] = c;
        arrayOfShapes[2] = l;

        for(Shape s :arrayOfShapes)
        {
            output +=  ":"+ s+"\n";
        }
        JOptionPane.showMessageDialog(null,output,"AbstractInheritanceTest",JOptionPane.INFORMATION_MESSAGE);
    }
}