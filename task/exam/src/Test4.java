/*
写一Java程序，从一文件fileA.txt中逐行读入一篇英文文章；
（1）统计其中有多少个单词（假定单词之间以空格或.或回车分隔或结束）；
（2）统计共有多少个句子（假定每个英文句子以 . 结束，即统计.的个数）；
（3）把（1）、（2）的统计结果写入到另一文件fileB.txt中。[15']
*/
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Test4 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("fileA.txt");
        BufferedReader data = new BufferedReader(new InputStreamReader(fis));
        String str1;
        String str="";
        while((str1 = data.readLine())!=null){
            System.out.println(str1);
            str+=str1;
        }
        data.close();
        fis.close();
        printSet1(str);
        printSet2(str);
    }
    public static void printSet1(String str){
        Map<String,Integer> map1 = new HashMap<String ,Integer>();
        StringTokenizer st = new StringTokenizer(str," .");
        while(st.hasMoreTokens()){
            String ss = st.nextToken();//找出每个单词
            if(map1.containsKey(ss)){
                int count = map1.get(ss);//已存在的话单词加一
                map1.put(ss,count+1);
            }
            else{
                map1.put(ss,1);//第一次出现存储进去
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream("file.txt");
            BufferedWriter os = new BufferedWriter(new OutputStreamWriter(fos));
            //输出单词个数
            System.out.println("单词种类及个数为：");
            Set<String> keies1 = map1.keySet();
            for(String key : keies1){
                os.write(key+" "+map1.get(key));
                System.out.println(key+" "+map1.get(key));
            }
            os.flush();
            os.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void printSet2(String str){
        String delims = ".";//设置判断句子条件
        Map<String,Integer> map2 = new HashMap<String, Integer>();
        StringTokenizer st2 = new StringTokenizer(str,delims);
        while(st2.hasMoreTokens()){
            String ss = st2.nextToken();
            if(map2.containsKey(ss)){
                int count = map2.get(ss);
                map2.put(ss,count+1);
            }
            else map2.put(ss,1);
        }
        try {
            FileOutputStream fos = new FileOutputStream("fileB.txt");
            BufferedWriter os = new BufferedWriter(new OutputStreamWriter(fos));
            System.out.println("句子种类及个数为：");
            Set<String> keies2 = map2.keySet();
            for(String key : keies2){
                os.write(key+" "+map2.get(key));
                System.out.println(key+" "+map2.get(key));
            }
            os.flush();
            os.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//输出句子种类及个数
}
