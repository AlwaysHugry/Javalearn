/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.rmi.activation.ActivationDesc;

public class JButtonTest extends JFrame{
    private JButton  plainButton , fancyButton;
    public JButtonTest()
    {
        super("JButton's Programer Design");
        Container container = getContentPane();//�м�����
        container.setLayout(new FlowLayout());//����
        plainButton  = new JButton("�ı���ť");
        container.add(plainButton);
        plainButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event)
            {
                JOptionPane.showMessageDialog(JButtonTest.this, "�㰴�µ���:"+event.getActionCommand());
            }
        });
        Icon image1 = new ImageIcon(getClass().getResource("Images.png"));
        fancyButton = new JButton("�ı�ͼ��ť",)
    }
}
*/