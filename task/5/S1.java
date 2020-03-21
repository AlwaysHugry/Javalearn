class S1{
    public static void main(String args[])
    {
        new S2();
    }
    S1()
    {
        System.out.println("S1");
    }
}
class S2 extends S1{
    S2()
    {
        System.out.println("S2");
    }
}