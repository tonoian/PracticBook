package herbert_schildt.chapter_11;

// Создать несколько потоков исполнения
class NewThread_2 implements Runnable {
    String name; // имя потока исполнения
    Thread t;

    NewThread_2(String name) {
        this.name = name;
        t = new Thread(this, name);
        t.start(); // запустить поток на исполнение
    }

    // Точка входа в поток исполнения
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен.");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {

        new NewThread_2("Один"); // запустить потоки на исполнение
        new NewThread_2("Двa");
        new NewThread_2("Tpи");
        new NewThread_2("One");
        new NewThread_2("Two");
        new NewThread_2("Three");

        try {
            // ожидать завершения других потоков исполнения
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен.");
    }
}
