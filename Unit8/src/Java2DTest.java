package src;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.geom.*;//Java2D API

public class Java2DTest extends JFrame{
    /**
     *GeneralPath¿‡
     */
    private static final long serialVersionUID = 1L;

    public Java2DTest()
    {
        super("GeneralPath");
        setSize(200,200);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        float x[] = {100,100,50,150};
        float y[] = {30,130,180,180};
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath tour = new GeneralPath();
        tour.moveTo(x[0], y[0]);
        tour.lineTo(x[1], y[1]);
        tour.lineTo(x[2], y[2]);
        tour.lineTo(x[3], y[3]);
        tour.lineTo(x[1], y[1]);
        tour.moveTo(x[2], y[2]);
        tour.lineTo(x[2], y[2]);
        tour.lineTo(x[0], y[0]);
        tour.lineTo(x[3], y[3]);
        tour.closePath();
        g2d.draw(tour);
    }
    public static void main(String[] args)
    {
        Java2DTest win = new Java2DTest();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}