package herbert_schildt.chapter_12;

// Перечисление сортов яблок
enum Apple {
    JONATHAN,
    GOLDEN_DEL,
    RED_DEL,
    WINESAP,
    CORTLAND
}

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        ap = Apple.RED_DEL;

        // вывести значение перечислимого типа
        System.out.println("Значение ар: " + ap);
        System.out.println();

        ap = Apple.GOLDEN_DEL;

        // сравнить два значения перечислимого типа
        if (ap == Apple.GOLDEN_DEL)
            System.out.println("Переменная ар содержит GoldenDel.\n");

        // применить перечисление для управления оператором switch
        switch (ap) {
            case JONATHAN -> System.out.println("Сорт Jonathan красный.");
            case GOLDEN_DEL -> System.out.println("Сорт Golden Delicious желтый.");
            case RED_DEL -> System.out.println("Сорт Red Delicious красный.");
            case WINESAP -> System.out.println("Сорт Winesap красный.");
            case CORTLAND -> System.out.println("Сорт Cortland красный.");
        }
    }
}
