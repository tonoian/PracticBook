package herbert_schildt.chapter_8;

// Динамическая диспетчеризация методов
class A6 {
    void call_me() {
        System.out.println("B методе call_me() из класса А6");
    }
}

class B6 extends A6 {
    // переопределить метод call_me()
    void call_me() {
        System.out.println("B методе call_me() из класса B6");
    }
}

class C6 extends A6 {
    // переопределить метод call_me()
    void call_me() {
        System.out.println("B методе call_me() из класса C6");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        A6 a = new A6(); // объект класса A6
        B6 b = new B6(); // объект класса B6
        C6 c = new C6(); // объект класса C6

        A6 r; // получить ссылку на объект типа А6


        r = a; // переменная r ссылается на объект типа А6
        r.call_me(); // вызвать вариант метода call_me(),
        // определенный в классе А6

        r = b; // переменная r ссылается на объект типа B6
        r.call_me(); // вызвать вариант метода call_me(),
        // определенный в классе B6

        r = c; // переменная r ссылается на объект типа C6
        r.call_me(); // вызвать вариант метода call_me(),
        // определенный в классе C6
    }
}
