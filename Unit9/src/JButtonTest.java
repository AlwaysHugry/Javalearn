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
        Container container = getContentPane();//中间容器
        container.setLayout(new FlowLayout());//布局
        plainButton  = new JButton("文本按钮");
        container.add(plainButton);
        plainButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event)
            {
                JOptionPane.showMessageDialog(JButtonTest.this, "你按下的是:"+event.getActionCommand());
            }
        });
        Icon image1 = new ImageIcon(getClass().getResource("Images.png"));
        fancyButton = new JButton("文本图像按钮",)
    }
}
*/