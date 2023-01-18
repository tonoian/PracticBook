package herbert_schildt.chapter_15.lesson15_17;

public class ConstructorRefDemo3 {
    // Фабричный метод для объектов разных классов.
    // У каждого класса должен быть свой конструктор,
    // принимающий один параметр типа Т. А параметр R
    // обозначает тип создаваемого объекта
    static <R, T> R myClassFactory(MyFunc<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {

        // Создать ссылку на конструктор класса MyClass.
        // В данном случае оператор new обращается к конструктору,
        // принимающему аргумент
        MyFunc<MyClass<Double>, Double> myClassCons = MyClass::new;

        // создать экземпляр типа класса MyClass, используя фабричный метод
        MyClass<Double> mc = myClassFactory(myClassCons, 110.1);

        // использовать только что созданный экземпляр класса MyClass
        System.out.println("Значение val в объекте mc равно " + mc.getVal());

        // А теперь создать экземпляр другого класса
        // используя метод myClassFactory()
        MyFunc<MyClass2, String> myClassCons2 = MyClass2::new;

        // создать экземпляр класса MyClass, используя фабричный метод
        MyClass2 mc2 = myClassFactory(myClassCons2, "Лямбда");

        // использовать толь ко что созданный экземпляр класса MyClass
        System.out.println("Значение str в объекте mc2 равно " + mc2.getStr());
    }
}
