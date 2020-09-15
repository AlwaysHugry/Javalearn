package String;

import javax.swing.JOptionPane;

public class Compare {
    public static void main(String[] args)
    {
        String s1 = "Hello";
        String s2 = "goodbye";
        String s3 = "Happy Birthday";
        String s4 = "Happy birthday";
        String output = "s1="+s1+"\ns2="+s2+"\ns3="+s3+"\ns4="+s4+'\n';
        output += "s1.equals(\"hello\")="+s1.equals("hello")+"\n";
        output += "s3.equalsIgnoreCase(s4)"+s3.equalsIgnoreCase(s4)+"\n";
        output += "s1.compareTo(s2)="+s1.compareTo(s2)+"\n";
        output += "s1.compareTo(s1)="+s1.compareTo(s1)+"\n";
        output += "s2.compareTo(s1)="+s2.compareTo(s1)+"\n";
        output += "s3.compareTo(s4)="+s3.compareTo(s4)+"\n";
        output += "s4.compareTo(s3)="+s4.compareTo(s3)+"\n";
        JOptionPane.showMessageDialog(null, output);
    }
}