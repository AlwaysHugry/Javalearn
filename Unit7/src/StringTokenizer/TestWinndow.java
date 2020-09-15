package StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;
import java.util.StringTokenizer;

public class TestWinndow extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JLabel aLabel;
    private JTextField inputString;
    private JTextArea outputString;
    public TestWinndow()
    {
        super("Test the StringTokenizer");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        aLabel = new JLabel("ÇëÊäÈë×Ö·û´®:");
        inputString = new JTextField(15);
        outputString =new JTextArea(10,20);
        outputString.setEditable(false);
        container.add(aLabel);
        inputString.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                StringTokenizer tokens = new StringTokenizer(inputString.getText());
                outputString.setText("");
                while(tokens.hasMoreTokens())
                {
                    outputString.append(tokens.nextToken()+"\n");
                }
            }
        });
        container.add(inputString);
        container.add(outputString);
        setSize(400,200);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        TestWinndow win = new TestWinndow();
        System.out.println(win);
    }
}