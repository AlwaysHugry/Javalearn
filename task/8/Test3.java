import java.awt.*;
import javax.swing.*;
import java.util.Date;
class Test3 extends JFrame{
    public void paint(Graphics g)
    {
        for(int i=1;i<=8;i++)
        {
           g.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));//���������ɫ
           g.drawOval(200-i*10,200-i*10,i*20,i*20);//ǰ�������겢��Բ��
        }
    }
    public static void main(String[] args){
        Test3 win = new Test3();
        win.setSize(500,500);
        win.setVisible(true);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}