package StringBuilder;

import javax.swing.JOptionPane;

public class Constructor {
    public static void main(String[] args) {
        StringBuilder buffer1 = new StringBuilder();
        StringBuilder buffer2 = new StringBuilder(10);
        StringBuilder buffer3 = new StringBuilder("hello");
        String output = "buffer1=" + buffer1.toString() + "\n" + "buffer2=" + buffer2.toString() + "\nbuffer3="
                + buffer3.toString();
        JOptionPane.showMessageDialog(null, output, "构造方法", 1);
    }
}