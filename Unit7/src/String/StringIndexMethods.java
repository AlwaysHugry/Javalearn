package String;

import javax.swing.JOptionPane;

public class StringIndexMethods {
    public static void main(String[] args) {
        String s = "abcdefghabcdefgh";
        String output = "";
        output += "s.indexOf(\"abc\")=" + s.indexOf("abc") + "\n";//��0��ʼ��
        output += "s.indexOf(\"abc\",1)=" + s.indexOf("abc", 1) + "\n";//��ָ��λ�ÿ�ʼ��
        output += "s.indexOf(\"&&\")="+s.indexOf("&&")+"\n";
        output += "s.lastIndexOf(\"abc\")=" + s.lastIndexOf("abc") + "\n";//�Ӻ���ǰ��
        JOptionPane.showMessageDialog(null, output, "indexOf()", 1);
    }
}