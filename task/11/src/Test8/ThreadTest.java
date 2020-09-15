package src.Test8;

import java.awt.*;
import java.awt.event.*;




public class ThreadTest extends WindowAdapter implements ActionListener {
    Frame f;
    static ThreadTest.Thread3 wt1, wt2;

    public static void main(String[] args) {
        ThreadTest win = new ThreadTest();
        win.display();
        wt1 = win.new Thread3("Welcome");
        wt2 = win.new Thread3("How are you?");
        wt2.start();
        wt2.setButton();
    }

    public void display() {
        f = new Frame("Welcome");
        f.setSize(400, 250);
        f.setLocation(200, 140);
        f.setBackground(Color.lightGray);
        f.setLayout(new GridLayout());
        f.addWindowListener(this);
        f.setVisible(true);
    }

    public class Thread3 extends Thread {
        Panel p1;
        Label lb1;
        TextField tf1, tf2;
        Button b1, b2;
        int sleeptime = (int) (Math.random() * 100);

        public Thread3(String s) {
            super(s);
            for (int i = 0; i < 100; i++) {
                s += " ";
            }
            tf1 = new TextField(s);
            f.add(tf1);
            p1 = new Panel();
            p1.setLayout(new FlowLayout(FlowLayout.LEFT));
            lb1 = new Label("Sleep");
            tf2 = new TextField("" + sleeptime);
            p1.add(lb1);
            p1.add(tf2);
            b1 = new Button("Start");
            b2 = new Button("Stop");
            p1.add(b1);
            p1.add(b2);
            b1.addActionListener(new ThreadTest());
            b2.addActionListener(new ThreadTest());
            f.add(p1);
            f.setVisible(true);
        }

        public void run()
        {
            String str;
            while(true)
            {
                try{
                    str = tf1.getText();
                    str = str.substring(1)+str.substring(0,1);
                    tf1.setText(str);
                    Thread3.sleep(sleeptime);
                }
                catch(InterruptedException e)
                {
                    break;
                }
            }
        }
        public void setButton() {
            if (this.isAlive())
                b1.setEnabled(false);
            if (this.isInterrupted())
                b2.setEnabled(false);
        }
    }
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
    public void actionPerformed(ActionEvent e)
    {
        if((e.getSource()==wt1.b1)||(e.getSource()==wt1.b2))
        actionPerformed(e,wt1);
        if((e.getSource()==wt2.b1)||(e.getSource()==wt2.b2))
        actionPerformed(e,wt2);
    }
    public void actionPerformed(ActionEvent e,Thread3 w)
    {
        if(e.getSource()==w.b1)
        {
            w.sleeptime = Integer.parseInt(w.tf2.getText());
            w.start();
        }
        if(e.getSource()==w.b2)
        w.interrupt();
        w.setButton();
    }
}