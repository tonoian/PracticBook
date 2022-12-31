package herbert_schildt.chapter_13;

// Продемонстрировать применение оператор а assert
public class AssertDemo {
    static int val = 3;

    // возвратить целочисленное значение
    static int getNum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++) {
            n = getNum();

//            assert n > 0; // не подтвердится, если n == О
            assert n > 0 : "n отрицательное!";
            System.out.println("n = " + n);
        }
    }
}
