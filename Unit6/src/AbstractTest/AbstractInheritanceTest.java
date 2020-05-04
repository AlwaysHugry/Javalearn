package AbstractTest;
import javax.swing.JOptionPane;

public class AbstractInheritanceTest {
    public static void main(String[] args) {
        Point p = new Point(7, 11);
        Circle c = new Circle(22, 8, 5);
        Clinder l = new Clinder(0, 0, 3, 10);
        String output = "";

        Shape arrayOfShapes[] = new Shape[3];
        arrayOfShapes[0] = p;
        arrayOfShapes[1] = c;
        arrayOfShapes[2] = l;

        for(Shape s :arrayOfShapes)
        {
            output += s.getName() +":"+ s+"\n";
        }
        JOptionPane.showMessageDialog(null,output,"AbstractInheritanceTest",JOptionPane.INFORMATION_MESSAGE);
    }
}