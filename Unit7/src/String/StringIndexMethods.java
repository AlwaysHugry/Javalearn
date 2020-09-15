package String;

import javax.swing.JOptionPane;

public class StringIndexMethods {
    public static void main(String[] args) {
        String s = "abcdefghabcdefgh";
        String output = "";
        output += "s.indexOf(\"abc\")=" + s.indexOf("abc") + "\n";//从0开始找
        output += "s.indexOf(\"abc\",1)=" + s.indexOf("abc", 1) + "\n";//从指定位置开始找
        output += "s.indexOf(\"&&\")="+s.indexOf("&&")+"\n";
        output += "s.lastIndexOf(\"abc\")=" + s.lastIndexOf("abc") + "\n";//从后往前找
        JOptionPane.showMessageDialog(null, output, "indexOf()", 1);
    }
}