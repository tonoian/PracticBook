package herbert_schildt.chapter_10;

// Продемонстрировать многократный перехват
public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] value = {1, 2, 3};

        try {
            // сгенерировать исключение типа ArithmeticException
            int result = a / b;
            // сгенерировать исключение типа ArrayIndexOutOfBoundsException
            value[10] = 19;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
        System.out.println("После многократного перехвата.");
    }
}
