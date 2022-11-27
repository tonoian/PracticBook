package herbert_schildt.chapter_5;
// Применение оператора break в цикле for в стиле for each
public class ForEach_2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // использовать цикл for в стиле for each для
        // вывода и суммирования значений из части массива
        for (int x : numbers){
            System.out.println("x = " + x);
            sum += x;
            if (x == 8) {
                break;
            }
        }
        System.out.println("sum = " + sum);
    }
}
