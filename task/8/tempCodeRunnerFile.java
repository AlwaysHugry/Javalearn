import java.awt.geom.GeneralPath;
import javax.swing.*;
import java.awt.*;
public class Test6 extends JFrame{
    public Test6()
    {
        super("Draw 2D Shapes");
        getContentPane().setBackground(Color.WHITE);
        setSize(500,500);
        setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g ;
        
    }
    public static void main(String[] args)
    {
        Test6 win = new Test6();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}