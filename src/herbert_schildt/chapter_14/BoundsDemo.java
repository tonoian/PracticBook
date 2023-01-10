package herbert_schildt.chapter_14;

// В этой версии класса Stats аргумент типа Т должен быть
// классом Number или наследуемым от него классом
class Stats<T extends Number> {
    T[] numbers; // массив класса Number или его подкласса

    // передать конструктору ссылку на массив элементов
    // класса Number или его подкласса
    Stats(T[] o) {
        numbers = o;
    }

    // возвратить значение типа double в любом случае
    double average() {
        double sum = 0.0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return sum / numbers.length;
    }
}

// продемонстрировать применение класса Stats
public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] iNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stats<Integer> iOb = new Stats<>(iNumbers);
        double v = iOb.average();
        System.out.println("Среднее значение iOb равно " + v);

        Double[] dNumbers = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
        Stats<Double> dOb = new Stats<>(dNumbers);
        double w = dOb.average();
        System.out.println("Среднее значение dOb равно " + w);

        /*
        Этот код не скомпилируется, так как класс String
        не является производным от класса Number
        String[] strS = {"1", "2", "3", "4", "5", ...};
        Stats <String> strOb = new Stats <String> (strS);
        double х = strOb.average();
        System.out.println ("Среднее значение strOb равно " + v );
         */
    }
}
