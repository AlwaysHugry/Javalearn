class VarargsTest{
    static float average(float...numbers)//可变参量
    {
        float sum=0.0f;
        for(float e:numbers)
        sum+=e;
        return sum/numbers.length;
    }
    public static void main(String[] args)
    {
        float a = 10.0f;
        float b = 2.3f;
        float c = 5.6f;
        float d = 7.2f;
        System.out.println(a+" "+b+"的平均值为:"+average(a,b));
        System.out.println(a+" "+b+" "+c+" "+" "+d+"的平均值为:"+average(a,b,c,d));
    }
}