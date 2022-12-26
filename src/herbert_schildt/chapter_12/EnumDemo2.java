package herbert_schildt.chapter_12;

// Воспользоваться встроенными в перечисление методами
// Перечисление сортов яблок
enum Apple2 {
    JONATHAN, GOLDEN_DEL, RED_DEL, WINESAP, CORTLAND
}

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple2 apple2;
        System.out.println("Константы перечислимого типа Apple:");

        // применить метод values()
        Apple2[] allApples = Apple2.values();
        for (Apple2 a : allApples)
            System.out.println(a);

        System.out.println();

        for (Apple2 b :
                Apple2.values()) {
            System.out.println(b);
        }

        System.out.println();

        // применить метод valueOf()
        apple2 = Apple2.valueOf("WINESAP");
        System.out.println("Переменная apple2 содержит " + apple2);
    }
}
