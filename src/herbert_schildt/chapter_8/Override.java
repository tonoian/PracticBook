package herbert_schildt.chapter_8;

// Переопределение метода
class A4 {
    int i, j;

    A4(int a, int b) {
        i = a;
        j = b;
    }

    // вывести содержимое переменных i и j
    void show() {
        System.out.println("i и j: " + i + " и " + j);
    }
}

class B4 extends A4 {
    int k;

    B4(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // вывести содержимое переменной k с помощью метода,
    // переопределяющего метод show() из класса А4
    void show() {
        super.show(); // эдесь вызывается метод show() из класса А4
        System.out.println("k: " + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B4 subOb = new B4(1, 2, 3);
        subOb.show(); // здесь вызывается метод show() из класса В4

    }
}
