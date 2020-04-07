abstract class Person implements PersonPay{
    protected String name;
    public Person(String name)
    {
        this.name = name ;
    }
    public String toString()
    {
        return name+"的工资支出:"+this.pay()+'\n';
    }
}