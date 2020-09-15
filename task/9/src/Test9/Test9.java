package Test9;

import javax.swing.*;
import java.awt.*;


public class Test9 extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private GridBagLayout layout;
    private GridBagConstraints constraints;
    private Container container;
    public Test9()
    {
        super("Test9");
        container = getContentPane();
        layout = new GridBagLayout();
        container.setLayout(layout);
        constraints = new GridBagConstraints();
        String stu[] ={"��ѧ��","��ѧ��","Сѧ��"};
        JComboBox<String> comboBox = new JComboBox<String>(stu);
        JTextField textField =  new JTextField("�ı���");
        String fonts[] = {"����","����"};
        JList<String> list = new JList<String>(fonts);
        String names[] = {"��ť0","��ť1","��ť2","��ť3","��ť4"};
        JButton buttons[] = new JButton[names.length];
        for(int count = 0;count < buttons.length;count++)
        {
            buttons[count] = new JButton(names[count]);
        }
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        addComponent(textField);
        constraints.gridwidth = 1;
        addComponent(buttons[0]);
        constraints.gridwidth = GridBagConstraints.RELATIVE;
        addComponent(buttons[1]);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        addComponent(buttons[2]);
        constraints.weightx = 0;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        addComponent(comboBox);
        constraints.weighty = 1;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        addComponent(buttons[3]);
        constraints.gridwidth = GridBagConstraints.RELATIVE;
        addComponent(buttons[4]);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        addComponent(list);
        setSize(300,300);
        setVisible(true);
    }
    public void addComponent(Component com)
    {
        layout.setConstraints(com, constraints);
        container.add(com);
    }
    public static void main(String[] args)
    {
        Test9 win = new Test9();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}