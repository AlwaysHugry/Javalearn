import java.util.Vector;

/*
�ٶ�һ��ѧ��ѧϰ��
������90�֡�80ѧʱ����ɢ��ѧ��80�֡�80ѧʱ��
Ӣ�85�֡�96ѧʱ��C���ԡ����ݽṹ��56�֡�80ѧʱ��
�˹����ܡ�87�֡�48ѧʱ��
�뽫��Щ�γ���Ϣ��ӵ�Vector�У�������Vector�г�ÿ���ε����ơ��÷֡�ѧ�֣�
�������ѧ�֣���дһJava����ʵ����Щ���ܣ�
ע�⣺���16����ʱ��ѧϰ�������ɵ�1ѧ�֣����ϸ��û��ѧ��(��0ѧ��)��
*/
public class Test2 {
    public static void main(String []args)
    {
        Vector<Course> vec = new Vector<Course>();
        Course c1 = new Course("����",90,80);
        Course c2 = new Course("Ӣ��",80,80);
        Course c3 = new Course("��ɢ��ѧ",85,96);
        Course c4 = new Course("C���԰����ݽṹ",56,80);
        Course c5 = new Course("�˹�����",87,48);
        vec.add(c1);
        vec.add(c2);
        vec.add(c3);
        vec.add(c4);
        vec.add(c5);
        for(Course e:vec)
        {
            System.out.println(e);
        }
        System.out.println("��ѧ��:"+Course.sum);

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