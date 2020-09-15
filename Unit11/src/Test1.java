public class Test1 {
    private static class PrintThread extends Thread {
        private int sleeptime;

        public PrintThread(String name) {
            super(name);
            sleeptime = (int) (Math.random() * 5000);
        }

        public void run() {
            try {
                System.out.println(getName() + "进入睡眠状态,睡眠时间为:" + sleeptime);
                sleep(sleeptime);
            } catch (InterruptedException e) {
                System.out.println(getName() + "be interrupted");
            }
            System.out.println("睡眠醒来");
        }
    }
    public static void main(String []args)
    {
        PrintThread a = new PrintThread("thread1");
        PrintThread b = new PrintThread("thread2");
        PrintThread c = new PrintThread("thread3");
        System.out.println("主线程将启动这三个线程:");
        a.start();
        b.start();
        c.start();
        System.out.println("三个线程启动完成:");
    }
}