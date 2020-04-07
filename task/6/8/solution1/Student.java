class Student extends Person{
    private double scholarship ;
    public Student(String name,double scholarship)
    {
        super(name);
        this.scholarship = scholarship;
    }
    public double pay()
    {
        return scholarship ;
    }
}