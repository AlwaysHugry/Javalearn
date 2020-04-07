import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TimeTestWindow extends JFrame{
    private Time time;
    private JLabel hourLabel,minuteLabel,secondLabel ;
    private JTextField hourField,minuteField,secondField,displayField;
    public TimeTestWindow()
    {
        super("嵌套内部类使用例子");
        time= new Time();
        createGUI();
        registerEventHandlers();
    }
    private void createGUI()
    {
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        hourLabel = new JLabel("设置时间:");
        hourField = new JTextField(10);
        container.add(hourLabel);
        container.add(hourField);
        minuteField = new JLabel("设置分:");
        minuteField = new JTextField(10);
        container.add(minuteLabel);
        container.add(minuteField);
        secondLabel = new JLabel("设置秒:");
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
        displayField.setText("时间是:"+time);
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