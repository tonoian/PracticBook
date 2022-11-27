package herbert_schildt.chapter_5;
// Применение оператора break во вложенных циклах
public class BreakLoop_3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            System.out.print("Step " + i + ": ");
            for (int j = 0; j < 100; j++){
                if (j == 15){
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}
