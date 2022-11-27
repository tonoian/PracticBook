package herbert_schildt.chapter_5;
// Применение цикла for встиле for each
public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // использовать цикл в стиле for each для вывода и
        // суммирования значений
        for (int x : numbers){
            System.out.println(" x = " + x);
            sum += x;
        }
        System.out.println("sum = " + sum);
    }
}
