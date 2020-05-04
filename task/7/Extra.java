
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
            System.out.println("这句话总共有"+a+"单词,共有"+b+"个句子");
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
        this.words = s.split("\\n|\\t|\\r| ");//分割单词
        this.sentences = s.split(".|");
    } 
    public int countWords()
    {
        return words.length;//返回单词数
    }
    public int countSentences()
    {
        return sentences.length;//返回单词数
    }
}