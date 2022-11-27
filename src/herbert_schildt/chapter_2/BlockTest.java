package herbert_schildt.chapter_2;
/*
Продемонстрировать применение block кода.
Присвоить исходному файлу имя "BlockTest.java"
 */
public class BlockTest {
    public static void main(String[] args) {
        int x, y;
        y = 20;

        // адресатом этого оператора цикла служит блок кода
        for(x = 0; x < 10; x++){
            System.out.println("x = " + x);
            System.out.println("Y = " + y);
            y -= 2;
        }
    }
}
