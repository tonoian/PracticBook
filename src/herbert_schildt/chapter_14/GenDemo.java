package herbert_schildt.chapter_14;

/*
Простой обобщенный класс.
Здесь Т обозначает параметр типа,
который будет заменен реальным типом
при создании объекта типа Gen
 */
class Gen<T> {
    T ob; // объявить объект типа Т

    // передать конструктору ссылку на объект типа Т
    Gen(T o) {
        ob = o;
    }

    // озвратить объект ob
    T getOb() {
        return ob;
    }

    // показать тип Т
    void showType() {
        System.out.println("Типом Т является " + ob.getClass().getName());
    }
}

public class GenDemo {
    public static void main(String[] args) {
        // Создать ссылку типа Gen для целых чисел
        Gen<Integer> iOb;

        /*
        Создать объект типа Gen<Integer> и присвоить
        ссылку на него переменной iОb. Обратите внимание на
        применение автоупаковки для инкапсуляции значения 88
        в объекте типа Integer
         */
        iOb = new Gen<>(88);

        // показать тип данных, хранящихся в переменной iОb
        iOb.showType();

        // получить значение переменной iОb. Обратите внимание на
        // что для этого не требуется никакого приведения типов
        int v = iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        // создать объект типа Gen для символьных строк
        Gen<String> strOb = new Gen<>("Тест обобщений");

        // показать тип данных, хранящихся в переменной strOb
        strOb.showType();

        // получить значение переменной strOb. И в этом случае
        // приведение типов не требуется
        String str = strOb.getOb();
        System.out.println("Значение: " + str);
    }
}
