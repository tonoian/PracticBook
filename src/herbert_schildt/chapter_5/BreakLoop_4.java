package herbert_schildt.chapter_5;
// Применение оператора break для выхода из вложенных циклов
public class BreakLoop_4 {
    public static void main(String[] args) {
        outer: for (int i = 0; i < 3; i++){
            System.out.print("Step " + i + ": ");
            for (int j = 0; j < 100; j++){
                if (j == 15) break outer; // выход из обоих циклов
                System.out.print(j + " ");
            }
            System.out.println("Этa строка не будет выводиться");
        }
        System.out.println("\nЦиклы завершены.");
    }
}
