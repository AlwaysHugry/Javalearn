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
        super("�ڲ����ʹ��:����һ������ƽ��");//����
        Container container = getContentPane();//����
        container.setLayout(new FlowLayout());//����
        aLabel = new JLabel("����һ����");//��ǩ
        aField = new JTextField(10);//�ı��ռ�,��������
        container.add(aLabel);
        container.add(aField);
        displayField = new JTextField(30);//������
        displayField.setEditable(false);//��������
        container.add(displayField);
        computeButton = new JButton("����ƽ��");//��ť
        container.add(computeButton);
        exitButton = new JButton("�˳�");
        container.add(exitButton);
        ActionEventHandler handler = new ActionEventHandler();//�����������
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

    private class ActionEventHandler implements ActionListener//�ڲ���
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource()==exitButton)//����˳���ť
            System.exit(0);
            else if(event.getSource()==computeButton)
            {
                String s = aField.getText();//���������ı�
                int a = Integer.parseInt(s);
                a = a*a;
                String  b  =String.valueOf(a);//ת�ı�
                displayField.setText(b);
            }
        }
    }
}