package herbert_schildt.chapter_7;

// Аргументы переменной длины, перегрузка и неоднозначность
// Эта программа содержит ошибку, и поэтому не может быть скомпилирована!
public class VarArgs_4 {
    static void vaTest(int... v) {
        System.out.print("vaTest(int ... ):  Количество аргументов: "
                + v.length + " Содержимое: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean ... ):  Количество аргументов: "
                + v.length + " Содержимое: ");
        for (boolean x : v)
            System.out.print(x + " ");
    }

    public static void main(String[] args) {
        vaTest(12, 45);
        vaTest(false, true);
//        vaTest(); // Ошибка: неоднозначность!
    }
}
