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
        super("����ͼ��");
        //setBackground(Color.WHITE);
        setSize(300,200);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.BLUE);
        //����
        g.drawLine(10, 40,60, 40);
        //rectangle
        g.drawRect(10,50, 100, 30);
        g.fillRect(10, 85, 100, 30);
        //Բ�Ǿ���
        g.drawRoundRect(10, 120, 100, 30, 5, 5);
        g.fillRoundRect(10, 155, 100, 30, 5, 5);
        //3D����
        g.draw3DRect(120, 50, 100, 30, true);//true:͹,false:��
        g.fill3DRect(120, 85, 100, 30, false);
        //����Բ
        g.drawOval(120, 120, 100, 30);
        g.fillOval(120, 155, 100, 30);
    }
    public static void main(String[] args){
        GraphicsTest win = new GraphicsTest();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}