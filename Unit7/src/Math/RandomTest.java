package Math;

import java.util.*;
public class RandomTest{
    public static void main(String[] args)
    {
        Random random = new Random();
        System.out.println("0~6���������:"+random.nextInt(6));
        System.out.println("�������:"+random.nextInt());
        System.out.println("���������:"+random.nextFloat());//0~1
    }
}