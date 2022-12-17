package herbert_schildt.chapter_11;

// В этой программе используется синхронизированный блок
class CallMe1 {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
        System.out.println("]");
    }
}

class Caller1 implements Runnable {
    String msg;
    CallMe1 target;
    Thread t;

    public Caller1(CallMe1 target, String msg) {
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }

    // синхронизированные вызовы метода call()
    @Override
    public void run() {
        synchronized (target) { // синхронизированный блок
            target.call(msg);
        }

    }
}

public class Sync1 {
    public static void main(String[] args) {
        CallMe1 target = new CallMe1();
        Caller1 ob1 = new Caller1(target, "Добро пожаловать");
        Caller1 ob2 = new Caller1(target, "в синхронизированны");
        Caller1 ob3 = new Caller1(target, "мир!");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
    }
}
