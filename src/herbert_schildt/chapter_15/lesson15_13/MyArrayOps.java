package herbert_schildt.chapter_15.lesson15_13;

// В этом классе определяется метод countMatching(), возвращающий
// количество элементов в массиве, равных указанному значению.
// Обратите внимание на то, что метод countMatching() является
// обобщенным, тогда как класс MyArrayOps - не обобщенным
public class MyArrayOps {
    static <T> int countMatching(T[] values, T v) {
        int count = 0;

        for (T value : values) {
            if (value == v) count++;
        }
        return count;
    }
}
