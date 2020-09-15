import java.io.IOException;

public class Test2 {
    public static int compute(int x) throws ArithmeticException{
        int z = 10/x;
        return z;
    }
    public static void main(String[] args) {
        try{
            int x = System.in.read();//·µ»ØAscII
            int result = compute(x-48);
            System.out.println(result);
        }
        catch(IOException e)
        {
            System.out.println("read error");
        }
        catch(ArithmeticException e)
        {
            System.out.print("devided by 0");
        }
    }
}