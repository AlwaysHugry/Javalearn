import java.awt.*;
import javax.swing.*;
public class DrawRectangle extends JApplet{
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawRect(40,40,100,100);
        g.drawString("这是一个矩形",45,20);
    }
}