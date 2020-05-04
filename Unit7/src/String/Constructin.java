package String;

public class Constructin {
    public static void main(String[] args)
    {
        char CharArray[] = {'L','u','c','r','e'};
        byte ByteArray[] = {(byte)'L',(byte)'u',(byte)'c',(byte)'r',(byte)'e'};
        String s1 = new String("Kiwis");
        String s2 = new String(CharArray,0,3);
        String s3 = new String(CharArray);
        String s4 = new String(ByteArray,0,2);
        String s5 = new String(ByteArray);
        System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4+'\n'+s5);
    }
}