package herbert_schildt.chapter_14;
// Переопределение обобщенного метода в обобщенном классе
class Gen7<T>{
    T ob; // объявить объект типа Т

    public Gen7(T ob) {
        this.ob = ob;
    }

    // возвратить объект ob

    public T getOb() {
        System.out.print("Метод getOb() из класса Gеn7: ");
        return ob;
    }
}

// Подкласс, производный от класса Gen7 и
// переопределяющий ме тод getOb()
class Gen8<T> extends Gen7<T>{
    public Gen8(T ob) {
        super(ob);
    }
    // переопределить метод getOb()
    public T getOb(){
        System.out.print("Метод getOb() из класса Gen8: ");
        return ob;
    }
}

// продемонстрировать переопределение обобщенных методов
public class OverrideDemo {
    public static void main(String[] args) {
        // создать объект типа Gen7 для целых чисел
        Gen7<Integer> iOb = new Gen7<>(11);

        // создать объект типа Gen8 для целых чисел
        Gen8<Integer> iOb2 = new Gen8<>(22);

        // создать объект типа Gen8 для символьных строк
        Gen8<String> sOb = new Gen8<>("Тест обобщений");

        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(sOb.getOb());
    }
}
