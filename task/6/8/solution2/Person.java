abstract class Person implements PersonPay{
    protected String name;
    public Person(String name)
    {
        this.name = name ;
    }
    public String toString()
    {
        return name+"�Ĺ���֧��:"+this.pay()+'\n';
    }
}