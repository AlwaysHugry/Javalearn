import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Test extends JFrame{
    private String name;
    private JLabel nameLabel;
    private JTextField nameField , displayField ;
    private JButton exitButton ;
    public Test()
    {
        super("Inner Class Demonstration");
        Container container = getContentPane();
        container.setLayout( new FlowLayout());
        nameLabel = new JLabel("–’√˚");
        nameField = new JTextField(20);
        container.add(nameLabel);
        container.add(nameField);
        displayField = new JTextField(30);
        displayField.setEditable(false);
        container.add(exitButton);
        ActionEventhandler handler =  new ActionEventhandler();
        nameField.addActionListener(handler);
        exitButton.addActionListener(handler);
    }
    public void displayName()
    {
        displayField.setText("–’√˚ «:"+name);
    }
    public static void main(String[] args)
    {
        Test window = new Test();
        window.setSize(400,150);
        window.setVisible(true);
    }
    private class ActionEventhandler implements ActionListener{
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource()==exitButton)
            System.exit(0);
            else if(event.getSource()==nameField)
            {
                name = event.getActionCommand();
                nameField.setText("");
            }
            displayName();
        }
    }
}