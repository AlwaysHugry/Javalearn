package Number.Generic.Collection;

public class Student {
    private int age;
    private String name;
    private static int count = 0;
    public Student()
    {
        count++;
    }
    public Student(String name,int age)
    {
        this.name = name;
        this.age = age;
        count ++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
}