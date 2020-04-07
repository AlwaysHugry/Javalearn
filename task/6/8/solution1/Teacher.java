class Teacher extends Person{
    private double baseWage ;
    private  double teachingHours;
    public Teacher(String name,double baseWage,double teachingHours)
    {
        super(name);
        this.baseWage = baseWage;
        this.teachingHours = teachingHours ;
    }
    public double pay()
    {
        return baseWage + teachingHours * 30;
    }

}