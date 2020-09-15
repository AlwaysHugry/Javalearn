package String;

import javax.swing.JOptionPane;

public class Miscellaneous {
    public static void main(String[] args) {
        String s1 = "Lucre Kiwis";
        String output = "s1:" + s1 + "\n";
        output += "length of s1:" + s1.length() + '\n';
        output += "the reversed string is:";
        for (int count = s1.length() - 1; count >= 0; count--) {
            output += s1.charAt(count);
        }
        char array[] = new char[5];
        s1.getChars(0, 5, array, 0);//字符串转换为字符数组
        output += "\n";
        for(char c:array)
        {
            output += c;
        }
        JOptionPane.showMessageDialog(null, output, "String use", JOptionPane.INFORMATION_MESSAGE);
    }
}