/*
дһJava���򣬴�һ�ļ�fileA.txt�����ж���һƪӢ�����£�
��1��ͳ�������ж��ٸ����ʣ��ٶ�����֮���Կո��.��س��ָ����������
��2��ͳ�ƹ��ж��ٸ����ӣ��ٶ�ÿ��Ӣ�ľ����� . ��������ͳ��.�ĸ�������
��3���ѣ�1������2����ͳ�ƽ��д�뵽��һ�ļ�fileB.txt�С�[15']
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
            String ss = st.nextToken();//�ҳ�ÿ������
            if(map1.containsKey(ss)){
                int count = map1.get(ss);//�Ѵ��ڵĻ����ʼ�һ
                map1.put(ss,count+1);
            }
            else{
                map1.put(ss,1);//��һ�γ��ִ洢��ȥ
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream("file.txt");
            BufferedWriter os = new BufferedWriter(new OutputStreamWriter(fos));
            //������ʸ���
            System.out.println("�������༰����Ϊ��");
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
        String delims = ".";//�����жϾ�������
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
            System.out.println("�������༰����Ϊ��");
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

    }//����������༰����
}
