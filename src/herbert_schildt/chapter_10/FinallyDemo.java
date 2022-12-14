package herbert_schildt.chapter_10;

// Продемонстрировать применение оператора finally
public class FinallyDemo {
    // сгенерировать исключение в методе
    static void pros_a() {
        try {
            System.out.println("B теле метода pros_a()");
            throw new RuntimeException("демонстрация");
        } finally {
            System.out.println("Блок оператора finally в методе pros_a()");
        }
    }

    // возвратить управление из блока оператора try
    static void pros_b() {
        try {
            System.out.println("B теле метода pros_b()");
            return;
        } finally {
            System.out.println("Блок оператора finally в методе pros_b()");
        }
    }

    // выполнить блок try, как обычно
    static void pros_c() {
        try {
            System.out.println("B теле метода pros_c()");
        } finally {
            System.out.println("Блок оператора finally в методе pros_c()");
        }
    }

    public static void main(String[] args) {
        try {
            pros_a();
        } catch (Exception e) {
            System.out.println("Перехвачено исключение");
        }
        pros_b();
        pros_c();
    }
}
