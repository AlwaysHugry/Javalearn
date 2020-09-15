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
        return "ѧ�ţ�"+no+"   ����"+name+"  �Ա�"+sex+"  ���䣺"+age+"  ����:"+hobby+"\n";
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
        cardLayout = new CardLayout();//���ÿ�Ƭ����
        mainPanel.setLayout(cardLayout);
        container.setLayout(new FlowLayout());
        setMenu();//���ò˵�
        setDetailPanel();//��������ҳ
        setaddPanel();//������Ӷ���ҳ
        setRemovePanel();//����ɾ������ҳ
        setModifyPanel();//�����޸Ķ���ҳ
        setSearchPanel();//���ò�ѯ����ҳ
        container.add(mainPanel);
    }
    public void setMenu(){
        JMenu menu;
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        menu = new JMenu("�༭");
        menuBar.add(menu);
        JMenuItem mainItem = new JMenuItem("��ʾ����");
        mainItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(mainPanel,"detailPanel");//�л���Ƭҳ��
                showDetails();
            }
        });
        menu.add(mainItem);
        JMenuItem addItem = new JMenuItem("���");
        addItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(mainPanel,"addPanel");//�л���Ƭҳ��
                //����ϴ�����
                addNoInput.setText("");
                addAgeInput.setText("");
                addNameInput.setText("");
                addsexInput.setText("");
                addhobbyInput.setText("");
            }
        });
        menu.add(addItem);
        JMenuItem modifyItem = new JMenuItem("�޸�");
        modifyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(mainPanel,"modifyPanel");//�л���Ƭҳ��
                //����ϴ�����
                modifInput.setText("");
                modifyNoInput.setText("");
                modifyAgeInput.setText("");
                modifyNameInput.setText("");
                modifySexInput.setText("");
                modifyHobbyInput.setText("");
            }
        });
        menu.add(modifyItem);
        JMenuItem removeItem = new JMenuItem("ɾ��");
        removeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                removeInput.setText("");
                cardLayout.show(mainPanel,"removePanel");//�л���Ƭҳ��
            }
        });
        menu.add(removeItem);
        JMenuItem searchItem = new JMenuItem("��ѯ");
        searchItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(mainPanel,"searchPanel");//�л���Ƭҳ��
                //����ϴβ�ѯ���
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
        mainPanel.add("detailPanel",detailPanel);//��ӽ���Ƭ
    }
    public void showDetails(){
        jTextArea.setText("");
        jTextArea.append("����ѧ����Ϣ��\n\n");
        Integer index=0;
        for (Student student:students) {
            jTextArea.append((++index).toString()+". ");
            jTextArea.append(student.toString());
        }
        if(jTextArea.getLineCount()<=3){//�ж��Ƿ��ж���
            jTextArea.setText("���κ�ѧ����Ϣ");
        }
    }
    public void setaddPanel(){
        addPanel = new JPanel(new FlowLayout());
        JLabel no = new JLabel("ѧ�ţ�");
        addNoInput = new JTextField(15);
        JLabel name = new JLabel("������");
        addNameInput = new JTextField(15);
        JLabel sex = new JLabel("�Ա�");
        addsexInput = new JTextField(15);
        JLabel age = new JLabel("���䣺");
        addAgeInput = new JTextField(15);
        JLabel hobby = new JLabel("���ã�");
        addhobbyInput = new JTextField(15);

        //���ò���ΪBox
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
        JButton addButton = new JButton("���");
        Box h6 =Box.createHorizontalBox();
        h6.add(addButton);
        v.add(h6);
        addPanel.add(v);
        mainPanel.add("addPanel",addPanel);//��ӽ���Ƭ
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int no = Integer.parseInt(addNoInput.getText());
                String name = addNameInput.getText();
                String sex = addsexInput.getText();
                int age = Integer.parseInt(addAgeInput.getText());
                String hobby = addhobbyInput.getText();
                students.add(new Student(no,name,sex,age,hobby));
                JOptionPane.showMessageDialog(container, "��ӳɹ�",null,JOptionPane.PLAIN_MESSAGE);
                cardLayout.show(mainPanel,"detailPanel");
                showDetails();
            }
        });
    }
    public void setSearchPanel() {
        JLabel jLabel = new JLabel("��������Ҫ���ҵ�ѧ�ţ�");
        searchInput = new JTextField(15);
        JButton searchButton = new JButton("��ʼ����");
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
        mainPanel.add("searchPanel",searchPanel);//��ӽ���Ƭ

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int no = Integer.parseInt(searchInput.getText());
                searchResault.setText("��ѯ�����½����\n");
                for (Student student:students) {
                    if(student.getNo()==no){
                        searchResault.append(student.toString());
                    }
                }
                if(searchResault.getLineCount()<=2){
                    searchResault.append("δ�ҵ��κν������ѧ�Ų�����");
                }
            }
        });
    }
    public void setRemovePanel() {
        JLabel jLabel = new JLabel("��������Ҫɾ����ѧ��ѧ�ţ�");
        removeInput = new JTextField(15);
        JButton removeButton = new JButton("ȷ��ɾ��");
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
        mainPanel.add("removePanel",removePanel);//��ӽ���Ƭ

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
                int res = JOptionPane.showConfirmDialog(container, "ɾ���ɹ����Ƿ����ɾ����",null,JOptionPane.YES_NO_OPTION);
                if(res ==JOptionPane.NO_OPTION) {
                    cardLayout.show(mainPanel, "detailPanel");
                    showDetails();
                }
            }
        });
    }
    public void setModifyPanel(){
        JLabel input = new JLabel("��������Ҫ�޸ĵ�ѧ��ѧ�ţ�");
        modifInput = new JTextField(15);
        JLabel no = new JLabel("ѧ���޸�Ϊ��");
        modifyNoInput = new JTextField(15);
        JLabel name = new JLabel("�����޸�Ϊ��");
        modifyNameInput = new JTextField(15);
        JLabel sex = new JLabel("�Ա��޸�Ϊ��");
        modifySexInput = new JTextField(15);
        JLabel age = new JLabel("�����޸�Ϊ��");
        modifyAgeInput = new JTextField(15);
        JLabel hobby = new JLabel("�����޸�Ϊ��");
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
        JButton modifyButton = new JButton("�޸�");
        Box h6 =Box.createHorizontalBox();
        h6.add(modifyButton);
        v.add(h6);
        modifyPanel = new JPanel(new FlowLayout());
        modifyPanel.add(v);
        mainPanel.add("modifyPanel",modifyPanel);//��ӽ���Ƭ
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
                    int res = JOptionPane.showConfirmDialog(container, "�޸ĳɹ����Ƿ�����޸�", null, JOptionPane.YES_NO_OPTION);
                    if (res == JOptionPane.NO_OPTION) {
                        cardLayout.show(mainPanel, "detailPanel");
                        showDetails();
                    }
                }
                else {
                    JOptionPane.showMessageDialog(container,"δ���ҵ�Ҫ�޸ĵ�ѧ��ѧ��","warning",JOptionPane.WARNING_MESSAGE);
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
