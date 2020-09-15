package String;

import javax.swing.JOptionPane;

public class ValueOf {
    public static void main(String[] args)
    {
        String s = String.valueOf(false);//能转换所有类型的变量
        String output = "false:" + s +"\n";
        s = String.valueOf(1234);
        output += "1234:" + s +'\n';
        JOptionPane.showMessageDialog(null, output);
    }
}