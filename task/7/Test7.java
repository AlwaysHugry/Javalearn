import java.util.*;//����vector
class Test7{
    public static void main(String args[])
    {
        Vector vec = new Vector();
        vec.add("��ѧ");
        vec.add("����");
        vec.add("Ӣ��");
        vec.add("����");
        vec.add("����");
        vec.add("��ѧ");
        System.out.println("�γ���:");
        Enumeration items = vec.elements();
        while(items.hasMoreElements())
        System.out.println(items.nextElement());
        System.out.println("�������ŵ�λ����:"+vec.indexOf("����"));
    }
}