package herbert_schildt.chapter_7;

// Возврат объекта
class Test_3 {
    int a;

    Test_3(int i) {
        a = i;
    }

    Test_3 incrementByTen() {
        Test_3 temp = new Test_3(a + 10);
        return temp;
    }
}

public class RetOb {
    public static void main(String[] args) {
        Test_3 ob1 = new Test_3(2);
        Test_3 ob2;

        ob2 = ob1.incrementByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrementByTen();
        System.out.println("ob2.a после второго увеличения значения: " + ob2.a);
    }
}
