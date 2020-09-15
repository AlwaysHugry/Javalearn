import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;

class Student {
    private int no;
    private String name;
    private String sex;
    private int age;
    private String hobby;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Student(int no,String name,String sex,int age,String hobby){
        this.no=no;
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.hobby=hobby;
    }
    public  Student(){

    }
    public String toString(){
        return "学号："+no+"   姓名"+name+"  性别："+sex+"  年龄："+age+"  爱好:"+hobby+"\n";
    }
}

public class Main extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JMenuBar menuBar;
    Container container;
    CardLayout cardLayout;
    JTextArea jTextArea;
    JPanel mainPanel;
    JPanel detailPanel;
    JPanel addPanel;
    JPanel modifyPanel;
    JTextField modifInput;
    JPanel searchPanel;
    JTextArea searchResault;
    JTextField searchInput;
    JPanel removePanel;
    JTextField removeInput;
    JTextField addNoInput;
    JTextField addNameInput;
    JTextField addAgeInput;
    JTextField addsexInput;
    JTextField addhobbyInput;
    JTextField modifyNoInput;
    JTextField modifyNameInput;
    JTextField modifyAgeInput;
    JTextField modifySexInput;
    JTextField modifyHobbyInput;
    Vector<Student> students;
    Main(){
        students = new Vector<Student>();
        container = getContentPane();
        mainPanel = new JPanel();
        cardLayout = new CardLayout();//设置卡片布局
        mainPanel.setLayout(cardLayout);
        container.setLayout(new FlowLayout());
        setMenu();//设置菜单
        setDetailPanel();//设置详情页
        setaddPanel();//设置添加对象页
        setRemovePanel();//设置删除对象页
        setModifyPanel();//设置修改对象页
        setSearchPanel();//设置查询对象页
        container.add(mainPanel);
    }
    public void setMenu(){
        JMenu menu;
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        menu = new JMenu("编辑");
        menuBar.add(menu);
        JMenuItem mainItem = new JMenuItem("显示详情");
        mainItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(mainPanel,"detailPanel");//切换卡片页面
                showDetails();
            }
        });
        menu.add(mainItem);
        JMenuItem addItem = new JMenuItem("添加");
        addItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(mainPanel,"addPanel");//切换卡片页面
                //清空上次输入
                addNoInput.setText("");
                addAgeInput.setText("");
                addNameInput.setText("");
                addsexInput.setText("");
                addhobbyInput.setText("");
            }
        });
        menu.add(addItem);
        JMenuItem modifyItem = new JMenuItem("修改");
        modifyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(mainPanel,"modifyPanel");//切换卡片页面
                //清空上次输入
                modifInput.setText("");
                modifyNoInput.setText("");
                modifyAgeInput.setText("");
                modifyNameInput.setText("");
                modifySexInput.setText("");
                modifyHobbyInput.setText("");
            }
        });
        menu.add(modifyItem);
        JMenuItem removeItem = new JMenuItem("删除");
        removeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                removeInput.setText("");
                cardLayout.show(mainPanel,"removePanel");//切换卡片页面
            }
        });
        menu.add(removeItem);
        JMenuItem searchItem = new JMenuItem("查询");
        searchItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(mainPanel,"searchPanel");//切换卡片页面
                //清空上次查询结果
                searchResault.setText("");
                searchInput.setText("");
            }
        });
        menu.add(searchItem);
    }
    public void setDetailPanel(){
        detailPanel = new JPanel();
        detailPanel.setLayout(new FlowLayout());
        jTextArea = new JTextArea(26,45);
        jTextArea.setEditable(false);
        jTextArea.setBackground(Color.black);
        jTextArea.setForeground(Color.green);
        detailPanel.add(jTextArea);
        showDetails();
        mainPanel.add("detailPanel",detailPanel);//添加进卡片
    }
    public void showDetails(){
        jTextArea.setText("");
        jTextArea.append("已有学生信息：\n\n");
        Integer index=0;
        for (Student student:students) {
            jTextArea.append((++index).toString()+". ");
            jTextArea.append(student.toString());
        }
        if(jTextArea.getLineCount()<=3){//判断是否有对象
            jTextArea.setText("无任何学生信息");
        }
    }
    public void setaddPanel(){
        addPanel = new JPanel(new FlowLayout());
        JLabel no = new JLabel("学号：");
        addNoInput = new JTextField(15);
        JLabel name = new JLabel("姓名：");
        addNameInput = new JTextField(15);
        JLabel sex = new JLabel("性别：");
        addsexInput = new JTextField(15);
        JLabel age = new JLabel("年龄：");
        addAgeInput = new JTextField(15);
        JLabel hobby = new JLabel("爱好：");
        addhobbyInput = new JTextField(15);

        //设置布局为Box
        Box h1 = Box.createHorizontalBox();
        h1.add(no);
        h1.add(addNoInput);
        Box h2 = Box.createHorizontalBox();
        h2.add(name);
        h2.add(addNameInput);
        Box h3 = Box.createHorizontalBox();
        h3.add(sex);
        h3.add(addsexInput);
        Box h4 = Box.createHorizontalBox();
        h4.add(age);
        h4.add(addAgeInput);
        Box h5 = Box.createHorizontalBox();
        h5.add(hobby);
        h5.add(addhobbyInput);
        Box v = Box.createVerticalBox();
        v.add(Box.createVerticalStrut(25));
        v.add(h1);
        v.add(Box.createVerticalStrut(25));
        v.add(h2);
        v.add(Box.createVerticalStrut(25));
        v.add(h3);
        v.add(Box.createVerticalStrut(25));
        v.add(h4);
        v.add(Box.createVerticalStrut(25));
        v.add(h5);
        v.add(Box.createVerticalStrut(25));
        JButton addButton = new JButton("添加");
        Box h6 =Box.createHorizontalBox();
        h6.add(addButton);
        v.add(h6);
        addPanel.add(v);
        mainPanel.add("addPanel",addPanel);//添加进卡片
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int no = Integer.parseInt(addNoInput.getText());
                String name = addNameInput.getText();
                String sex = addsexInput.getText();
                int age = Integer.parseInt(addAgeInput.getText());
                String hobby = addhobbyInput.getText();
                students.add(new Student(no,name,sex,age,hobby));
                JOptionPane.showMessageDialog(container, "添加成功",null,JOptionPane.PLAIN_MESSAGE);
                cardLayout.show(mainPanel,"detailPanel");
                showDetails();
            }
        });
    }
    public void setSearchPanel() {
        JLabel jLabel = new JLabel("请输入你要查找的学号：");
        searchInput = new JTextField(15);
        JButton searchButton = new JButton("开始查找");
        searchResault = new JTextArea(20,45);
        searchResault.setForeground(Color.green);
        searchResault.setBackground(Color.black);
        Box h1 = Box.createHorizontalBox();
        h1.add(jLabel);
        h1.add(searchInput);
        Box h2 = Box.createHorizontalBox();
        h2.add(searchButton);
        Box h3 = Box.createHorizontalBox();
        h3.add(searchResault);
        Box v = Box.createVerticalBox();
        v.add(Box.createVerticalStrut(25));
        v.add(h1);
        v.add(Box.createVerticalStrut(20));
        v.add(h2);
        v.add(Box.createVerticalStrut(10));
        v.add(h3);
        searchPanel = new JPanel(new FlowLayout());
        searchPanel.add(v);
        mainPanel.add("searchPanel",searchPanel);//添加进卡片

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int no = Integer.parseInt(searchInput.getText());
                searchResault.setText("查询到以下结果：\n");
                for (Student student:students) {
                    if(student.getNo()==no){
                        searchResault.append(student.toString());
                    }
                }
                if(searchResault.getLineCount()<=2){
                    searchResault.append("未找到任何结果，该学号不存在");
                }
            }
        });
    }
    public void setRemovePanel() {
        JLabel jLabel = new JLabel("请输入你要删除的学生学号：");
        removeInput = new JTextField(15);
        JButton removeButton = new JButton("确认删除");
        Box h1 = Box.createHorizontalBox();
        h1.add(jLabel);
        h1.add(removeInput);
        Box h2 = Box.createHorizontalBox();
        h2.add(removeButton);
        Box v = Box.createVerticalBox();
        v.add(Box.createVerticalStrut(150));
        v.add(h1);
        v.add(Box.createVerticalStrut(20));
        v.add(h2);
        removePanel = new JPanel(new FlowLayout());
        removePanel.add(v);
        mainPanel.add("removePanel",removePanel);//添加进卡片

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int no = Integer.parseInt(removeInput.getText());
                for (Student student:students) {
                    if(student.getNo()==no){
                        students.remove(student);
                        break;
                    }
                }
                int res = JOptionPane.showConfirmDialog(container, "删除成功，是否继续删除？",null,JOptionPane.YES_NO_OPTION);
                if(res ==JOptionPane.NO_OPTION) {
                    cardLayout.show(mainPanel, "detailPanel");
                    showDetails();
                }
            }
        });
    }
    public void setModifyPanel(){
        JLabel input = new JLabel("请输入你要修改的学生学号：");
        modifInput = new JTextField(15);
        JLabel no = new JLabel("学号修改为：");
        modifyNoInput = new JTextField(15);
        JLabel name = new JLabel("姓名修改为：");
        modifyNameInput = new JTextField(15);
        JLabel sex = new JLabel("性别修改为：");
        modifySexInput = new JTextField(15);
        JLabel age = new JLabel("年龄修改为：");
        modifyAgeInput = new JTextField(15);
        JLabel hobby = new JLabel("爱好修改为：");
        modifyHobbyInput = new JTextField(15);
        Box h0 = Box.createHorizontalBox();
        h0.add(input);
        h0.add(modifInput);
        Box h1 = Box.createHorizontalBox();
        h1.add(no);
        h1.add(modifyNoInput);
        Box h2 = Box.createHorizontalBox();
        h2.add(name);
        h2.add(modifyNameInput);
        Box h3 = Box.createHorizontalBox();
        h3.add(sex);
        h3.add(modifySexInput);
        Box h4 = Box.createHorizontalBox();
        h4.add(age);
        h4.add(modifyAgeInput);
        Box h5 = Box.createHorizontalBox();
        h5.add(hobby);
        h5.add(modifyHobbyInput);
        Box v = Box.createVerticalBox();
        v.add(Box.createVerticalStrut(25));
        v.add(h0);
        v.add(Box.createVerticalStrut(25));
        v.add(h1);
        v.add(Box.createVerticalStrut(25));
        v.add(h2);
        v.add(Box.createVerticalStrut(25));
        v.add(h3);
        v.add(Box.createVerticalStrut(25));
        v.add(h4);
        v.add(Box.createVerticalStrut(25));
        v.add(h5);
        v.add(Box.createVerticalStrut(25));
        JButton modifyButton = new JButton("修改");
        Box h6 =Box.createHorizontalBox();
        h6.add(modifyButton);
        v.add(h6);
        modifyPanel = new JPanel(new FlowLayout());
        modifyPanel.add(v);
        mainPanel.add("modifyPanel",modifyPanel);//添加进卡片
        modifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int no = Integer.parseInt(modifInput.getText());
                boolean flag = false;
                for(Student student:students){
                    if(no == student.getNo()){
                        flag = true;
                        int sno = Integer.parseInt(modifyNoInput.getText());
                        String name = modifyNameInput.getText();
                        String sex = modifySexInput.getText();
                        int age = Integer.parseInt(modifyAgeInput.getText());
                        String hobby = modifyHobbyInput.getText();
                        student.setNo(sno);
                        student.setAge(age);
                        student.setHobby(hobby);
                        student.setName(name);
                        student.setSex(sex);
                    }
                }
                if(flag) {
                    int res = JOptionPane.showConfirmDialog(container, "修改成功，是否继续修改", null, JOptionPane.YES_NO_OPTION);
                    if (res == JOptionPane.NO_OPTION) {
                        cardLayout.show(mainPanel, "detailPanel");
                        showDetails();
                    }
                }
                else {
                    JOptionPane.showMessageDialog(container,"未能找到要修改的学生学号","warning",JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
    public static void main(String[] args) {
        Main app =new Main();
        app.setSize(550,560);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
