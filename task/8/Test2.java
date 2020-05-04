import java.awt.*;
import javax.swing.*;
import java.util.Date;
class Test2 extends JFrame{
    public void paint(Graphics g)
    {
        int x1,y1,x2,y2;
        x1 = (int) (Math.random() * 500);
        y1 = (int) (Math.random() * 500);
        x2 = (int) (Math.random() * 500);
        y2 = (int) (Math.random() * 500);//随机生成两个端点
        g.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));//随机生成颜色
        g.drawLine(x1,y1,x2,y2);
    }
    public static void main(String[] args){
        Test2 win = new Test2();
        win.setSize(500,500);
        win.setVisible(true);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}