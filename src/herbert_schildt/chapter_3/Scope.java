package herbert_schildt.chapter_3;
// Продемонстрировать область действия блока кода
public class Scope {
    public static void main(String[] args) {
        int x; // эта переменная доступна всему коду из метода main()

        x = 10;

        if(x == 10){
            int y = 20;
            // обе переменные х и у доступны в этой области действия
            System.out.println("x = " + x + ", y = " + y);
        }
        // y = 100;
        /*
        ОШИБКА! переменная у недоступна в этой области действия,
        тогда как переменная х доступна и эдесь
         */
        System.out.println("x = " + x + ", y =  переменная недоступна");
    }
}
