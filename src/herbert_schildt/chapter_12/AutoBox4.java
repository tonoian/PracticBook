package herbert_schildt.chapter_12;

public class AutoBox4 {
    public static void main(String[] args) {
        Integer iOb = 100;
        Double dOb = 98.9;

        dOb = dOb + iOb;
        System.out.println("dOb после выражения: " + dOb);

        iOb = 12;
        switch (iOb) {
            case 1 -> System.out.println("один");
            case 2 -> System.out.println("двa");
            default -> System.out.println("ошибка");
        }
    }
}
