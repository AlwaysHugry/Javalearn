package InnerClassTest;

import java.text.DecimalFormat;
public class Time{
    private int hour;//只能能在类中使用
    protected int minute;//可以在子类与包中使用
    public int second;//可以在类外使用
    int count;//只能在包中使用
    public Time()//重载构造方法,形参必须有个数或类型的不同
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
    public String toString()//重载toString
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