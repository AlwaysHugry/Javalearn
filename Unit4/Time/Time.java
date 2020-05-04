package Time;

public class Time//�����ڰ���importʹ��,����public��ֻ���ڰ���ʹ��
{
    private int hour ;
    private int minute;
    private int second;
    public void setTime(int h,int m,int s)
    {
        hour = ((h>=0&&h<24)?h:0);
        minute = ((m>=0&&m<60)?m:0);
        second = ((s>=0&&s<60)?s:0);//ȷ���Ϸ�
    }
    public Time()
    {
        setTime(0,0,0);
    }
    public Time(int hour,int minute,int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;//�����β������Ա��������,����ͨ��thisָ�����
        setTime(hour,minute,second);
    }
    public String toUniversalString()//���ع��ʱ�׼ʱ����ʽ
    {
        return hour+":"+minute+":"+second;
    } 
    public String toStandardString()
    {
        return (hour%12)+":"+minute+":"+second+" "+(hour>=12?"PM":"AM");
    }
    public void run(int h,int m,int s)//��ʱ
    {
        int add = 0,add1=0;//��λ
        add = (second + s) > 59 ? 1:0;
        second= (second+s)%60; 
        add1 = (minute + m +add) >59? 1:0;
        minute =(minute+m+add)%60;
        hour = ( hour + h + add1)%24;
    }
}