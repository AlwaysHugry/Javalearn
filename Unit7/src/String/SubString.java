package String;

import javax.swing.JOptionPane;

public class SubString {
    public static void main(String[] args)
    {
        String s ="abcdefghabcdefgh";
        String output = "";
        output += "��ȡ10��ĩβ���ַ���:"+s.substring(10)+"\n";
        output += "��ȡ3~6���ַ���:"+s.substring(3, 6);
        JOptionPane.showMessageDialog(null, output, "Substring()", 1);
    }
}