package herbert_schildt.chapter_4;
// Продемонстрировать применение тернарной операции ?
public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i; //получить абсолютное значения переменной i
        System.out.println("абсолютное значения");
        System.out.println(i + " = " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("\nабсолютное значения");
        System.out.println(i + " = " + k);
    }
}
