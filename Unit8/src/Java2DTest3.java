package src;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

import javax.swing.*;


public class Java2DTest3 extends JFrame{
    /**
     *指定绘图颜色与填充图案
     */
    private static final long serialVersionUID = 1L;

    public Java2DTest3()
    {
        super("setPaint: GradientPaint TexturePaint");
        setSize(400,200);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(new GradientPaint(5,40,Color.red,5,60,Color.blue,true));
        g2d.fill(new Ellipse2D.Double(5,40,65,110));
        
        BufferedImage bi = new BufferedImage(5,5,BufferedImage.TYPE_INT_RGB);
        Graphics2D big = bi.createGraphics();
        big.setColor(Color.blue);
        big.fillRect(0, 0, 5, 5);
        big.setColor(Color.yellow);
        big.fillOval(0, 0, 5, 5);
        Rectangle r = new Rectangle(0,0,5,5);
        TexturePaint tp = new TexturePaint(bi,r);
        g2d.setPaint(tp);
        g2d.fill(new RoundRectangle2D.Double(155,40,75,110,50,50));
    }
    public static void main(String[] args)
    {
        Java2DTest3 win = new Java2DTest3();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}