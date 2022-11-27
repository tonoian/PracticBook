package herbert_schildt.chapter_7;

// Еще один пример рекурсии
class RecTest {
    int[] values;

    RecTest(int i) {
        values = new int[i];
    }

    // вывести рекурсивно элементы массива
    void printArray(int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}

public class Recursion_2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(15);
        int i;

        for (i = 0; i < 15; i++) {
            ob.values[i] = i;
        }
        ob.printArray(15);
    }
}
