package Number.Generic.Collection.List;
//”––Ú,ø…÷ÿ∏¥
import java.util.*;

public class ArrayListTest {
    public static void main(final String args[]) {
        List<String> list = new ArrayList<String>();
        list.add("Lucre");
        list.add("Shen Yun");
        list.add("Xue Anye");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove("Lucre");
        list.add("Cheng Long");
        Iterator<String> iter = list.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}