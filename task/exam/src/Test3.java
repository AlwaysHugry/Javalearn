
import java.util.Scanner;
import java.util.*;
public class Test3 {
     public static void main(String args[])
     {
         Scanner input = new Scanner(System.in);
         Integer arry[] = new Integer[6];
         for(int i = 0;i<6;i++)
         {
            arry[i] = input.nextInt();
         }
         Comparator<Integer> cmp = new MyComparator();
         Arrays.sort(arry,cmp);
         for(int e:arry) {
             System.out.print(e + " ");
         }
         System.out.print("\n");
         System.out.print("输入要查找的数");
         int n = input.nextInt();
         int seaInt = Arrays.binarySearch(arry, n);
         if (seaInt >= 0) {
             System.out.println(n + "是数组的第" + seaInt+1 + "位元素");
         } else {
             System.out.println(n + "不是数组的元素");
         }
         input.close();
     }

}
class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        //如果n1小于n2，我们就返回正值，如果n1大于n2我们就返回负值，
        //这样颠倒一下，就可以实现反向排序了
        if(o1 < o2) {
            return 1;
        }else if(o1 > o2) {
            return -1;
        }else {
            return 0;
        }
    }
}