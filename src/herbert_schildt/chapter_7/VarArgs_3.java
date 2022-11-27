package herbert_schildt.chapter_7;

// Аргументы переменной длины и перегрузка
public class VarArgs_3 {
    static void vaTest(int... v) {
        System.out.print("vaTest(int ... ): Количество аргументов: "
                + v.length + " Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean ... ): Количество аргументов: "
                + v.length + " Содержимое: ");
        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(String st, int... v) {
        System.out.print("vaTest(String, int ... ): Количество аргументов: "
                + st + v.length + " Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 5, -6, 8, 9);
        vaTest(true, false, false);
        vaTest("Проверка: ", 10, 20);
        vaTest(" Проверка_1:");
    }
}
