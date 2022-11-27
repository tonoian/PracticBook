package herbert_schildt.chapter_7;

// Объекты допускается передавать методам в качестве параметров
class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    // возвратить логическое значение true, если в качестве
    // параметра о указан вызывающий объект
    boolean equals(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        } else return false;
    }
}

public class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(100, 122);
        Test ob2 = new Test(100, 122);
        Test ob3 = new Test(-1, 1);
        Test ob4 = new Test(122, 100);

        System.out.println("ob1 == ob2: " + ob1.equals(ob2));
        System.out.println("ob1 == ob3: " + ob1.equals(ob3));
        System.out.println("ob3 == ob2: " + ob3.equals(ob2));
        System.out.println("ob4 == ob1: " + ob4.equals(ob1));
    }
}
