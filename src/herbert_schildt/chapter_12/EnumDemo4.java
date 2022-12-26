package herbert_schildt.chapter_12;

// Продемонстрировать применение методов ordinal(),
// compareТо() и equals()

// Перечисление сортов яблок
enum Apple4 {
    JONATHAN, GOLDEN_DEL, RED_DEL, WINESAP, CORTLAND
}

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple4 apple, apple2, apple3;

        // получить все порядковые значения с помощью метода ordinal()
        System.out.println("Bce константы сортов яблок и " +
                "их порядковые значения: ");
        for (Apple4 a : Apple4.values())
            System.out.println(a + ": " + a.ordinal());

        apple = Apple4.RED_DEL;
        apple2 = Apple4.GOLDEN_DEL;
        apple3 = Apple4.RED_DEL;

        System.out.println();

        // продемонстрировать применение методов compareTo() & ordinal()

        if (apple.compareTo(apple2) < 0)
            System.out.println(apple + " предшествует " + apple2);

        if (apple.compareTo(apple2) > 0)
            System.out.println(apple2 + " предшествует " + apple);

        if (apple.compareTo(apple3) == 0)
            System.out.println(apple + " равно " + apple3);

        System.out.println();

        if (apple.equals(apple2))
            System.out.println("Ошибка!");

        if (apple.equals(apple3))
            System.out.println(apple + " равно " + apple3);

        if (apple == apple3)
            System.out.println(apple + " == " + apple3);
    }
}
