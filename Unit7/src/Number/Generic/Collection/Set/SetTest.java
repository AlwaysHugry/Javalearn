package Number.Generic.Collection.Set;
//����,�����ظ�
import Number.Generic.Collection.Student;
import java.util.*;
public class SetTest {
    public static void main(String[] args)
    {
        Set<Student> set  = new HashSet<Student>();
        Student[] a = {new Student("Lucre",20),new Student("Chengfen",25),new Student("Shen Yun",21)};
        for(int i = 0;i < a.length;i++)
        set.add(a[i]);
        set.add(a[0]);//�ظ�
        Iterator<Student> iter = set.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}