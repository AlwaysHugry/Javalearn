import javax.swing.*;

public class EmployeeTest {
    public static void main(String[] args) {
        String output = "Count:" + Employee.getCount() + "\n";
        Employee e1 = new Employee("Lucre", "Kiwis", new Date(2000, 4, 17), new Date(2020, 5, 1));
        Employee e2 = new Employee("Shen", "Yun", new Date(1999, 4, 17), new Date(2020, 5, 1));
        output += "\nThere are " + Employee.getCount() + " Employees:\n";
        output += e1.getFirstName() + " " + e1.getLastName() + "\n";
        output += e2.getFirstName() + " " + e2.getLastName() + "\n";
        e1 = null;
        e2 = null;
        System.gc();// 垃圾回收
        output += "Count:" + Employee.getCount() + "\n";// gc()调用的具体情况不明,不会立即结束,也不会一定调用finalize方法
        JOptionPane.showMessageDialog(null, output, "静态方法与域", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}