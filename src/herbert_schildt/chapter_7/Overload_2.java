package herbert_schildt.chapter_7;

// Применить автоматическое преобразование типов к перегрузке
class OverloadDemo_2 {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    // Перегружаемый метод, проверяющий наличие наличие
    // двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a & b: " + a + " " + b);
    }

    // Перегружаемый метод, проверяющий наличие
    // параметра типа double
    void test(double a) {
        System.out.println("Внутреннее преобразование при вызове test (double) a: " + a);
    }
}

public class Overload_2 {
    public static void main(String[] args) {
        OverloadDemo_2 ob = new OverloadDemo_2();
        int i = 88;

        ob.test();
        ob.test(10, 20);
        ob.test(i);
        ob.test(12.5);
    }
}
