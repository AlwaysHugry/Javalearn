public class AutomobileText {
    public static void main(String []args)
    {
        Truck tc = new Truck();
        tc.setNumber(8888);
        tc.setCapacity(1000000);
        System.out.println(tc.getNumber()+"\n"+tc.getCapacity());
    }
}