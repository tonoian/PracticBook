package herbert_schildt.chapter_5;
// Продемонстрировать применение оператора цикла do-while
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do{
            System.out.println("" + n);
            n--;
        }while (n > 0);
    }
}
