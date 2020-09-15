package Test8;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ChangeColors extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
   // private JButton button;
    private Color color[] = {Color.red,Color.yellow,Color.blue,Color.cyan};
    private Color selectedColor = Color.red;
    private String  colorString[] = {"Red","Yellow","Blue","Cyan"};
    JCheckBox checkBox1,checkBox2;
    JComboBox<Object> combobox;
    JButton okButton , exitButton;
    private Container container;
    public ChangeColors()
    {
        super("Color—°‘Ò");
        container = getContentPane();
        container.setLayout(new GridLayout(3,1,5,5));
        JPanel jPanel1,jPanel2;
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        combobox = new JComboBox<Object>(colorString);
        combobox.setMaximumRowCount(3);
        combobox.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent event)
            {
                 if(event.getStateChange()==ItemEvent.SELECTED)
                 selectedColor = color[combobox.getSelectedIndex()];
            }
        });
        container.add(combobox);
        checkBox1 = new JCheckBox("background");
        jPanel1.add(checkBox1);
        checkBox2 = new JCheckBox("foreground");
        jPanel1.add(checkBox2);
        container.add(jPanel1);
        okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                if(checkBox1.isSelected())
                combobox.setBackground(selectedColor);
                if(checkBox2.isSelected())
                combobox.setForeground(selectedColor);
            }
        });
        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event)
            {
                System.exit(0);
            }
        });
        jPanel2.add(okButton);
        jPanel2.add(exitButton);
        container.add(jPanel2);
        container.setSize(400,150);
        setVisible(true);
    }
    public static void main(String []args)
    {
        ChangeColors win = new ChangeColors();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}