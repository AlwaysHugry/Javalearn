package Number.Generic.Map;

import java.util.*;
import java.util.Scanner;

//统计一行句子的单词频数
public class Test {
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        input.close();
        Map<String,Integer> map = new TreeMap<String,Integer>();
        String[] tokens = line.split(" |\\.");
        for(int count = 0;count < tokens.length;count++)
        {
            if(map.containsKey(tokens[count]))
            {
                map.put(tokens[count], map.get(tokens[count])+1);
            }
            else map.put(tokens[count], 1);
        }
        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext())
        {
            String ans = iter.next();
            System.out.println(ans+" "+map.get(ans));
        }
    }
}