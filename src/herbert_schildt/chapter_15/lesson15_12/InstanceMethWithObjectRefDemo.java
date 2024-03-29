package herbert_schildt.chapter_15.lesson15_12;

public class InstanceMethWithObjectRefDemo {
    // Метод, возвращающий количество экземпляров объекта,
    // найденных по критериям, задаваемым параметром
    // функционального интерфейс MyFunc
    static <T> int counter(T[] values, MyFunc<T> f, T v) {
        int count = 0;

        for (T value : values) {
            if (f.func(value, v))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int count;

        // создать массив объектов типа HighTemp
        HighTemp[] weekDayHighs = {
                new HighTemp(89), new HighTemp(82),
                new HighTemp(90), new HighTemp(89),
                new HighTemp(89), new HighTemp(91),
                new HighTemp(84), new HighTemp(83),
        };

        // Использовать метод counter() вместе с массивами объектов
        // типа HighTemp. Обратите внимание нато, что ссылка на метод
        // экземпляра sameTemp() передается в качестве второго параметра
        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println("Дней, когда максимальная температура была 89: " +
                count);

        // А теперь создать и использовать вместе с данным
        // методом еще один массив объектов типа HighTemp
        HighTemp[] weekDayHigh2 = {
                new HighTemp(-1), new HighTemp(12),
                new HighTemp(24), new HighTemp(19),
                new HighTemp(18), new HighTemp(12),
                new HighTemp(-1), new HighTemp(13),
        };
        count = counter(weekDayHigh2, HighTemp::sameTemp, new HighTemp(12));
        System.out.println("Дней, когда максимальная температура была 12: " +
                count);

        count = counter(weekDayHighs, HighTemp::lessThenTemp, new HighTemp(90));
        System.out.println("Дней, когда максимальная температура была 90: " +
                count);

        count = counter(weekDayHigh2, HighTemp::lessThenTemp, new HighTemp(13));
        System.out.println("Дней, когда максимальная температура была 13: " +
                count);
    }
}
