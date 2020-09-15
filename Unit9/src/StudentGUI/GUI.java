package StudentGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GUI extends JFrame{
    private ArrayList<Student> stu;//存储学生的链表
    Container container;
    JPanel mainJPanel,detailJPanel,addJPanel,modifyJPanel,searchJPanel;//主页面,详情,增加,修改,查询界面;
    CardLayout layout;//布局
    JMenuBar menuBar;
    JMenu menu;//菜单
    JMenuItem mainItem,detailItem,addItem,modifyItem,searchItem;//菜单选项

    public GUI()
    {
        super("Student GUI");
        container = getContentPane();
        container.setLayout(new FlowLayout());
        stu = new ArrayList<Student>();
        mainJPanel = new JPanel();//主界面
        layout = new CardLayout();
        mainJPanel.setLayout(layout);//添加主界面的布局
        setMenu();//设置菜单
        //setDetailJPanel();//设置
    }
    private void setMenu()
    {
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);//添加menu
        menu = new JMenu("菜单");
        menuBar.add(menu);
        mainItem = new JMenuItem("学生详情");
        mainItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event)
            {
                layout.show(mainJPanel, "学生详情");//切换成detail界面

            }
        });
    }
}