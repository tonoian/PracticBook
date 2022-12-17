package herbert_schildt.chapter_11;

// Правильная реализация поставщика и потребителя
class Q1 {
    int n;
    boolean valueSet = false;

    synchronized void get() {
        while (!valueSet)
            try {
                wait();
//                Thread.sleep(500); ///////////////////
            } catch (InterruptedException e) {
                System.out.println("Исключение типа InterruptedException перехвачено");
            }

        System.out.println("Получено: " + n);
        valueSet = false;
        notify();
    }

    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
                Thread.sleep(500); ////////////////////
            } catch (InterruptedException e) {
                System.out.println("Исключение типа InterruptedException перехвачено");
            }
        this.n = n;
        valueSet = true;
        System.out.println("Отправлено: " + n);
        notify();
    }
}

class Producer1 implements Runnable {
    Q1 q;

    public Producer1(Q1 q) {
        this.q = q;
        new Thread(this, "Поставщик").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer1 implements Runnable {
    Q1 q;

    public Consumer1(Q1 q) {
        this.q = q;
        new Thread(this, "отребитель").start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}

public class PCFixed {
    public static void main(String[] args) {
        Q1 q = new Q1();
        new Producer1(q);
        new Consumer1(q);

        System.out.println("Для остановки нажмите Ctrl-C.");
    }
}
