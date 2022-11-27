package herbert_schildt.chapter_7;

// Использовать аргументы переменной
// со стандартными аргументами
public class VarArgs_2 {
    static void vaTest(String st, int... v) {
        System.out.print(st + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("параметр переменной длины: ", 12);
        vaTest("параметра переменной длины: ", 1, 2, 3);
        vaTest("Бeз параметров переменной длины:");
    }
}
