package src;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsTest2 extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public GraphicsTest2()
    {
        super("Graphics Paint");
        setBackground(Color.white);
        setSize(300,200);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.YELLOW);
        //画弧形
        g.drawArc(10, 50, 100, 100, 60, -220);//矩形的左上角坐标,矩形长宽,起始角度,旋转角度
        g.fillArc(10, 155, 100, 100, 0, 270);
        //画封闭式多边形
        int x[] = {120,150,180};
        int y[] = {50,80,50};
        g.drawPolygon(x, y, 3);
        int[] x1 = {120,150,180};
        int[] y1 = {90,120,90};
        g.fillPolygon(x1, y1, 3);
        //折线
        int[] x2 = {120,150,180,157};
        int[] y2 = {120,150,120,115};
        g.drawPolyline(x2, y2, 4);
    }
    public static void main(String[] args){
        GraphicsTest2 win = new GraphicsTest2();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}