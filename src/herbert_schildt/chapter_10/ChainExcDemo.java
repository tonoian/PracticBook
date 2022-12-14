package herbert_schildt.chapter_10;

// Продемонстрировать цепочки исключений
public class ChainExcDemo {
    static void demo_pros() {
        // создать исключение
        NullPointerException e = new NullPointerException("верхний уровень");
        // добавить причину исключения
        e.initCause(new ArithmeticException("причина"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demo_pros();
        } catch (NullPointerException e) {
            // вывести исключение верхнего уровня
            System.out.println("Перехвачено исключение: " + e);

            // вывести исключение, послужившее причиной
            // для исключения верхнего уровня
            System.out.println("Первопричина : " + e.getCause());
        }
    }
}
