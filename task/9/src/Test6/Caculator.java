package Test6;
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Caculator extends JApplet{
    JLabel aJLabel;
    JTextField aField,bField;
    JTextArea output;
    JButton action;
    public void init()
    {
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        aJLabel = new JLabel("请输入两个整型数据:");
        aField = new JTextField(5);
        bField = new JTextField(5);
        output = new JTextArea(5,20);
        action = new JButton("计算");
        action.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                int a,b;
                a = Integer.parseInt(aField.getText());
                b = Integer.parseInt(bField.getText());
                String s = a+"+"+b+"="+(a+b)+"\n";
                s+=a+"-"+b+"="+(a-b)+"\n";
                s+=a+"*"+b+"="+(a*b)+"\n";
                s+=a+"/"+b+"="+(a/b)+"\n";
                s+=a+"%"+b+"="+(a%b)+"\n";
                output.setText(s);
            }
        });
        output.setEditable(false);
        container.add(aJLabel);
        container.add(aField);
        container.add(bField);
        container.add(action);
        container.add(output);
    }
}
*/