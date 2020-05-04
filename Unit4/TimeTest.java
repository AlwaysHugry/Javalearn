import Time.Time;
import javax.swing.JOptionPane;
class TimeTest{
    public static void main(String []args)
    {
        Time t1 = new Time();
        String output = "t1的\n24时制格式时间:"+t1.toUniversalString()+"\n12时制格式时间:"+t1.toStandardString()+"\n";
        t1.setTime(13,27,6);
        output += "重新设置t1的时间\n24时制格式时间:"+t1.toUniversalString()+"\n12时制格式时间:"+t1.toStandardString()+"\n";
        t1.run(14, 55, 55);
        output += "t1过了一段时间的\n24时制格式时间:"+t1.toUniversalString()+"\n12时制格式时间:"+t1.toStandardString()+"\n";
        JOptionPane.showMessageDialog(null,output,"测试TIme类",JOptionPane.INFORMATION_MESSAGE);
    }
}
