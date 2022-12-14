package herbert_schildt.chapter_10;

import java.util.Random;

// Обработать исключение и продолжить работу
public class HandleError {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        Random r = new Random();

        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Деление на нуль." + e);
                a = 0; // присвоить нуль и продолжить работу
            }
            System.out.println("a: " + a);
        }
    }
}
