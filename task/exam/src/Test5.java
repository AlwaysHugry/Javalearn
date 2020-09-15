
/*
写一Java程序，创建2个线程thread1及thread2，
其中thread1的睡眠时间为2S，醒来时改变当前前景颜色，并用此新颜色显示新的时间；
thread2的睡眠时间为5S，醒来时改变当前前景颜色，并用此新颜色显示新的时间。
假定程序使用5种颜色：蓝、红、黑、橙、黄。每个线程循环使用这5种颜色按序显示当前时间。
*/
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.text.SimpleDateFormat;
public class work5 extends JApplet implements Runnable{
	Thread thread1,thread2;//蓝、红、黑、橙、黄,
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