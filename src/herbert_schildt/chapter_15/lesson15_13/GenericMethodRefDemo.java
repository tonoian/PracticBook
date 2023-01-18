package herbert_schildt.chapter_15.lesson15_13;

// В качестве первого параметра этого метода указывается
// функциональный интерфейс MyFunc, а в качестве двух других
// параметров - массив и значение, причем оба типа Т
public class GenericMethodRefDemo {
    static <T> int myOp(MyFunc<T> f, T[] values, T v) {
        return f.func(values, v);
    }

    public static void main(String[] args) {
        Integer[] values = {1, 2, 3, 4, 5, 6, 4, 2, 4};
        String[] str = {"Один", "Два", "Три", "Два"};
        int count;

        count = myOp(MyArrayOps::countMatching, values, 4);
        System.out.println("Массив values содержит " + count + " числа 4");

        count = myOp(MyArrayOps::countMatching, str, "Два");
        System.out.println("Массив str содержит " + count + " числа Два");
    }
}
