package herbert_schildt.chapter_10;

public class Exc2 {
    public static void main(String[] args) {
        int d;
        int a;

        try { // проконтролировать блок кода
            d = 0;
            a = 42 / d;
            System.out.println("Этo не будет выведено.");
        } catch (ArithmeticException e) { // перехватить ошибку деления на нуль
            System.out.println("Деление на нуль.");
        }
        System.out.println("После оператора catch.");
    }
}
