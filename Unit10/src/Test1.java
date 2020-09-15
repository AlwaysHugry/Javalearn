import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args)
    {
        try{
            FileInputStream e = new FileInputStream("leve1.dat");
            int b;
            while((b = e.read())!=-1)
            {
                System.out.println(b);
            }
            e.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found!");
        }
        catch(IOException e)//子类异常必须在父类之前捕获
        {
            System.out.println("IO Exeception");
        }

    }
}