package herbert_schildt.chapter_7;

// Объекты передаются по ссылке на них
class Test_2 {
    int a, b;

    Test_2(int i, int j) {
        a = i;
        b = j;
    }

    // передать объект
    void meth(Test_2 o) {
        o.a *= 2;
        o.b /= 2;
    }
}

public class PassObjRe {
    public static void main(String[] args) {
        Test_2 ob = new Test_2(15, 20);
        System.out.println("до вызова meth:");
        System.out.println("ob.a = " + ob.a);
        System.out.println("ob.b = " + ob.b);

        ob.meth(ob);
        System.out.println("после вызова meth:");
        System.out.println("ob.a = " + ob.a);
        System.out.println("ob.b = " + ob.b);
    }
}
