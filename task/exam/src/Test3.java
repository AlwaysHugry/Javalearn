
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
         System.out.print("����Ҫ���ҵ���");
         int n = input.nextInt();
         int seaInt = Arrays.binarySearch(arry, n);
         if (seaInt >= 0) {
             System.out.println(n + "������ĵ�" + seaInt+1 + "λԪ��");
         } else {
             System.out.println(n + "���������Ԫ��");
         }
         input.close();
     }

}
class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        //���n1С��n2�����Ǿͷ�����ֵ�����n1����n2���Ǿͷ��ظ�ֵ��
        //�����ߵ�һ�£��Ϳ���ʵ�ַ���������
        if(o1 < o2) {
            return 1;
        }else if(o1 > o2) {
            return -1;
        }else {
            return 0;
        }
    }
}