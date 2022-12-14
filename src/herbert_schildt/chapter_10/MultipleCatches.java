package herbert_schildt.chapter_10;

import java.util.Scanner;

// Продемонстрировать применение нескольких операторов
public class MultipleCatches {

    public static void main(String[] args) {
        try {
            int a = args.length;
//            a = 1;
            System.out.println("a = " + a);
            int b = 42 / a;
            int[] c = {1};
            c[2] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации за пределами массива: " + e);
        }
        System.out.println("После блока операторов try/catch.");
    }
}
