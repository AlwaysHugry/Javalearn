package Test13;
class Test13{
    public static void main(String args[]){
        Student a=new Student(1,3,"Lucre","boy",20);
        Student b=new Student(23,5,"Kiwis","boy",20);
        Student c=new Student(24,5,"XiaoWu","boy",20);
        System.out.println(a.getId()+"+a.getClassId()+','+a.getName()+','+a.getSex()+','+a.getAge());
        a.setAge(19);
        a.setName("Panda");
        a.setSex("girl");
        System.out.println(a.toString());
        if(a.getAge()>b.getAge())
        System.out.println(a);
        else System.out.println(b);
    }
}