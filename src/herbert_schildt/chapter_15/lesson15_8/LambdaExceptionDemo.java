package herbert_schildt.chapter_15.lesson15_8;

public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};

        // В этом лямбда-выражении вычисляется среднее числовых
        // значений типа double в массиве
        DoubleNumericArrayFunc average = (n -> {
            double sum = 0;
            if (n.length == 0)
                throw new EmptyArrayException();

            for (double v : n) {
                sum += v;
            }
            return sum / n.length;
        });
        System.out.println("Среднее равно " + average.func(values));

        // Эта строка кода приводит к генерированию исключения
        System.out.println("Среднее равно " + average.func(new double[0]));
    }
}
