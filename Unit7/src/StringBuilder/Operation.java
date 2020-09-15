package StringBuilder;

public class Operation {
    public static void main(String[] args) {
        char charArray[] = { 'a', 'r', 'e', ' ', 'e', 'f' };
        String s = "Student";
        StringBuilder buffer1 = new StringBuilder();
        StringBuilder buffer2 = new StringBuilder("You");
        buffer1.append(buffer2);
        buffer1.append(' ');
        buffer1.append(charArray,0,4);
        buffer1.append("a ");
        buffer1.append(s);
        System.out.println(buffer1.toString());
        buffer1.insert(10,"good ");
        System.out.println(buffer1.toString());
        buffer1.replace(10, 14, "best");//Ìæ»»10~13(14-1)µÄ×Ö·û´® 
        System.out.println(buffer1);
        buffer1.setLength(5);//reset length of string
        System.out.println(buffer1);
    }
}