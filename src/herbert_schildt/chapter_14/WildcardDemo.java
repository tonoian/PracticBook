package herbert_schildt.chapter_14;

// Применение метасимвола
class Stats1<T extends Number> {
    T[] numbs; // массив класса Number или его подкласса

    // передать конструктору ссылку на массив
    // элементов класса Number или его подкласса
    Stats1(T[] o) {
        numbs = o;
    }

    // возвратить значение типа double в любом случае
    double average() {
        double sum = 0.0;
        for (T numb : numbs) {
            sum += numb.doubleValue();
        }
        return sum / numbs.length;
    }

    // Определить равенство двух средних значений.
    // Обратите внимание на применение метасиывола
    boolean sameAvg(Stats1<?> ob) {
        return average() == ob.average();
    }
}

// Продемонстрировать применение метасимвола
public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] iNumbs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stats1<Integer> iob = new Stats1<>(iNumbs);
        double v = iob.average();
        System.out.println("Среднее значение iob равно: " + v);

        Double[] dNumbs = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
        Stats1<Double> dob = new Stats1<>(dNumbs);
        double w = dob.average();
        System.out.println("Среднее значение dob равно: " + w);

        Float[] fNumbs = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f};
        Stats1<Float> fob = new Stats1<>(fNumbs);
        double x = fob.average();
        System.out.println("Среднее значение fob равно: " + x);

        // выяснить, какие массивы имеют одинаковые средние значение
        System.out.print("Среднее значение iob & dob: ");
        if (iob.sameAvg(dob)) {
            System.out.println("равны.");
        } else {
            System.out.println("отличаются.");
        }
        System.out.print("Среднее значение iob & fob: ");
        if (iob.sameAvg(fob)) {
            System.out.println("одинаковы.");
        } else {
            System.out.println("отличаются.");
        }
    }
}