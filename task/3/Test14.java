class Test14{
    public static void main(String[] args)
    {
        int a,b,c;
        for(int i=100;i<1000;i++)
        {
            a=i/100;
            b=(i/10)%10;
            c=i%10;
            if(a*a*a+b*b*b+c*c*c==i)
            System.out.println(i);
        }
    }
}