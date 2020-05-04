package InnerClassTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TimeTestWindow extends JFrame{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JLabel aLabel, bLabel, cLabel;// "set hour","set minute","set second"
    private JTextField hourField,minuteField,secondField,displayField;
    private Time t;

    public TimeTestWindow()
    {
        super("Time Test Window!");
        t = new Time();
        Container container = getContentPane();
        container.setLayout(new FlowLayout());//²¼¾Ö
        aLabel = new JLabel("set hour:");
        displayField = new JTextField(20);
        displayField.setEditable(false);
        container.add(aLabel);
        hourField = new JTextField(10);
        hourField.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event)
            {
                String s = hourField.getText();
                int a = Integer.parseInt(s);
                t.setHour(a);
                displayField.setText(t.toString());
            }
        });
        container.add(hourField);
        bLabel = new JLabel("set minute:");
        container.add(bLabel);
        minuteField = new JTextField(10);
        minuteField.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event)
            {
                String s = minuteField.getText();
                int a = Integer.parseInt(s);
                t.setMinute(a);
                displayField.setText(t.toString());
            }
        });
        container.add(minuteField);
        cLabel = new JLabel("set second:");
        container.add(cLabel);
        secondField = new JTextField(10);
        secondField.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event)
            {
                String s = secondField.getText();
                int a = Integer.parseInt(s);
                t.setSecond(a);
                displayField.setText(t.toString());
            }
        });
        container.add(secondField);
        container.add(displayField);
        setSize(400,200);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        TimeTestWindow win = new TimeTestWindow();
        System.out.println(win);
    }
    
}