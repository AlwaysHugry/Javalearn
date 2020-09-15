import java.util.Vector;

/*
假定一个学生学习了
高数、90分、80学时；离散数学、80分、80学时；
英语、85分、96学时；C语言、数据结构、56分、80学时；
人工智能、87分、48学时；
请将这些课程信息添加到Vector中，并遍历Vector列出每个课的名称、得分、学分，
再求出总学分，请写一Java程序实现这些功能，
注意：完成16个课时的学习并及格后可得1学分，不合格就没有学分(即0学分)。
*/
public class Test2 {
    public static void main(String []args)
    {
        Vector<Course> vec = new Vector<Course>();
        Course c1 = new Course("高数",90,80);
        Course c2 = new Course("英语",80,80);
        Course c3 = new Course("离散数学",85,96);
        Course c4 = new Course("C语言版数据结构",56,80);
        Course c5 = new Course("人工智能",87,48);
        vec.add(c1);
        vec.add(c2);
        vec.add(c3);
        vec.add(c4);
        vec.add(c5);
        for(Course e:vec)
        {
            System.out.println(e);
        }
        System.out.println("总学分:"+Course.sum);

    }
}
class Course{
    private int scores;
    private int time;
    private String name;
    public int qualified;
    public static int sum = 0;
    public Course(String sname,int s,int t)
    {
        scores = s;
        time = t;
        name = sname;
        if(scores >= 60)
        {
            qualified = time/16;
        }
        else qualified = 0;
        sum += qualified;
    }
    public String toString()
    {
        return name+":"+scores+" "+qualified;
    }
}