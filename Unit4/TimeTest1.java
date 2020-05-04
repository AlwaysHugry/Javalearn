
import Time.*;
import javax.swing.*;//导入JOptionPane类
class TimeTest1{
    public static void main(String[] args) 
    {
        Time1 a = new Time1();
        Time1 b = new Time1(2);//02:00:00
        Time1 c = new Time1(21,34);//21:34:00
        Time1 d = new Time1(12,25,42);//12:25:42
        Time1 e = new Time1(d);//copy构造函数
        String s = a.toString() +'\n'+ b.toString() +'\n'+ c.toString() +'\n'+ d.toString() +'\n'+ e.toString() ;
        JOptionPane.showMessageDialog(null,s,"构造函数调用",JOptionPane.INFORMATION_MESSAGE);
    }
}