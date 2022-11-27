package herbert_schildt.chapter_5;
// Применение оператора break для выхода из цикла
public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; 1 < 100; i++){
            // выход из цикла, если значение переменной i равно 12
            if (i == 12){
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("Цикл завершен.");
    }
}
