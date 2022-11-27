package herbert_schildt.chapter_3;
// Вычисление среднего из массива значений
public class Average {
    public static void main(String[] args) {
        double[] numbers = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        for(int i = 0; i < numbers.length; i++){
            double num = numbers[i];
            System.out.println((i + 1) + " = " + num);
            result = result + numbers[i];
        }
        System.out.println("Average = " + result / numbers.length);
    }
}
