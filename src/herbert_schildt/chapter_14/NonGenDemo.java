package herbert_schildt.chapter_14;

// Класс NonGen - функциональный эквивалент класса Gen без обобщений
class NonGen {
    Object ob; // объект оb теперь имеет тип Object

    // передать конструктору ссылку на объект типа Object

    public NonGen(Object ob) {
        this.ob = ob;
    }

    // возвратить тип Object

    public Object getOb() {
        return ob;
    }

    // показать тип объекта оb
    void showType() {
        System.out.println("Объект оb относится к типу " +
                ob.getClass().getName());
    }
}

// продемонстрировать необобщенный класс
public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;

        // создать объект типа NonGen и сохранить в нем
        // объект типа Integer. Выполняется автоупаковка
        iOb = new NonGen(99);

        // показать тип данных, хранящихся в переменной iОb
        iOb.showType();

        // получить значение переменной iОb,
        // на этот раз требуется приведение типов
        int v = (Integer) iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        // создать другой объект типа NonGen и
        // сохранить в нем объект типа String
        NonGen strOb = new NonGen("Тест без обобщений");

        // показать тип данных, хранящихся в переменной strOb
        strOb.showType();

        // получить значение переменной strOb,
        // И в этом случае потребуется приведение типов
        String str = (String) strOb.getOb();
        System.out.println("Значение: " + str);

        // этот код компилируется, но он принципиально неверный!
        iOb = strOb;
        v = (Integer) iOb.getOb(); // Ошибка во время выполнения!
        System.out.println("Значение: " + v);
    }
}
