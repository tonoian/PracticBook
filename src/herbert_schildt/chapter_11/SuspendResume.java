package herbert_schildt.chapter_11;

// Приостановка и возобновление исполнения потока современным способом
class NewThread1 implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    public NewThread1(String threadName) {
        this.name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        suspendFlag = false;
        t.start(); // запустить поток исполнения
    }

    // Точка входа в поток исполнения
    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(500);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван .");
        }
        System.out.println(name + " завершен.");
    }

    synchronized void mySuspend() {
        suspendFlag = true;
    }

    synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}

public class SuspendResume {
    public static void main(String[] args) {
        NewThread1 ob1 = new NewThread1("Один");
        NewThread1 ob2 = new NewThread1("Двa");

        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("Приостановка потока Один");
            Thread.sleep(1000);
            ob1.myResume();
            System.out.println("Возобновление потока Один");
            ob2.mySuspend();
            System.out.println("Приостановка потока Двa");
            Thread.sleep(2000);
            ob2.myResume();
            System.out.println("Возобновление потока Двa");
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        // ожидать завершени я потоков исполнения
        try {
            System.out.println("Ожидание завершения потоков.");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
