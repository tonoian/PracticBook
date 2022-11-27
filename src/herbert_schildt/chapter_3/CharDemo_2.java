package herbert_schildt.chapter_3;
// Символьные переменные ведут себя как целочисленные значения
public class CharDemo_2 {
    public static void main(String[] args) {
        char ch1, ch2;

        ch1 = 'X';
        System.out.println("ch1 содержит " + ch1);

        ch1++; // увеличить на единицу значение переменной ch1
        System.out.println("ch1 теперь содержит " + ch1);

        ch2 = 89;
        System.out.println("ch2 содержит " + ch2);

        ch2++; // увеличить на единицу значение переменной ch2
        System.out.println("ch2 теперь содержит " + ch2);
    }
}
