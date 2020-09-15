package Test9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

class Employee implements Serializable {
    private int uid;
    private String name;
    private String address;
    private double salary;

    public Employee() {

    }

    public Employee(int uid, String name, String address, double salary) {
        setUid(uid);
        setName(name);
        setAddress(address);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "雇员号：" + uid + "     姓名：" + name + "     地址：" + address + "     工资：" + salary;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Main extends JFrame implements ActionListener {
    private Vector<Employee> employees;
    private JTextArea jTextArea;
    private JButton insertButton;
    private JButton deleteButton;
    private JButton findButton;
    private JButton modifyButton;
    private Container container;

    public Main() {
        employees = new Vector<>();
        jTextArea = new JTextArea(20, 48);
        jTextArea.setForeground(Color.green);
        jTextArea.setBackground(Color.black);
        jTextArea.setEditable(false);
        container = getContentPane();
        container.setLayout(new FlowLayout());

        insertButton = new JButton("插入");
        insertButton.addActionListener(this);
        deleteButton = new JButton("删除");
        deleteButton.addActionListener(this);
        findButton = new JButton("查找");
        findButton.addActionListener(this);
        modifyButton = new JButton("修改");
        modifyButton.addActionListener(this);

        addComponent();
        setSize(500, 400);
        read();
        setText();
        setLocationRelativeTo(null);
    }

    //内部类，实现输入并插入雇员信息
    class InsertWindow extends JDialog implements ActionListener {
        private JLabel uidLabel;
        private JTextField uidTextFiled;
        private JLabel nameLabel;
        private JTextField nameTextFiled;
        private JLabel addressLabel;
        private JTextField addressTextField;
        private JLabel salaryLabel;
        private JTextField salaryTextFiled;
        private Container container;
        public JButton ensure;

        public InsertWindow(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            container = getContentPane();
            container.setLayout(new FlowLayout());
            uidLabel = new JLabel("雇员号：");
            uidTextFiled = new JTextField(14);
            nameLabel = new JLabel("姓 名：");
            nameTextFiled = new JTextField(15);
            addressLabel = new JLabel("地 址：");
            addressTextField = new JTextField(15);
            salaryLabel = new JLabel("工 资：");
            salaryTextFiled = new JTextField(15);
            ensure = new JButton("确定插入");
            container.add(uidLabel);
            container.add(uidTextFiled);
            container.add(nameLabel);
            container.add(nameTextFiled);
            container.add(addressLabel);
            container.add(addressTextField);
            container.add(salaryLabel);
            container.add(salaryTextFiled);
            container.add(ensure);
            ensure.addActionListener(this);
            setSize(250, 180);
            setResizable(false);
            setLocationRelativeTo(owner);//设置居中出现在父窗口上
            setVisible(true);
        }

        public Employee getEmployee() {
            Employee employee = new Employee();
            employee.setUid(Integer.parseInt(uidTextFiled.getText()));
            employee.setName(nameTextFiled.getText());
            employee.setAddress(addressTextField.getText());
            employee.setSalary(Double.parseDouble(salaryTextFiled.getText()));
            return employee;
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (actionEvent.getSource() == ensure) {
                insert(getEmployee());
                setText();
                dispose();
            }
        }
    }
    //内部类，实现查找雇员信息
    class FindWindow extends JDialog implements ActionListener{
        private JLabel uidLabel;
        private JTextField uidJTextField;
        private JButton ensure;
        private JTextArea jTextArea;
        Container container;

        public FindWindow(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            uidLabel = new JLabel("请输入要查找的雇员号：");
            uidJTextField = new JTextField(15);
            ensure = new JButton("确认查找");
            jTextArea = new JTextArea(12,36);
            jTextArea.setBackground(Color.lightGray);
            jTextArea.setForeground(Color.black);
            container = getContentPane();
            container.setLayout(new FlowLayout());
            container.add(uidLabel);
            container.add(uidJTextField);
            container.add(ensure);
            container.add(jTextArea);
            ensure.addActionListener(this);
            setSize(400, 275);
            setResizable(false);
            setLocationRelativeTo(this);//设置居中出现在父窗口上
            setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(actionEvent.getSource()==ensure){
                int uid = Integer.parseInt(uidJTextField.getText());
                int index = find(uid);
                if(index==-1){
                    jTextArea.setText("未找到uid为"+uid+"的雇员");
                }
                else {
                    jTextArea.setText("找到以下内容：\n"+employees.elementAt(index).toString());
                }
            }
        }
    }
    //内部类，实现删除雇员信息
    class DeleteWindow extends JDialog implements ActionListener {
        private JLabel uidLabel;
        private JTextField uidJTextField;
        private JButton ensure;
        Container container;

        public DeleteWindow(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            uidLabel = new JLabel("请输入要删除的雇员号：");
            uidJTextField = new JTextField(15);
            ensure = new JButton("确认删除");
            container = getContentPane();
            container.setLayout(new FlowLayout());
            container.add(uidLabel);
            container.add(uidJTextField);
            container.add(ensure);
            ensure.addActionListener(this);
            setSize(200, 120);
            setResizable(false);
            setLocationRelativeTo(owner);//设置居中出现在父窗口上
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (actionEvent.getSource() == ensure) {
                delete(Integer.parseInt(uidJTextField.getText()));
                setText();
                dispose();
            }
        }
    }
    //内部类，实现修改雇员信息
    class ModifyWindow extends JDialog implements ActionListener{
        private JLabel preuidLabel;
        private JTextField preuidJTextFiled;
        private JLabel signLabel;
        private JLabel uidLabel;
        private JTextField uidTextFiled;
        private JLabel nameLabel;
        private JTextField nameTextFiled;
        private JLabel addressLabel;
        private JTextField addressTextField;
        private JLabel salaryLabel;
        private JTextField salaryTextFiled;
        private Container container;
        public JButton ensure;
        public ModifyWindow(JFrame owner,String title,boolean modal){
            super(owner,title,modal);
            container = getContentPane();
            container.setLayout(new FlowLayout());
            preuidLabel = new JLabel("请输入要修改的雇员号");
            preuidJTextFiled = new JTextField(15);
            signLabel = new JLabel("请输入修改后的雇员信息");
            uidLabel = new JLabel("雇员号：");
            uidTextFiled = new JTextField(14);
            nameLabel = new JLabel("姓 名：");
            nameTextFiled = new JTextField(15);
            addressLabel = new JLabel("地 址：");
            addressTextField = new JTextField(15);
            salaryLabel = new JLabel("工 资：");
            salaryTextFiled = new JTextField(15);
            ensure = new JButton("确定修改");
            container.add(preuidLabel);
            container.add(preuidJTextFiled);
            container.add(signLabel);
            Box h1 =Box.createHorizontalBox();
            h1.add(uidLabel);
            h1.add(uidTextFiled);
            container.add(h1);
            Box h2 =Box.createHorizontalBox();
            h2.add(nameLabel);
            h2.add(nameTextFiled);
            container.add(h2);
            Box h3 =Box.createHorizontalBox();
            h3.add(addressLabel);
            h3.add(addressTextField);
            container.add(h3);
            Box h4 =Box.createHorizontalBox();
            h4.add(salaryLabel);
            h4.add(salaryTextFiled);
            container.add(h4);
            container.add(ensure);
            ensure.addActionListener(this);
            setSize(250, 240);
            setResizable(false);
            setLocationRelativeTo(owner);//设置居中出现在父窗口上
            setVisible(true);

        }
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(actionEvent.getSource()==ensure){
                int index = find(Integer.parseInt(preuidJTextFiled.getText()));
                if(index==-1){
                    JOptionPane.showMessageDialog(container,"你要修改的雇员不存在",null,JOptionPane.WARNING_MESSAGE);
                }
                else {
                    Employee employee = new Employee();
                    employee.setUid(Integer.parseInt(uidTextFiled.getText()));
                    employee.setName(nameTextFiled.getText());
                    employee.setAddress(addressTextField.getText());
                    employee.setSalary(Double.parseDouble(salaryTextFiled.getText()));
                    modify(index, employee);
                    setText();
                }
                this.dispose();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == insertButton) {
            InsertWindow insertWindow = new InsertWindow(this, "插入", true);
        }
        if (e.getSource() == deleteButton) {
            DeleteWindow deleteWindow = new DeleteWindow(this, "删除", true);
        }
        if(e.getSource()==findButton){
            FindWindow findWindow = new FindWindow(this, "查找", true);
        }
        if(e.getSource()==modifyButton){
            ModifyWindow modifyWindow = new ModifyWindow(this, "修改", true);
        }
    }

    public void addComponent() {
        container.add(jTextArea);
        container.add(insertButton);
        container.add(deleteButton);
        container.add(findButton);
        container.add(modifyButton);
    }

    public void setText() {
        int sign = 1;
        jTextArea.setText("");
        for (Employee each : employees) {
            jTextArea.append(sign + ". " + each.toString() + "\n");
            sign++;
        }
    }

    // 写入文件
    public void write() {
        try {
            FileOutputStream file = new FileOutputStream("./employee.dat");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(employees);
            out.flush();
            out.close();
            file.close();
            employees.clear();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    //读取文件
    public void read() {
        try {
            FileInputStream file = new FileInputStream("./employee.dat");
            ObjectInputStream in = new ObjectInputStream(file);
            employees = (Vector<Employee>) in.readObject();
            in.close();
            file.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    //插入雇员信息
    public void insert(Employee employee) {
        employees.add(employee);
    }

    //删除雇员信息
    public boolean delete(int uid) {
        int index = find(uid);
        if (index == - 1) {
            return false;
        } else {
            employees.removeElementAt(index);
            return true;
        }
    }

    //查找雇员信息
    public int find(int uid) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.elementAt(i).getUid() == uid) {
                return i;
            }
        }
        return - 1;//未找到返回-1
    }

    //修改雇员信息
    public boolean modify(int index,Employee employee) {
        if (index == - 1) {
            return false;
        } else {
            //修改
            employees.set(index,employee);
            return true;
        }
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.setVisible(true);
        app.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {//关闭时保存文件
                app.write();
                System.exit(0);
            }
        });
    }
}
