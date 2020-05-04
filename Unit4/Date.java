class Date{
    private int year;
    private int month;
    private int day;

    public Date(int y,int m,int d)
    {
        year = y;
        month = checkMonth(m);
        day = checkDay(d);
    }

    private int checkMonth(int m)
    {
        if(m > 0 && m <= 12)
        {
            return m;
        }
        else{
            System.out.println("Invalid month!");
            return 0;
        }
    }
    private int checkDay(int d)
    {
        int m[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(d > 0&&d <= m[month])
        return d;
        if(month == 2&&d == 29 &&(year%400==0||(year%4==0&&year%100!=0)))
        return d;
        System.out.println("Invalid day!");
        return 0;
    }
    public String toString()
    {
        return month+"/"+day+"/"+year;
    }
}