package src;

import javax.swing.*;
import java.awt.*;

public class FontsTest extends JFrame{
    /**
     *字体
     */
    private static final long serialVersionUID = 1L;

    public FontsTest()
    {
        super("Using Fonts");
        setSize(400,300);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        super.paint(g);

        g.setFont(new Font("Serif",Font.BOLD,12));
        g.drawString("Serif 12 Point Bold.",20,50);

        g.setFont(new Font("Monospaced",Font.ITALIC,24));
        g.drawString("Monospaced 24 point italic.", 20, 70);

        g.setColor(Color.red);
        g.setFont(new Font("Serif",Font.PLAIN+Font.ITALIC,18));//风格可以叠加
        g.drawString(g.getFont().getName()+g.getFont().getSize()+" point bold italic.",20,90);
    }
    public static void main(String[] args)
    {
        FontsTest win = new FontsTest();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}