
public class Student{
    Curriculumn t[]=new Curriculumn[20];
    String name;
    int num;
    public Student(String s)
    {
        name=s;
        num=0;
    }
    public void select(String s)
    {
        t[num++]=new Curriculumn(s);
    }
}