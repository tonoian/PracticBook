package herbert_schildt.chapter_3;
// Продемонстрировать приведение типов
public class Conversion {
    public static void main(String[] args) {
        byte b = 127;
        int i = 133;
        double d = 413.9458;

        System.out.println("b = " + b + ", i = " + i + ", d = " + d);

        System.out.println("\nПеробразавание типа int в тип byte.");
        b = (byte) i;
        System.out.println("i и b " + i + " и " + b);

        System.out.println("\nПеробразавание типа double в тип int.");
        i = (int) d;
        System.out.println("d и i " + d + " и " + i);

        System.out.println("\nПеробразавание типа double в тип byte.");
        b = (byte) d;
        System.out.println("d и b" + d + " и " + b);

        // явное приведение типов
        byte k = 50;
        k =(byte) (k + 2);
        System.out.println("\nk = " + k);
    }
}
