package Test8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;
 
 
public class Test {   
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		
		TreeMap<Character, Integer> tm = new TreeMap<>();
		
		int ch;
		while ((ch = br.read()) != -1) {
			char c = (char)ch;
			/*if (tm.containsKey(c)) {
				tm.put(c, 1);
			}else{
				tm.put(c, tm.get(c) + 1);
			}*/
			tm.put(c, tm.containsKey(c) ? tm.get(c)+1 : 1);    // 双目运算
		}
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("numberOfCharacter.txt"));
		for (Character key : tm.keySet()) {
			switch (key) {
			case '\t':
				bw.write("\\t" + ":" + tm.get(key));  //写出键和值
				break;
			case '\n':
				bw.write("\\n" + ":" + tm.get(key));  
				break;
			case '\r':
				bw.write("\\r" + ":" + tm.get(key));  
				break;
			case ' ':
				bw.write("空格" + ":" + tm.get(key));  
				break;
			default:
				bw.write(key + ":" + tm.get(key));
				break;
			}
			bw.newLine();
		}
		bw.close();
	}
}