import java.awt.Graphics;
import javax.swing.JApplet;
public class WelcomeApplet extends JApplet{//�̳�,�ұ�������ΪPublic
    public void paint(Graphics g)
    {
        super.paint(g);//����Applet��paint����,��һ��Graphics
        g.drawString("Welcome JavaApplet!",25,25);//���ú�����һ���ַ���
    }
}