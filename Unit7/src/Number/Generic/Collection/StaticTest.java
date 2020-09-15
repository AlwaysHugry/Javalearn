package Number.Generic.Collection;

import java.util.*;

//Collections的几个静态方法
public class StaticTest {
    private static void printList(List<Integer> e)
    {
        Iterator<Integer> iter = e.iterator();
        while(iter.hasNext())
        {
            System.out.print(iter.next()+" ");
        }
        System.out.println();
    }
    public static void main(String []args)
    {
        Integer[] a = {2,1,3,5,35,5,67,35};
        List<Integer> list = Arrays.asList(a);
        System.out.println("Before Sorted:");
        printList(list);
        System.out.println("After sorted:");
        Collections.sort(list);
        printList(list);
        System.out.println("After reversed sorted:");
        Collections.sort(list, Collections.reverseOrder());//Descending Order
        printList(list);
        System.out.println("Max:"+Collections.max(list)+"\nMin:"+Collections.min(list));
        int key = 5;
        System.out.println("Searching for "+key+",found at index :"+Collections.binarySearch(list, key));//BinarySearch
    }
}