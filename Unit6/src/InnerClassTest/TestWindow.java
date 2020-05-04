package InnerClassTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
final class TestWindow extends JFrame{
    /**
     * don't worry
     */
    private static final long serialVersionUID = 1L;
    private JLabel aLabel;
    private JTextField aField,displayField;
    private JButton computeButton,exitButton;
    public TestWindow()
    {
        super("内部类的使用:计算一个属的平方");//标题
        Container container = getContentPane();//容器
        container.setLayout(new FlowLayout());//布局
        aLabel = new JLabel("输入一个数");//标签
        aField = new JTextField(10);//文本空间,输入数字
        container.add(aLabel);
        container.add(aField);
        displayField = new JTextField(30);//输出结果
        displayField.setEditable(false);//不可输入
        container.add(displayField);
        computeButton = new JButton("计算平方");//按钮
        container.add(computeButton);
        exitButton = new JButton("退出");
        container.add(exitButton);
        ActionEventHandler handler = new ActionEventHandler();//点击操作回馈
        computeButton.addActionListener(handler);
        exitButton.addActionListener(handler);
        setSize(400,150);
        setVisible(true);
    }

    public static void main(String []args)
    {
        TestWindow win =new TestWindow();
        System.out.println(win);
    }

    private class ActionEventHandler implements ActionListener//内部类
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource()==exitButton)//点击退出按钮
            System.exit(0);
            else if(event.getSource()==computeButton)
            {
                String s = aField.getText();//输入栏的文本
                int a = Integer.parseInt(s);
                a = a*a;
                String  b  =String.valueOf(a);//转文本
                displayField.setText(b);
            }
        }
    }
}