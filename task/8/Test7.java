import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Test7 extends JFrame {
    FillGradientPanel fillGradientPanel = new FillGradientPanel(); // ����������ʵ��
    public static void main(String args[]) { // ������
        Test7 frame = new Test7(); // �����������ʵ��
        frame.setVisible(true); // ��ʾ����
    }
    
    public Test7() {
        super(); // ���ó���Ĺ��췽��
        setTitle("Ϊͼ����佥��ɫ"); // �������
        setBounds(100, 100, 340, 360); // �������ʾλ�úʹ�С
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ����رշ�ʽ
        add(fillGradientPanel); // ��������ʵ����ӵ�����������
    }
    
    class FillGradientPanel extends JPanel { // �����ڲ������
        public void paint(Graphics g) { // ��дpaint()����
            Graphics2D g2 = (Graphics2D) g; // ���Graphics2D����
            Rectangle2D.Float rect = new Rectangle2D.Float(20, 20, 280, 280);// �������ζ���
            // ����ѭ�������GraphientPaint����
            GradientPaint paint = new GradientPaint(5,40,Color.RED,15,50,Color.YELLOW,true);
            g2.setPaint(paint);// ���ý���
            g2.fill(rect);// ���ƾ���
        }
    }
}
