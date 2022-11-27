package herbert_schildt.chapter_5;
// Применение оператора break для выхода из цикла while
public class BreakLoop_2 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 100){
            if (i == 18){
                break;
            }
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("Цикл завершен.");
    }
}
