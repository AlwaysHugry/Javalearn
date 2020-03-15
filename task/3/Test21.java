public class Test21{
    public static void main(String[] args)
    {
        long a,b,s;
        a=1;
        b=-1;
        System.out.printf("128位的原数: %016x%016x\n",a,b);
        s=(b>>>63)&1;
        a=(a<<1)+b;
        b=b<<1;
        System.out.prinf("扩大2倍后的结果:%016x%016x",a,b);
    }
}