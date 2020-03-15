import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Test10 {

	public static void main(String[] args) {
		String number;
		double number1=0;
		number=JOptionPane.showInputDialog(" 输入第一个浮点数");
		number1=Double.parseDouble(number);
		int int1=(int)(number1);
		double double1=number1-int1;
	    JOptionPane.showMessageDialog(null, "整数部分是:"+int1+"\n小数部分是:"+double1,"结果",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
	}

}
