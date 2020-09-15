
/*
дһJava���򣬴���2���߳�thread1��thread2��
����thread1��˯��ʱ��Ϊ2S������ʱ�ı䵱ǰǰ����ɫ�����ô�����ɫ��ʾ�µ�ʱ�䣻
thread2��˯��ʱ��Ϊ5S������ʱ�ı䵱ǰǰ����ɫ�����ô�����ɫ��ʾ�µ�ʱ�䡣
�ٶ�����ʹ��5����ɫ�������졢�ڡ��ȡ��ơ�ÿ���߳�ѭ��ʹ����5����ɫ������ʾ��ǰʱ�䡣
*/
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.text.SimpleDateFormat;
public class work5 extends JApplet implements Runnable{
	Thread thread1,thread2;//�����졢�ڡ��ȡ���,
    TextField tf1,tf2;
	Color colors[]= {Color.BLUE,Color.RED,Color.black,Color.orange,Color.yellow};
	int now1=0,now2=0;
	public void init() {
		thread1=new Thread(this);
		thread2=new Thread(this);
		thread1.start();
		thread2.start();
	}public void run(){
		boolean flag=true;
		while(flag) {
			try {
				thread1.sleep(2000);repaint();now1=(now1+1)%5;
				thread2.sleep(3000);repaint();now2=(now2+1)%5;now1=(now1+1)%5;r
			}catch(InterruptedException e) {
				flag=false;
			}
		}
        public void paint(Graphics g) {
            super.paint(g);
            SimpleDateFormat formatter=new SimpleDateFormat("hh:mm:ss",Locale.getDefault());
            Date currentDate=new Date();
            String lastdate=formatter.format(currentDate);
            g.setColor(colors[now1]);
            g.drawString(lastdate, 5, 10);
            g.setColor(colors[now2]);
            g.drawString(lastdate, 5, 30);
        }
    
}