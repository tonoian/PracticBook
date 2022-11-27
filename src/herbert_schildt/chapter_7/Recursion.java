package herbert_schildt.chapter_7;

// Простой пример рекурсии
class Factorial {
    // это рекурсивный метод
    int fact(int n) {
        int result;

        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Факториал 5 равен: " + f.fact(5));
        System.out.println("Факториал 7 равен: " + f.fact(7));
        System.out.println("Факториал 4 равен: " + f.fact(4));
    }
}
