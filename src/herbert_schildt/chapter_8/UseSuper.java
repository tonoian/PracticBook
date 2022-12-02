package herbert_schildt.chapter_8;

// Использовать ключевое слово super с целью предотвратить сокрытие имен
class A2 {
    int i;
}

// создать подкласс путем расширения класса А2
class B2 extends A2 {
    int i; // этот член i скрывает член i из класса А2

    B2(int a, int b) {
        super.i = a; // член i из класса А2
        this.i = b; // член i из класса B2
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + this.i);
    }

}

public class UseSuper {
    public static void main(String[] args) {
        B2 subOb = new B2(1, 2);

        subOb.show();
    }
}
