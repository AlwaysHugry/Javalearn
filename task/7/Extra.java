
import java.util.Scanner;
public class Extra{
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            String s ="";
            int a=0,b=0;
            for(int i=0;i<5;i++)
            {
                s = input.nextLine();
                MyStringTokenizer test = new MyStringTokenizer(s);
                a+=test.countWords();
                b+=test.countSentences()+1;
            }
            System.out.println("��仰�ܹ���"+a+"����,����"+b+"������");
        }      
}
class MyStringTokenizer{
    String s;
    String[] words ;
    String[] sentences;
    int index = 0;
    public MyStringTokenizer(String s)
    {
        this.s = s;
        this.words = s.split("\\n|\\t|\\r| ");//�ָ��
        this.sentences = s.split(".|");
    } 
    public int countWords()
    {
        return words.length;//���ص�����
    }
    public int countSentences()
    {
        return sentences.length;//���ص�����
    }
}