package herbert_schildt.chapter_15.lesson15_15;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        // Создать ссылку на конструктор класса MyClass.
        // Метод func() из интерфейса MyFunc принимает аргумент,
        // поэтому оператор new обращается к параметризованному
        // конструктору класса MyClass, а не к его конструктору по умолчанию
        MyFunc myClassCons = MyClass::new;

        // создать экземпляр класса MyClass по ссылке на его конструктор
        MyClass mc = myClassCons.func(100);

        // использовать толь ко что созданный экземпляр класса MyClass
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
