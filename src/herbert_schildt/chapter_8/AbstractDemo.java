package herbert_schildt.chapter_8;

// Простой пример абстракции
abstract class A7 {
    abstract void call_me();

    // абстрактные классы все же могут содержать конкретные методы
    void call_me_too() {
        System.out.println("Этo конкретный метод.");
    }
}

class B7 extends A7 {

    @java.lang.Override
    void call_me() {
        System.out.println("Реализация метода call_me() из класса В7.");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        B7 b = new B7();

        b.call_me();
        b.call_me_too();
    }
}
