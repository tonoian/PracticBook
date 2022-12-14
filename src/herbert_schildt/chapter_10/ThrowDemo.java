package herbert_schildt.chapter_10;

// Продемонстрировать применение оператора throw
public class ThrowDemo {
    static void demo_pros() {
        try {
            throw new NullPointerException("демонстрация");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода demo_pros().");
            throw e; // повторно сгенерировать исключение
        }
    }

    public static void main(String[] args) {
        try {
            demo_pros();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: " + e);
        }
    }
}
