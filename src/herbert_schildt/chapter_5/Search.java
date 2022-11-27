package herbert_schildt.chapter_5;
// Поиск в массиве с применением цикла for в стиле for each
public class Search {
    public static void main(String[] args) {
        int[] numbers = {6, 8, 3, 7, 5, 1, 6, 4};
        int val = 5;
        boolean found = false;

        // использовать цикл for в стиле for each для
        // поиска значения переменной val в массиве numbers
        for (int x : numbers){
            if(x == val){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Значение найдено!");
        }else {
            System.out.println("Значение не найдено!");
        }
    }
}
