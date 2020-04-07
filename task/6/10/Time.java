import java.text.DecimalFormat;
public class Time{
    private int hour;
    private int minute;
    private int second;
    private static DecimalFormat twoDigits = new DecimalFormat("00");
    public Time()
    {
        this(0,0,0);
    }
    public Time(int h)
    {
        this(h,0,0);
    }
    public Time(int h,int m)
    {
        this(h,m,0);
    }
    public Time(int h,int m,int s)
    {
        setTime(h,m,s);
    }
    public Time(Time time)
    {
        this(time.getHour(),time.getMinute(),time.getSecond());
    }
    public void setTime(int h,int m,int s)
    {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    public void setHour(int h)
    {
        hour = h;
    }
    public void setMinute(int m)
    {
        minute = m;
    }
    public void setSecond(int s)
    {
        second = s;
    }
    public int getHour()
    {
        return hour;
    }
    public int getMinute()
    {
        return minute;
    }
    public int getSecond()
    {
        return second;
    }
    public String toString()
    {
        String s;
        s=getSecond()+":"+twoDigits.format(getMinute())+":"+twoDigits.format(getSecond())+(getHour()<12?"AM":"PM");
        return s;
    }
}