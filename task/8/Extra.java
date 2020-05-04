import java.awt.*;
import java.awt.geom.QuadCurve2D; 

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Extra extends JFrame{
    public static void main(String args[]) {
        new Extra();
    }
    public Extra() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screen = kit.getScreenSize();
        
        int wight = screen.width;
        int hight = screen.height;
        this.add(new DrawQuadCurve());
        this.setBounds(wight/4, hight/4, 400, 300);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        
    }
    

}
class DrawQuadCurve extends JPanel{
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        QuadCurve2D.Double quadCurve1 = new QuadCurve2D.Double(10,20,100,32,200,200);
        g2.setColor(Color.RED);
        g2.draw(quadCurve1);
        QuadCurve2D.Double quadCurve2 = new QuadCurve2D.Double(10,25,100,123,200,156);
        g2.setColor(Color.BLUE);
        g2.draw(quadCurve2);
        QuadCurve2D.Double quadCurve3 = new QuadCurve2D.Double(10,25,100,33,200,43);
        g2.setColor(Color.YELLOW);
        g2.draw(quadCurve3);
    }
}
