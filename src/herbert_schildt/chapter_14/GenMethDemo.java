package herbert_schildt.chapter_14;

// Продемонстрировать простой обобщенный метод
public class GenMethDemo {
    // определить, содержится ли объект в массиве
    static <T extends Comparable<T>, V extends T>
    boolean isIn(T x, V[] y) {
        for (V v : y) {
            if (x.equals(v))
                return true;
        }
        return true;
    }

    public static void main(String[] args) {
        // применить метод isIn() для целых чисел
        Integer[] numbers = {1, 2, 3, 4, 5};

        if (isIn(2, numbers))
            System.out.println("Число 2 содержится в массиве numbers");

        if (isIn(7, numbers))
            System.out.println("Число 7 отсутствует в массиве numbers");
        System.out.println();

        // применить метод isIn() для символьных строк
        String[] str = {"один", "два", "три", "четыре", "пять"};

        if (isIn("два", str))
            System.out.println("двa содержится в массиве str");

        if (isIn("семь", str))
            System.out.println("семь отсутствует в массиве str");

        // Не скомпилируется! Типы должны быть совместимы
///        if (isIn("два", numbers))
//            System.out.println("двa содержится в массиве str");
    }
}
