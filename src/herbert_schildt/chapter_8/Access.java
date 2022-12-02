package herbert_schildt.chapter_8;

/*
В иерархии классов закрытые члены остаются закрытыми
в пределах своего класса.
Эта программа содержит ошибку, и поэтому
скомпилировать ее не удастся.
 */

// создать суперкласс
class A1 {
    int i; // этот член открыт по умолчанию,
    private int j; // а этот член закрыт в классе А

    void setIJ(int x, int y) {
        i = x;
        j = y;
    }
}

// Член j класса А в этом классе недоступен
class B1 extends A1 {
    int total;

    void sum() {
//        total = i + j; // ОШИБКА: член j в этом классе недоступен

    }
}

public class Access {
    public static void main(String[] args) {

        B1 subOb = new B1();
        subOb.setIJ(10, 20);

        subOb.sum();
        System.out.println("sum = " + subOb.total);
    }
}
