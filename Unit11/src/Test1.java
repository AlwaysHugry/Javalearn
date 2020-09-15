public class Test1 {
    private static class PrintThread extends Thread {
        private int sleeptime;

        public PrintThread(String name) {
            super(name);
            sleeptime = (int) (Math.random() * 5000);
        }

        public void run() {
            try {
                System.out.println(getName() + "����˯��״̬,˯��ʱ��Ϊ:" + sleeptime);
                sleep(sleeptime);
            } catch (InterruptedException e) {
                System.out.println(getName() + "be interrupted");
            }
            System.out.println("˯������");
        }
    }
    public static void main(String []args)
    {
        PrintThread a = new PrintThread("thread1");
        PrintThread b = new PrintThread("thread2");
        PrintThread c = new PrintThread("thread3");
        System.out.println("���߳̽������������߳�:");
        a.start();
        b.start();
        c.start();
        System.out.println("�����߳��������:");
    }
}