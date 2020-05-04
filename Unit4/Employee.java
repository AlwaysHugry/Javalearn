class Employee{
    private  String firstName;
    private  String lastName;
    private  Date hireDay;
    private  Date birthDay;
    private static int count = 0;

    public Employee( String f, String l, Date birth, Date hire)
    {
        firstName = f;
        lastName = l;
        birthDay = birth;
        hireDay = hire;
        count ++;
    }
    protected void finalize()//调用垃圾回收时,会在之前自动调用finalize
    {
        count --;
        System.out.println("Constructor:"+this.firstName+" "+this.lastName+" cancelled!");
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    
    public static int getCount()//static方法中只能调用static成员
    {
        return count;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public Date getBirthDay() {
        return birthDay;
    }

}