package herbert_schildt.chapter_10;

// В этой программе создается специальный тип исключения
public class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("Вызван метод compute(" + a + ")");
        if (a > 10)
            throw new MyException(a);
        System.out.println("Нормальное завершение");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}

class MyException extends Exception {
    private final int detail;

    public MyException(int detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MyException {" +
                "detail = " + detail +
                '}';
    }
}
