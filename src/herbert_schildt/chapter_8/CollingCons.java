package herbert_schildt.chapter_8;

// Продемонстрировать порядок вызова конструкторов
// создать суперкласс
class A3 {
    A3() {
        System.out.println("B конструкторе А3.");
    }
}

// создать подкласс путем расширения класса А
class B3 extends A3 {
    B3() {
        System.out.println("B конструкторе B3.");
    }
}

// создать еще один подкласс путем расширения класса B3
class C3 extends B3 {
    C3() {
        System.out.println("B конструкторе C3.");
    }
}

public class CollingCons {
    public static void main(String[] args) {
        C3 c = new C3();
    }
}
