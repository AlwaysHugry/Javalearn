package src;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Java2DTest2 extends JFrame{
/**
BasicStroke
Constructs a new BasicStroke with the specified attributes.

Parameters:

width :
the width of this BasicStroke. The width must be greater than or equal to 0.0f. If width is set to 0.0f, the stroke is rendered as the thinnest possible line for the target device and the antialias hint setting.

cap :
the decoration of the ends of a BasicStroke

join :
the decoration applied where path segments meet

miterlimit :
the limit to trim the miter join. The miterlimit must be greater than or equal to 1.0f.

dash :
the array representing the dashing pattern

dash_phase :
the offset to start the dashing pattern
**/
    private static final long serialVersionUID = 1L;

    public Java2DTest2()
    {
        super("Stroke");
        setSize(400,200);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.red);
        g2d.setStroke(new BasicStroke(1.0f));//…Ë÷√ª≠± —˘ Ω
        g2d.draw(new Rectangle2D.Double(80,40,65,110));

        g2d.setPaint(Color.yellow);
        g2d.setStroke(new BasicStroke(6.0f));
        g2d.draw(new Line2D.Double(10,100,110,100));

        float dashes[] = {3,3};
        g2d.setPaint(Color.red);
        g2d.setStroke(new BasicStroke(1.0f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND,10,dashes,10));
        g2d.draw(new Line2D.Double(10,180,110,180));
    } 
    public static void main(String[] args)
    {
        Java2DTest2 win = new Java2DTest2();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}