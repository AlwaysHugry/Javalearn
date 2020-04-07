import javax.swing.JOptionPane;//输入输出
public class JOptionPaneTest{
    public static void main(String args[])
    {
        String firstNumber;
        String secondNumber;
        int number1;
        int number2;
        firstNumber=JOptionPane.showInputDialog("输入第一个数字");//输入函数showInputDialog;
        secondNumber=JOptionPane.showInputDialog("输入第二个数字");
        number1=Integer.parseInt(firstNumber);//Integer.parseInt()可以转换字符为数字
        number2=Integer.parseInt(secondNumber);
        JOptionPane.showMessageDialog(null,"结果是"+(number1-number2),"相减结果",JOptionPane.PLAIN_MESSAGE);//第二个参数是内容,第三个参数是框名
        System.exit(0);//退出
    }
}