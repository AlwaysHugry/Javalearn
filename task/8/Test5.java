import java.awt.*;
import java.awt.geom.GeneralPath;
import javax.swing.*;
public class Test5 extends JFrame{
    public Test5()
    {
        super("Draw 2D Shapes");
        getContentPane().setBackground(Color.WHITE);
        setSize(200,200);
        setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        int x[] = {60,72,114,78,88,60,32,42,6,48};//把五角星的点坐标顺时针列出来
        int y[] = {60,96,96,114,156,122,156,114,96,96};
        Graphics2D g2 = (Graphics2D) g ;//转换
        GeneralPath star = new GeneralPath();
        star.moveTo(x[0],y[0]);
        for(int count = 1;count < x.length;count++)
        {
            star.lineTo(x[count],y[count]);//连线
        }
        star.closePath();
        g2.setColor(Color.RED);
        g2.fill(star);
    }
    public static void main(String[] args)
    {
        Test5 win = new Test5();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}