package herbert_schildt.chapter_7;

// Аргументы примитивных типов передаются по значению
class Test_1 {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        Test_1 ob = new Test_1();

        int a = 15;
        int b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        ob.meth(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
