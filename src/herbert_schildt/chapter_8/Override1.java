package herbert_schildt.chapter_8;

// Методы с отличающимися сигнатурами считаются
// перегружаемыми, а не переопределяемыми
class A5 {
    int i, j;

    A5(int a, int b) {
        i = a;
        j = b;
    }

    // вывести содержимое переменных i и j
    void show() {
        System.out.println("i и j: " + i + " и " + j);
    }
}

// создать подкласс путем расширения класса A5
class B5 extends A5 {
    int k;

    B5(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // перегрузить метод show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}

public class Override1 {
    public static void main(String[] args) {
        B5 subOb = new B5(4, 5, 6);

        subOb.show("Это k: "); // вызвать метод show() из класса В5
        subOb.show(); // вызвать метод show() из класса А5
    }
}
