import java.awt.Graphics;
import javax.swing.JApplet;
public class WelcomeApplet extends JApplet{//继承,且必须申明为Public
    public void paint(Graphics g)
    {
        super.paint(g);//调用Applet的paint方法,画一个Graphics
        g.drawString("Welcome JavaApplet!",25,25);//调用函数画一个字符串
    }
}