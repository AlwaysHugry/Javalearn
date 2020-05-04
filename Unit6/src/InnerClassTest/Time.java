package InnerClassTest;

import java.text.DecimalFormat;
public class Time{
    private int hour;//ֻ����������ʹ��
    protected int minute;//���������������ʹ��
    public int second;//����������ʹ��
    int count;//ֻ���ڰ���ʹ��
    public Time()//���ع��췽��,�βα����и��������͵Ĳ�ͬ
    {
        setTime(0,0,0);
    }
    public Time(int h)
    {
        setTime(h,0,0);
    }
    public Time(int h,int m)
    {
        setTime(h,m,0);
    }
    public Time(int h,int m,int s)
    {
        setTime(h,m,s);
    }
    public Time(Time s)
    {
        setTime(s.hour,s.minute,s.second);
    }
    
    public void setTime()
    {
        setTime(0,0,0);
    }
    public void setTime(int h,int m,int s)
    {
        hour = ((h>=0&&h<24)?h:0);
        minute = ((m>=0&&m<60)?m:0);
        second = ((s>=0&&s<60)?s:0);
    } 
    public void showTime()
    {
        System.out.println(hour+":"+minute+":"+second);
    }
    public String toString()//����toString
    {
        DecimalFormat twodigits = new DecimalFormat("00");
        return twodigits.format(hour)+":"+twodigits.format(minute)+":"+twodigits.format(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int h) {
        hour = ((h>=0&&h<24)?h:0);
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int m) {
        minute = ((m>=0&&m<60)?m:0);
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int s) {
        second = ((s>=0&&s<60)?s:0);
    }
}