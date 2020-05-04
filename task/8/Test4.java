import java.awt.*;
import javax.swing.*;
import java.util.Date;
class Test4 extends JFrame{
    public void paint(Graphics g)
    {
        for(int i=1;i<=8;i++)
        {
           g.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));//随机生成颜色
           g.drawArc(200-i*10,200-i*10,i*20,i*20,0,360);
        }
    }
    public static void main(String[] args){
        Test4 win = new Test4();
        win.setSize(500,500);
        win.setVisible(true);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}