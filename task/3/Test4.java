class Test4{
    public static void main(String[] args){
        int a=3,b=-5;
        boolean f=true;
        System.out.println("--a%b++="+(--a%b++));
        System.out.println("(a>=1&&a<=12?a:b)="+(a>=1&&a<=12?a:b));
        System.out.println("f^(a>b)="+(f^(a>b)));
        System.out.println("(--a)<<a="+((--a)<<a));
        System.out.println("(a+=a),a="+a);
        a=3;
        System.out.println("a*=2+3,a="+a);
        a=3;
        System.out.println("(a!=b)&&(3==2+1)||(4<2+5)="+((a!=b)&&(3==2+1)||(4<2+5)));
    }
}