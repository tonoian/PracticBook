package herbert_schildt.chapter_7;

// Продемонстрировать применение аргументов переменной длины
public class VarArgs {
    static void vaTest(int... v) {
        System.out.print("Количество аргументов: "
                + v.length + "  Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(15, 25);
        vaTest(1, 2, 5, -4);
        vaTest();
    }
}
