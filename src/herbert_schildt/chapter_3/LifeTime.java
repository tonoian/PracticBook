package herbert_schildt.chapter_3;
// Продемонстрировать срок действия переменной
public class LifeTime {
    public static void main(String[] args) {
        int x;

        for(x = 0; x < 3; x++){
            int y = -1; // переменная у инициализируется прикаждом вхождении в блок кода
            System.out.println("y = " + y); // здесь всегда выводится значение -1

            y = 100;
            System.out.println("теперь: y = " + y);
        }
    }
}
