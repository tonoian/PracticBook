package herbert_schildt.chapter_5;
// Использование запятой в операторе цикла for
public class Comma {
    public static void main(String[] args) {
//        int a, b;
        for (int a = 1, b = 4; a < b; a++, b--){
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
