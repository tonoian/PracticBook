package herbert_schildt.chapter_12;

// Использовать конструктор, переменную экземпляра и метод в перечислении
enum Apple3 {
    JONATHAN(10), GOLDEN_DEL, RED_DEL(12), WINESAP(15), CORTLAND(8);

    private final int price; // цена яблока каждого сорта

    // Конструктор
    Apple3(int p) {
        price = p;
    }

    Apple3() {
        price = -1;
    }

    int getPrice() {
        return price;
    }
}

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple3 apple3;
        apple3 = Apple3.CORTLAND;

        System.out.println(apple3 + " стоит " +
                apple3.getPrice() + " центов.");

        // вывести цену на яблоко сорта Winesap
        System.out.println("Яблоко сорта Winesap стоит " +
                Apple3.WINESAP.getPrice() + " центов.\n");


        // вывести цены на все сорта яблок
        System.out.println("Цены на все сорта яблок:\n");
        for (Apple3 a : Apple3.values())
            System.out.println(a + " стоит " +
                    a.getPrice() + " центов.");
    }
}
