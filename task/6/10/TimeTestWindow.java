import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TimeTestWindow extends JFrame{
    private Time time;
    private JLabel hourLabel,minuteLabel,secondLabel ;
    private JTextField hourField,minuteField,secondField,displayField;
    public TimeTestWindow()
    {
        super("Ƕ���ڲ���ʹ������");
        time= new Time();
        createGUI();
        registerEventHandlers();
    }
    private void createGUI()
    {
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        hourLabel = new JLabel("����ʱ��:");
        hourField = new JTextField(10);
        container.add(hourLabel);
        container.add(hourField);
        minuteField = new JLabel("���÷�:");
        minuteField = new JTextField(10);
        container.add(minuteLabel);
        container.add(minuteField);
        secondLabel = new JLabel("������:");
        secondField = new JTextField(10);
        container.add(secondLabel);
        containeradd(secondField);
        displayField = new JTextField(30);
        displayField.setEditable(false);
        container.add(displayField);
    }
    private void registerEventHandlers()
    {
        ActionEventHandler handler = new ActionEventHandler();
        hourField.addActionListener(handler);
        minuteField.addActionListener(handler);
        secondField.addActionListener(handler);
    }
    private class ActionEventHandler implements ActionListener{
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource()==hourField)
            {
                time.setHour(Integer.parseInt(event.getActionCommand()));
            }
            else if(event.getSource()==minuteField)
            {
                time.setMinute(Integer.parseInt(event.getActionCommand()));
            }
            else if(event.getSource()==secondField)
            {
                time.setSecond(Integer.parseInt(event.getActionCommand()));
            }
            displayTime();
        }
    }
    public void displayTime()
    {
        displayField.setText("ʱ����:"+time);
    }
    public static void main(String[] args)
    {
        TimeTestWindow window = new TimeTestWindow();
        window.addWindowListener(
            newWindowAdapter(){
                public void windowClosing(WindowEvent event)
                {
                    System.exit(0);
                }
            }
        );
        window.setSize(550,150);
        window.setVisible(true);
    }
}