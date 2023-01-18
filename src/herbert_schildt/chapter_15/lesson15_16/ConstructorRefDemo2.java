package herbert_schildt.chapter_15.lesson15_16;

public class ConstructorRefDemo2 {
    public static void main(String[] args) {

        //  создать ссылку на конструктор обобщенного класса MyClass<T>
        MyFunc<Integer> myClassCons = MyClass::new;

        // создать экземпляр класса MyClass<T>
        // по данной ссылке на конструктор
        MyClass<Integer> mc = myClassCons.func(120);

        // воспользоваться только что созданным
        // экземпляром класса MyClass<T>
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
