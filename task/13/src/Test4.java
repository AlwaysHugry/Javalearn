import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test4 extends JFrame{
    private JTextField enter;
    private JTextArea display;
    private DatagramSocket socket;
    public Test4() {
        super("聊天界面");


        Container container = getContentPane();
        enter = new JTextField(20);
        enter.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event)
                    {
                        try {
                            String message = event.getActionCommand();
                            byte data[] = message.getBytes();
                            DatagramPacket send1 = new DatagramPacket(data,
                                    data.length,InetAddress.getLocalHost(),6000);
                            displayMessage("\n已发送消息:"+new String(send1.getData(),0,send1.getLength()));

                            socket.send(send1);
                        }
                        catch(IOException ioException){
                            ioException.printStackTrace();

                        }
                    }
                }
        );
        JPanel jpanel1 = new JPanel();
        jpanel1.add(new JLabel("输入要发送的信息："));
        jpanel1.add(enter);
        container.add(jpanel1,BorderLayout.NORTH);
        display = new JTextArea();
        container.add(new JScrollPane(display),BorderLayout.CENTER);



        getContentPane().add( new JScrollPane(display),
                BorderLayout.CENTER);
        setSize(400,300);
        setVisible(true);
        try {
            socket = new DatagramSocket(5000);
        }
        catch(SocketException socketException) {
            socketException.printStackTrace();
            System.exit(1);
        }
    }
    private void waitForPackets() {
        while(true) {
            try {

                byte data[] = new byte[100];
                DatagramPacket receive1 = new DatagramPacket(data,data.length);
                socket.receive(receive1);  //等待数据包
                //将接收的数据包显示
                displayMessage("\n小红对你说:"+
                        new String(receive1.getData(),0,receive1.getLength())
                );

            }
            catch(IOException ioException){
                displayMessage(ioException.toString() + "\n");
                ioException.printStackTrace();
            }
        }
    }

    private void sendPacketToClient(DatagramPacket receive1) throws IOException
    {
        DatagramPacket sendPacket = new DatagramPacket(
                receive1.getData(),receive1.getLength(),receive1.getAddress(),receive1.getPort());
        socket.send(sendPacket);
    }
    private void displayMessage(final String messageToDisplay)
    {
        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run()
                    {
                        display.append(messageToDisplay);
                        display.setCaretPosition(display.getText().length());
                    }
                }
        );
    }
    public static void main(String args[])
    {
        Test4 app = new Test4();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.waitForPackets();
    }
}
