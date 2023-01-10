package herbert_schildt.chapter_14;

// Простой обобщенный класс с двумя параметрами типа : Т и V
class TwoGen<T, V> {
    T ob1;
    V ob2;

    // передать конструктору ссылки на объекты типа Т и V
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    // показать типы Т и V
    void showType() {
        System.out.println("Tип Т: " + ob1.getClass().getName());
        System.out.println("Tип V: " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}

// продемонс трировать применение класса ТwoGen
public class SimpleGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(77, "Обобщения");

        // показать типы
        tgObj.showType();

        // Получить и показать значения
        int v = tgObj.getOb1();
        System.out.println("Значение: " + v);

        String str = tgObj.getOb2();
        System.out.println("Значение: " + str);
    }
}
