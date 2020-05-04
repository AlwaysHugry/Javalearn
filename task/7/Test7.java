import java.util.*;//导入vector
class Test7{
    public static void main(String args[])
    {
        Vector vec = new Vector();
        vec.add("数学");
        vec.add("语文");
        vec.add("英语");
        vec.add("政治");
        vec.add("物理");
        vec.add("化学");
        System.out.println("课程有:");
        Enumeration items = vec.elements();
        while(items.hasMoreElements())
        System.out.println(items.nextElement());
        System.out.println("物理所放的位置在:"+vec.indexOf("物理"));
    }
}