class Test5{
    public static void main(String[] args){
        double x=2.5;
        int a=7,b=3;
        float y=4.7f;
        System.out.println("x+a%b*(int)(x+y)%2="+(x+a%b*(int)(x+y)%2));
        System.out.println("(float)(a+b)/2+(int)x%(int)y="+((float)(a+b)/2+(int)x%(int)y));
    }
}