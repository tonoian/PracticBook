package herbert_schildt.chapter_12;

// Автоупаковка /распаковка происходит в выражениях
public class AutoBox3 {
    public static void main(String[] args) {
        Integer iOb1, iOb2;

        int i;
        iOb1 = 100;
        System.out.println("Исходноезначение iOb1: " + iOb1);
        System.out.println();

        // В следующем выражении автоматически распаковывается
        // объект iОb1, выполняется приращение получаемого значения,
        // которое затем упаковывается обратно в объект iOb1
        ++iOb1;
        System.out.println("После ++iOb1: " + iOb1);
        System.out.println();

        // Здесь объект iOb1 распаковывается, выражение вычисляется,
        // а результат снова упаковывается и присваивается объекту iОb2
        iOb2 = iOb1 + (iOb1 / 3);
        System.out.println("iOb2 после выражения: " + iOb2);
        System.out.println();

        // Здесь вычисляется то же самое выражение,
        // но результат не упаковывается
        i = iOb1 + (iOb1 / 3);
        System.out.println("i после выражения: " + i);
    }
}
