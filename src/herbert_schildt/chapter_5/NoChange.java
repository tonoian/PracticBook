package herbert_schildt.chapter_5;
// Переменная цикла в стиле for each доступна только для чтения
public class NoChange {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : numbers){
            System.out.print(x + " ");
            x = x * 10; // этот оператор не оказывает никакого
                        // влияния на массив numbers
//            System.out.print(x + " ");
        }
        System.out.println();
        for (int x : numbers){
            System.out.print(x + " ");
        }
    }
}
