package StudentGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GUI extends JFrame{
    private ArrayList<Student> stu;//�洢ѧ��������
    Container container;
    JPanel mainJPanel,detailJPanel,addJPanel,modifyJPanel,searchJPanel;//��ҳ��,����,����,�޸�,��ѯ����;
    CardLayout layout;//����
    JMenuBar menuBar;
    JMenu menu;//�˵�
    JMenuItem mainItem,detailItem,addItem,modifyItem,searchItem;//�˵�ѡ��

    public GUI()
    {
        super("Student GUI");
        container = getContentPane();
        container.setLayout(new FlowLayout());
        stu = new ArrayList<Student>();
        mainJPanel = new JPanel();//������
        layout = new CardLayout();
        mainJPanel.setLayout(layout);//���������Ĳ���
        setMenu();//���ò˵�
        //setDetailJPanel();//����
    }
    private void setMenu()
    {
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);//���menu
        menu = new JMenu("�˵�");
        menuBar.add(menu);
        mainItem = new JMenuItem("ѧ������");
        mainItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event)
            {
                layout.show(mainJPanel, "ѧ������");//�л���detail����

            }
        });
    }
}