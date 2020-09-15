package src;

import java.awt.*;
import javax.swing.*;

public class GraphicsTest extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public GraphicsTest()
    {
        super("ªÊ÷∆Õº–Œ");
        //setBackground(Color.WHITE);
        setSize(300,200);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.BLUE);
        //ª≠œﬂ
        g.drawLine(10, 40,60, 40);
        //rectangle
        g.drawRect(10,50, 100, 30);
        g.fillRect(10, 85, 100, 30);
        //‘≤Ω«æÿ–Œ
        g.drawRoundRect(10, 120, 100, 30, 5, 5);
        g.fillRoundRect(10, 155, 100, 30, 5, 5);
        //3Dæÿ–Œ
        g.draw3DRect(120, 50, 100, 30, true);//true:Õπ,false:∞º
        g.fill3DRect(120, 85, 100, 30, false);
        //ª≠Õ÷‘≤
        g.drawOval(120, 120, 100, 30);
        g.fillOval(120, 155, 100, 30);
    }
    public static void main(String[] args){
        GraphicsTest win = new GraphicsTest();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}