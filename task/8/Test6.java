import java.awt.*;
import java.awt.geom.GeneralPath;
import javax.swing.*;
public class Test6 extends JFrame{
    public Test6()
    {
        super("Draw 2D Shapes");
        getContentPane().setBackground(Color.WHITE);
        setSize(300,300);
        setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawRect(40, 40, 100, 100);
        g.drawLine(40, 40, 60, 20);
		g.drawLine(60, 20, 160, 20);
		g.drawLine(140, 40, 160, 20);
		g.drawLine(160, 120, 160, 20);
		g.drawLine(160, 120, 140, 140);
        Graphics2D g2 = (Graphics2D) g ;//×ª»»
        Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
	    g2.setStroke(dashed);
        g2.drawLine(60,120,40,140);
        g2.drawLine(60,120,160,120);
        g2.drawLine(60,20,60,120);
    }
    public static void main(String[] args)
    {
        Test6 win = new Test6();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}