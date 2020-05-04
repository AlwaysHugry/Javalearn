import java.util.*;
class Test8{
    public static void main(String args[])
    {
        List<Student> list =new ArrayList<Student>();
        list.add(new Student("Lucre",20));
        list.add(new Student("Amy",21));
        Iterator iter = list.iterator();
        while(iter.hasNext())
        {
            Student s = (Student) iter. next();
            s.showMessage();
        }
    }
}
class Student{
    private String name;
    private int age;
    public Student(String s,int a)
    {
        name = s;
        age = a;
    }
    public void showMessage()
    {
        System.out.println("name:"+name+",age:"+age);
    }
}