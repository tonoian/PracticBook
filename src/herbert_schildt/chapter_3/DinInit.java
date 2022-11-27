package herbert_schildt.chapter_3;
//  В этом примере демонстрируется динамическая инициализация
public class DinInit {
    static double a = 3.0;
    static  double b = 4.0;

    public static void main(String[] args) {
        // демонстрируе инициализация переменной c
        double c = Math.sqrt(a * a + b * b);
        System.out.println("a = " + a + "\n" + "b = " + b);
        System.out.println("Гипотенуза равна \n     c = " + c);
    }
}
