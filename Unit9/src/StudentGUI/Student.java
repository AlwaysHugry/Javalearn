package StudentGUI;

public class Student {
    private String No;//Ñ§ºÅ
    private String name;
    private String sex;
    private int age;
    private String hobby;
    public Student(String No,String name,String sex,int age,String hobby)
    {
        this.No = No;
        this.age =age;
        this.name = name;
        this.hobby = hobby;
        this.sex = sex;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student [No=" + No + ", age=" + age + ", hobby=" + hobby + ", name=" + name + ", sex=" + sex + "]";
    }

}