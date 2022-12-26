package herbert_schildt.chapter_12;

// Ошибка, порождаемая ручной распаковкой
public class UnboxingError {
    public static void main(String[] args) {
        Integer iOb = 1000; // автоупаковка значения 1000

        // ручная распаковка значения как относящегося к типу byte!!!
        int i = iOb.byteValue();

        System.out.println(i); // значение 1000 не выводится!

        //  Неудачное применение автоупаковки и автораспаковки!
        Double a, b, c;

        a = 3.0;
        b = 4.0;
        c = Math.sqrt(a * a + b * b);
        System.out.println("Гипотенуза равна: " + c);
    }
}
