import java.util.Scanner;

//输入1个日期到字符串类型的变量rq中
//（日期按照yyyy-MM-dd格式表达，如2019-05-06表示2019年05月06日）
//请求出这个日期表示的这一天是该年份的第几天？
//写一Java程序实现此功能。
//例如，输入如2019-03-18 ，则该日是2019年的第31+28+18=77天。
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
        if(isLeapYear(year))//是闰年
        {
            sum = 0;
            for(int i = 0;i<month-1;i++)
            {
                sum +=dayOfMonth2[i];
            }
            sum +=day;
        }
        else//是闰年
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