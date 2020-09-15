package String;

import javax.swing.JOptionPane;

public class SubString {
    public static void main(String[] args)
    {
        String s ="abcdefghabcdefgh";
        String output = "";
        output += "½ØÈ¡10µ½Ä©Î²µÄ×Ö·û´®:"+s.substring(10)+"\n";
        output += "½ØÈ¡3~6µÄ×Ö·û´®:"+s.substring(3, 6);
        JOptionPane.showMessageDialog(null, output, "Substring()", 1);
    }
}