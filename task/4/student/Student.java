package student;
public class Student{
    private int id;
    private int classId;
    private String name;
    private String sex;
    private int age;
    private static int count=0;
    public Student(int id,int classId,String name,String sex,int age)
    {
        this.id=id;
        this.classId=classId;
        this.name=name;
        this.sex=sex;
        this.age=age;
        count++;
    }
    public int getId()
    {
        return id;
    }
    public int getClassId(){
        return classId;
    }
    public String getName()
    {
        return name;
    }
    public String getSex()
    {
        return sex;
    }
    public int getAge()
    {
        return age;
    }
    public void setId(int x)
    {
        this.id=x;
    }
    public void setClassId(int x)
    {
        this.classId=x;
    }
    public void setName(String x)
    {
        this.name=x;
    }
    public void setSex(String x)
    {
        this.sex=x;
    }
    public void setAge(int x)
    {
        this.age=x;
    }
    public String toString()
    {
        return "id="+id+",classId="+classId+",name="+name+",sex="+sex+",age="+age;
    }
    public int getCount()
    {
        return count;
    }
} 