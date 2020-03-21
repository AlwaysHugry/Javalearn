public class Test9{
    public static void main(String[] args)
    {
        MyClass myobj,myref;
        myobj = new MyClass(-1);
        myref = myobj;
        System.out.println("the original data is:"+myobj.getData());
        myref.setData(10);
        System.out.println("now the data is:"+myobj.getData());
    }
}
class MyClass{
    int data;
    MyClass(int d)
    {
        data=d;
    }
    int getData()
    {
        return data;
    }
    void setData(int d)
    {
        data=d;
    }
}

