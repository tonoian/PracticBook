package herbert_schildt.chapter_15.lesson15_18;

import java.util.function.Function;

// Использовать в строенный функциональный интерфейс Function
// импортировать функциональный интерфейс Function
public class UseFunctionInterfaceDemo {
    public static void main(String[] args) {
        // Это блочное лямбда-выражение вычисляет факториал
        // целочисленного значения. Для этой цели на сей раз
        // используется функциональный интерфейс Function
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("Фaктopиaл числа 5 равен " + factorial.apply(5));
        System.out.println("Фaктopиaл числа 8 равен " + factorial.apply(8));
    }
}
