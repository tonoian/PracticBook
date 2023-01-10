package herbert_schildt.chapter_14;

// Использовать оператор instanceof в иерархии обобщенных классов
class Gen5<T> {
    T ob;

    public Gen5(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}

// Подкласс, производный от класса Gen5
class Gen6<T> extends Gen5<T> {
    public Gen6(T ob) {
        super(ob);
    }
}

// продемонстрировать последствия динамической идентификации
// типов в иерархии обобщенных классов
public class HereDemo3 {
    public static void main(String[] args) {
        // создать объект типа Gen5 для целых чисел
        Gen5<Integer> iOb = new Gen5<>(44);

        // создать объект типа Gen6 для целых чисел
        Gen6<Integer> iOb2 = new Gen6<>(33);

        // создать объект типа Gen6 для символьных строк
        Gen6<String> str = new Gen6<>("Тест обобщений");

        // проверить, является ли объект iOb2 какой-нибудь
        // из форм класса Gen6
        if (iOb2 instanceof Gen6<?>)
            System.out.println(
                    "Объект i0b2 является экземпляром класса Gen6"
            );

        // проверить, является ли объект iOb2 какой-нибудь
        // из форм класса Gen5
        if (iOb2 instanceof Gen5<?>)
            System.out.println(
                    "Объект i0b2 является экземпляром класса Gen5"
            );
        System.out.println();

        // проверить, является ли str объектом класса Gen5
        if (str instanceof Gen5<?>)
            System.out.println(
                    "Объект str является экземпляром класса Gen5"
            );

        // проверить, является ли str объектом класса Gen6
        if (str instanceof Gen6<?>)
            System.out.println(
                    "Объект str является экземпляром класса Gen6"
            );
        System.out.println();

        //  проверить, является ли iOb экземпляром класса Gen6,
        // что совсем не так
        if (iOb instanceof Gen6<?>) {
            System.out.println(
                    "Объект iOb является экземпляром класса Gen6"
            );
        }

        // проверить, является ли iOb экземпляром класса Gen,
        // что так и есть
        if (iOb instanceof Gen5<?>)
            System.out.println(
                    "Объект iOb является экземпляром класса Gen5"
            );

        // Следующий код не скомпилирует, так как сведения об
        // обобщенном типе отсутствуют во время выполнения
        if (iOb instanceof Gen6<Integer>)
            System.out.println(
                    "Объект str является экземпляром класса Gen6<Integer>"
            );
    }
}
