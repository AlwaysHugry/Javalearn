import java.util.*;
class Test9{
    public static void count(String str){
    //����26���ռ��С�����飬���26����ĸ
        int[] nums = new int[26];
        String loc[] = new String[26];
        for(int i=0;i<26;i++)
        loc[i] = "";
        int count=0;
        for(char i: str.toCharArray()){
        //�Զ���char iת����ascall��
            if(i>=97 && i<= 122){
            //����������������д洢
                nums[i-97]++;
                loc[i-97]+=count+" ";
            }
            count++;
        }
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != 0){
                //i����97������ת��Ϊchar���;Ϳ�����ʾ��Ӧ���ַ�
                char j = (char)(i+97);
                System.out.println( j + "====" + nums[i]+",location:"+loc[i]);
                
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        count(s);
        MyStringTokenizer test = new MyStringTokenizer(s);
        System.out.println("��仰�ܹ���"+test.counts()+"����,������:");
        while(test.hasMoreWords())
        {
            System.out.println(test.nextWord());
        }
        test.nextWord1();
    }
}
class MyStringTokenizer{
    String s;
    String[] words ;
    int index = 0;
    public MyStringTokenizer(String s)
    {
        this.s = s;
        this.words = s.split("\\n|\\t|\\r| ");//�ָ��
    } 
    public int counts()
    {
        return words.length;//���ص�����
    }
    public boolean hasMoreWords()
    {
        if(index<words.length)
        {
            return true;
        }
        else return false;
    }
    public String nextWord(){
        index++;
        return words[index-1];
    }
    public void nextWord1(){
        index = words.length-1;
        while(index>=0)
        {
            System.out.println(words[index]);
            index--;
        }
    }
}