package herbert_schildt.chapter_5;
// Применение цикла for в стиле for each для
// обращения к двухмерному массиву
public class ForEach_3 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] numbers = new int[3][5];

        // присвоить значение элементам массива numbers
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++){
                numbers[i][j] = (i + 1) * (j + 1);
            }
        }
        // использовать цикл for в стиле for each для
        // вывода и суммирования значений
        for (int x[] : numbers){
            for (int y : x){
                System.out.println("y = " + y);
                sum += y;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
