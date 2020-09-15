package src;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class JColorChooserTest extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = -2455090092556278882L;
    private JButton changeColorButton;
    private Color color = Color.lightGray;
    private Container container;

    public JColorChooserTest()
    {
        super("Using JColorChooser !");

        container = getContentPane();
        container.setLayout(new FlowLayout());

        changeColorButton = new JButton("Change Color");
        changeColorButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event)
            {
                color = JColorChooser.showDialog(JColorChooserTest.this, "Choose a color", Color.red);
                if(color == null)
                color = Color.lightGray;
                container.setBackground(color);
            }
        });
        container.add(changeColorButton);

        setSize(400,300);
        setVisible(true);
    }

    public static void main(String []args)
    {
        JColorChooserTest win = new JColorChooserTest();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}