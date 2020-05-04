package Time;

public class Time//可以在包外import使用,而非public类只能在包内使用
{
    private int hour ;
    private int minute;
    private int second;
    public void setTime(int h,int m,int s)
    {
        hour = ((h>=0&&h<24)?h:0);
        minute = ((m>=0&&m<60)?m:0);
        second = ((s>=0&&s<60)?s:0);//确保合法
    }
    public Time()
    {
        setTime(0,0,0);
    }
    public Time(int hour,int minute,int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;//对于形参量与成员变量重名,可以通过this指针调用
        setTime(hour,minute,second);
    }
    public String toUniversalString()//返回国际标准时间形式
    {
        return hour+":"+minute+":"+second;
    } 
    public String toStandardString()
    {
        return (hour%12)+":"+minute+":"+second+" "+(hour>=12?"PM":"AM");
    }
    public void run(int h,int m,int s)//走时
    {
        int add = 0,add1=0;//进位
        add = (second + s) > 59 ? 1:0;
        second= (second+s)%60; 
        add1 = (minute + m +add) >59? 1:0;
        minute =(minute+m+add)%60;
        hour = ( hour + h + add1)%24;
    }
}