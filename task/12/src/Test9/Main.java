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
        return "��Ա�ţ�" + uid + "     ������" + name + "     ��ַ��" + address + "     ���ʣ�" + salary;
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

        insertButton = new JButton("����");
        insertButton.addActionListener(this);
        deleteButton = new JButton("ɾ��");
        deleteButton.addActionListener(this);
        findButton = new JButton("����");
        findButton.addActionListener(this);
        modifyButton = new JButton("�޸�");
        modifyButton.addActionListener(this);

        addComponent();
        setSize(500, 400);
        read();
        setText();
        setLocationRelativeTo(null);
    }

    //�ڲ��࣬ʵ�����벢�����Ա��Ϣ
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
            uidLabel = new JLabel("��Ա�ţ�");
            uidTextFiled = new JTextField(14);
            nameLabel = new JLabel("�� ����");
            nameTextFiled = new JTextField(15);
            addressLabel = new JLabel("�� ַ��");
            addressTextField = new JTextField(15);
            salaryLabel = new JLabel("�� �ʣ�");
            salaryTextFiled = new JTextField(15);
            ensure = new JButton("ȷ������");
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
            setLocationRelativeTo(owner);//���þ��г����ڸ�������
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
    //�ڲ��࣬ʵ�ֲ��ҹ�Ա��Ϣ
    class FindWindow extends JDialog implements ActionListener{
        private JLabel uidLabel;
        private JTextField uidJTextField;
        private JButton ensure;
        private JTextArea jTextArea;
        Container container;

        public FindWindow(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            uidLabel = new JLabel("������Ҫ���ҵĹ�Ա�ţ�");
            uidJTextField = new JTextField(15);
            ensure = new JButton("ȷ�ϲ���");
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
            setLocationRelativeTo(this);//���þ��г����ڸ�������
            setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(actionEvent.getSource()==ensure){
                int uid = Integer.parseInt(uidJTextField.getText());
                int index = find(uid);
                if(index==-1){
                    jTextArea.setText("δ�ҵ�uidΪ"+uid+"�Ĺ�Ա");
                }
                else {
                    jTextArea.setText("�ҵ��������ݣ�\n"+employees.elementAt(index).toString());
                }
            }
        }
    }
    //�ڲ��࣬ʵ��ɾ����Ա��Ϣ
    class DeleteWindow extends JDialog implements ActionListener {
        private JLabel uidLabel;
        private JTextField uidJTextField;
        private JButton ensure;
        Container container;

        public DeleteWindow(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            uidLabel = new JLabel("������Ҫɾ���Ĺ�Ա�ţ�");
            uidJTextField = new JTextField(15);
            ensure = new JButton("ȷ��ɾ��");
            container = getContentPane();
            container.setLayout(new FlowLayout());
            container.add(uidLabel);
            container.add(uidJTextField);
            container.add(ensure);
            ensure.addActionListener(this);
            setSize(200, 120);
            setResizable(false);
            setLocationRelativeTo(owner);//���þ��г����ڸ�������
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
    //�ڲ��࣬ʵ���޸Ĺ�Ա��Ϣ
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
            preuidLabel = new JLabel("������Ҫ�޸ĵĹ�Ա��");
            preuidJTextFiled = new JTextField(15);
            signLabel = new JLabel("�������޸ĺ�Ĺ�Ա��Ϣ");
            uidLabel = new JLabel("��Ա�ţ�");
            uidTextFiled = new JTextField(14);
            nameLabel = new JLabel("�� ����");
            nameTextFiled = new JTextField(15);
            addressLabel = new JLabel("�� ַ��");
            addressTextField = new JTextField(15);
            salaryLabel = new JLabel("�� �ʣ�");
            salaryTextFiled = new JTextField(15);
            ensure = new JButton("ȷ���޸�");
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
            setLocationRelativeTo(owner);//���þ��г����ڸ�������
            setVisible(true);

        }
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(actionEvent.getSource()==ensure){
                int index = find(Integer.parseInt(preuidJTextFiled.getText()));
                if(index==-1){
                    JOptionPane.showMessageDialog(container,"��Ҫ�޸ĵĹ�Ա������",null,JOptionPane.WARNING_MESSAGE);
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
            InsertWindow insertWindow = new InsertWindow(this, "����", true);
        }
        if (e.getSource() == deleteButton) {
            DeleteWindow deleteWindow = new DeleteWindow(this, "ɾ��", true);
        }
        if(e.getSource()==findButton){
            FindWindow findWindow = new FindWindow(this, "����", true);
        }
        if(e.getSource()==modifyButton){
            ModifyWindow modifyWindow = new ModifyWindow(this, "�޸�", true);
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

    // д���ļ�
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

    //��ȡ�ļ�
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

    //�����Ա��Ϣ
    public void insert(Employee employee) {
        employees.add(employee);
    }

    //ɾ����Ա��Ϣ
    public boolean delete(int uid) {
        int index = find(uid);
        if (index == - 1) {
            return false;
        } else {
            employees.removeElementAt(index);
            return true;
        }
    }

    //���ҹ�Ա��Ϣ
    public int find(int uid) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.elementAt(i).getUid() == uid) {
                return i;
            }
        }
        return - 1;//δ�ҵ�����-1
    }

    //�޸Ĺ�Ա��Ϣ
    public boolean modify(int index,Employee employee) {
        if (index == - 1) {
            return false;
        } else {
            //�޸�
            employees.set(index,employee);
            return true;
        }
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.setVisible(true);
        app.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {//�ر�ʱ�����ļ�
                app.write();
                System.exit(0);
            }
        });
    }
}
