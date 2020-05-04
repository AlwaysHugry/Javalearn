package Math;

import java.util.*;
public class RandomTest{
    public static void main(String[] args)
    {
        Random random = new Random();
        System.out.println("0~6的随机整数:"+random.nextInt(6));
        System.out.println("随机整数:"+random.nextInt());
        System.out.println("随机浮点数:"+random.nextFloat());//0~1
    }
}