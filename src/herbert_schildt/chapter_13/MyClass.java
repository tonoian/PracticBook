package herbert_schildt.chapter_13;

public class MyClass {
    int a;
    int b;

    // инициализировать поля а и b по отдельности
    MyClass(int i, int j) {
        a = i;
        b = j;
    }

    // инициализировать поля а и Ь одним и тем же значением
    MyClass(int i) {
        this(i, i);
    }

    // присвоить полям а и Ь нулевое значение по умолчанию
    MyClass() {
        this(0); // а по этой ссылке вызывается
        // конструктор MyClass(О)
    }

    public static void main(String[] args) {
        MyClass mc = new MyClass(4, 6);
        MyClass mc1 = new MyClass(8);
        MyClass mc2 = new MyClass();

        System.out.println(mc.a + " " + mc.b);
        System.out.println(mc1.a + " " + mc1.b);
        System.out.println(mc2.a + " " + mc2.b);
    }
}
