import java.util.Scanner;

//����1�����ڵ��ַ������͵ı���rq��
//�����ڰ���yyyy-MM-dd��ʽ����2019-05-06��ʾ2019��05��06�գ�
//�����������ڱ�ʾ����һ���Ǹ���ݵĵڼ��죿
//дһJava����ʵ�ִ˹��ܡ�
//���磬������2019-03-18 ���������2019��ĵ�31+28+18=77�졣
public class Test1 {
    public static boolean isLeapYear(int y)
    {
        if(y%4==0&&y%100!=0)
        {
            return true;
        }
        else if(y%400==0)
        {
            return true;
        }
        else return false;
    }
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        String s = input.next();
        String t[] = s.split("-");
        int year = Integer.parseInt(t[0]);
        int month = Integer.parseInt(t[1]);
        int day = Integer.parseInt(t[2]);
        int dayOfMonth1[] ={31,28,31,30,31,30,31,31,30,31,30,31};
        int dayOfMonth2[] ={31,29,31,30,31,30,31,31,30,31,30,31};
        if(isLeapYear(year))//������
        {
            sum = 0;
            for(int i = 0;i<month-1;i++)
            {
                sum +=dayOfMonth2[i];
            }
            sum +=day;
        }
        else//������
        {
            sum = 0;
            for(int i = 0;i<month-1;i++)
            {
                sum +=dayOfMonth1[i];
            }
            sum +=day;
        }
        System.out.println(sum);
        input.close();
    }
}