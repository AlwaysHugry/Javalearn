import java.awt.Graphics;
import javax.swing.JApplet;
public class WelcomeLines extends JApplet{
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawLine(15,10,180,10);//(15,10)到(180,10)画一条线
        g.drawLine(15,30,180,30);
        g.drawString("Welcome Applet!",25,25);
    }
}