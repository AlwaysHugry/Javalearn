import Time.Time;
import javax.swing.JOptionPane;
class TimeTest{
    public static void main(String []args)
    {
        Time t1 = new Time();
        String output = "t1��\n24ʱ�Ƹ�ʽʱ��:"+t1.toUniversalString()+"\n12ʱ�Ƹ�ʽʱ��:"+t1.toStandardString()+"\n";
        t1.setTime(13,27,6);
        output += "��������t1��ʱ��\n24ʱ�Ƹ�ʽʱ��:"+t1.toUniversalString()+"\n12ʱ�Ƹ�ʽʱ��:"+t1.toStandardString()+"\n";
        t1.run(14, 55, 55);
        output += "t1����һ��ʱ���\n24ʱ�Ƹ�ʽʱ��:"+t1.toUniversalString()+"\n12ʱ�Ƹ�ʽʱ��:"+t1.toStandardString()+"\n";
        JOptionPane.showMessageDialog(null,output,"����TIme��",JOptionPane.INFORMATION_MESSAGE);
    }
}
