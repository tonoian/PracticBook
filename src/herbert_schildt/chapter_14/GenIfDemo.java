package herbert_schildt.chapter_14;

// Пример применения обобщенного интерфейса
// Обобщенный интерфейс МinМах для определения
// минимального и максимального значений
interface MinMax<T extends Comparable<T>> {
    T min();

    T max();
}

// реализовать обобщенный интерфейс МinMaх
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] val;

    public MyClass(T[] val) {
        this.val = val;
    }

    // возвратить минимальное значение из массива val
    @Override
    public T min() {
        T v = val[0];

        for (int i = 0; i < val.length; i++) {
            if (val[i].compareTo(v) < 0) v = val[i];
        }
        return v;
    }

    // возвратить максимальное значение и з массива val
    @Override
    public T max() {
        T v = val[0];

        for (int i = 0; i < val.length; i++) {
            if (val[i].compareTo(v) > 0) v = val[i];
        }
        return v;
    }
}

public class GenIfDemo {
    public static void main(String[] args) {
        Integer[] iNum = {3, 9, 11, 1, 45, -16};
        Character[] chs = {'a', 'p', 'e', 'z', 'g'};

        MyClass<Integer> iOb = new MyClass<>(iNum);
        MyClass<Character> cOb = new MyClass<>(chs);

        System.out.println("максимальное значение в .массиве iNum: " +
                iOb.max());
        System.out.println("минимальное значение в массиве iNum:" +
                iOb.min());

        System.out.println("максимальное значение в массиве chs: " +
                cOb.max());
        System.out.println("минимальное значение в массиве chs: " +
                cOb.min());
    }
}
