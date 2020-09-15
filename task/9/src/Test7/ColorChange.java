package Test7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChange extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JButton button;
    private Color color;
    public ColorChange()
    {
        super("Change Color");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        button = new JButton("Change Color");
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                color = JColorChooser.showDialog(ColorChange.this, "Choose a color", color);
                if(color == null)
                {
                    color = Color.LIGHT_GRAY;
                }
                container.setBackground(color);
            }
        });
        container.add(button);
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String []args)
    {
        ColorChange win = new ColorChange();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}