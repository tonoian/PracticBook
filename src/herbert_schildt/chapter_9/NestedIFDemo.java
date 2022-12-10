package herbert_schildt.chapter_9;
// Пример вложенного интерфейса
// Этот класс содержит интерфейс как свой член

class A {
    // это вложенный интерфейс
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

// Класс В реализует вложенный интерфейс
class B implements A.NestedIF {

    @Override
    public boolean isNotNegative(int x) {
        return x >= 0;
    }
}

public class NestedIFDemo {
    public static void main(String[] args) {

        // использовать ссылку на вложенный интерфейс
        A.NestedIF nif = new B();

        if (nif.isNotNegative(10))
            System.out.println("Число 10 не отрицательное");
        if (nif.isNotNegative(-12))
            System.out.println("Этo не будет выведено");
    }
}
