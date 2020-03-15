
class Test16{
    public static void main(String[] args){
        double a=16*arctan(1/5.0),b=4*arctan(1/239.0);
        System.out.println("pi="+(a-b));
    }
    static double arctan(double x)
    {
        double sum=0;
        double v=x;
        int t=1;
        double s=t*v/1;
        for(int i=1;Math.abs(s)>1e-15;i++)
        {
            sum+=s;
            v*=x*x;
            t*=-1;
            s=(t*v)/(2*i+1);
        }
        return sum;
    }
}