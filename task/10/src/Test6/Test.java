package Test6;
class BalanceNotEnough extends Exception{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public BalanceNotEnough()
    {}
    public String toString()
    {
        return "Balance is not Enough;";
    }
}
class BankAccount {
    private double deposit;

    public BankAccount(double s) {
        deposit = s;
    }

    public void save(double s)
    {
        deposit += s;
    }

    public void get(double s) throws BalanceNotEnough{
        if(s>deposit)
        {
            throw new BalanceNotEnough();
        }
        deposit -= s;
    }
}

public class Test {
    public static void main(String []args)
    {
        try{
            BankAccount a = new BankAccount(123);
            a.save(10000);
            a.get(22222);
        }
        catch(BalanceNotEnough e)
        {
            System.out.println(e);
        }
    }
}