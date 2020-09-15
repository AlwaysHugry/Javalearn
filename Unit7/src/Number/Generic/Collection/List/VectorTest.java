package Number.Generic.Collection.List;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
    private static void printVector(Vector<Object> e)
    {
        Iterator<Object> iter = e.iterator();
        while(iter.hasNext())
        {
            System.out.print(iter.next()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        String colors[] = {"red","yellow","blue"};
        Vector<Object> vec = new Vector<Object>(0,1);//初始容量与增加容量
        printVector(vec);
        for(int count = 0;count < colors.length;count++)
        {
            vec.add(colors[count]);
        }
        vec.addElement("Grey");
        vec.add("white");
        printVector(vec);
        System.out.println("the capacity of the lis :"+vec.capacity());
        System.out.println("the list contains Grey:"+vec.contains("Grey"));
        vec.remove("Grey");
        System.out.println("the list contains Grey:"+vec.contains("Grey"));
    }
}