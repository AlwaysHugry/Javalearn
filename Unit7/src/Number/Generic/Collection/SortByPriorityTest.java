package Number.Generic.Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SortByPriorityTest {
    private static class SortByAge implements Comparator<Student>{
        public int compare(Student a,Student b)
        {
            if(a.getAge()>b.getAge())//½µÐò
            return 1;
            else 
            return 0;
        }
    } 
    public static void main(String[] args)
    {
        Student[] a = {new Student("Lucre",20),new Student("Chengfen",25),new Student("Shen Yun",21)};
        List<Student> list = Arrays.asList(a);
        Collections.sort(list,new SortByAge());
        Iterator<Student> iter = list.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}