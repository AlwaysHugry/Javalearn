package Math;

public class FinalNumber {
    public static void main(String[] args)
    {
        System.out.println("MATH.E="+Math.E);
        System.out.println("Math.round(Math.E)="+Math.round(Math.E));//四舍五入取整
        System.out.println("Math.PI="+Math.PI);
        System.out.println("Math.ceil(E)="+Math.ceil(Math.E));//向上取整精度数
        System.out.println("Math.floor(E)="+Math.floor(Math.E));//向下取整精度数
        System.out.println("Math.rint(Math.PI)="+Math.rint(Math.PI));
        System.out.println("lne="+Math.log(Math.E));//取自然对数值
        System.out.println("sin(pi/4)="+Math.sin(Math.PI/4));
        System.out.println("Math.random()="+Math.random());//0~1之间随机数
        System.out.println((int)(Math.random()*100));//0~100随机整数
    }
}