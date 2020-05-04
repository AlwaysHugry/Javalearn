import java.util.*;
class Test10{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        MyStringTokenizer test = new MyStringTokenizer(s);
        System.out.println("这句话总共有"+test.counts()+"单词,依次是:");
        while(test.hasMoreWords())
        {
            System.out.println(test.nextWord());
        }

    }
}
class MyStringTokenizer{
    String s;
    String[] words ;
    int index = 0;
    public MyStringTokenizer(String s)
    {
        this.s = s;
        this.words = s.split("\\n|\\t|\\r| ");//分割单词
    } 
    public int counts()
    {
        return words.length;//返回单词数
    }
    public boolean hasMoreWords()
    {
        if(index<this.counts())
        {
            return true;
        }
        else return false;
    }
    public String nextWord(){
        index++;
        return words[index-1];
    }
}