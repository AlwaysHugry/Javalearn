import javax.swing.JOptionPane;//�������
public class JOptionPaneTest{
    public static void main(String args[])
    {
        String firstNumber;
        String secondNumber;
        int number1;
        int number2;
        firstNumber=JOptionPane.showInputDialog("�����һ������");//���뺯��showInputDialog;
        secondNumber=JOptionPane.showInputDialog("����ڶ�������");
        number1=Integer.parseInt(firstNumber);//Integer.parseInt()����ת���ַ�Ϊ����
        number2=Integer.parseInt(secondNumber);
        JOptionPane.showMessageDialog(null,"�����"+(number1-number2),"������",JOptionPane.PLAIN_MESSAGE);//�ڶ�������������,�����������ǿ���
        System.exit(0);//�˳�
    }
}