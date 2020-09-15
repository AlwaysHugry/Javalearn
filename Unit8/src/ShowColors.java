package src;
import javax.swing.JFrame;
import java.awt.*;

public class ShowColors extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ShowColors()
    {
        super("Show Colors");

        setSize(400, 400);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(new Color(255,0,0));//Color(int r,int g,int b)红绿蓝组成所有颜色,值范围0~255
        g.fillRect(25, 25, 100, 20);
        g.drawString("Color:"+g.getColor(),130,40);

        g.setColor(new Color(0,1,0));
        g.fillRect(25, 50, 100, 20);
        g.drawString("Color:"+g.getColor(),130 ,65 );

        g.setColor(Color.BLUE);//静态方法,直接返回蓝色
        g.fillRect(25, 75, 100, 20);
        g.drawString("Color:"+g.getColor(),130 ,90 );

        Color color = Color.magenta;
        g.setColor(color);
        g.fillRect(25, 100, 100, 20);
        g.drawString("Color:"+g.getColor(), 130, 115);
    }
    public static void main(String[] args)
    {
        ShowColors win = new ShowColors();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}