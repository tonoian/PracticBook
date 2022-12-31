package herbert_schildt.chapter_13;

// Неудачное применение оператора assert!!!
public class AssertDemo1 {
    //  получить генератор случайных чисел
    static int val = 3;

    // возвратить целочисленное значение
    static int getNum() {
        return val--;
    }

    public static void main(String[] args) {
        int n = 0;
        for (int i = 0; i < 10; i++) {
            assert (n = getNum()) > 0; // Неудачная идея!
            System.out.println("n is " + n);
        }
    }
}
