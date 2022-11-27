package herbert_schildt.chapter_2;
/*
Продемонстрировать применение условного оператора if .
Присвоить исходному файлу имя "IfSample.java"
 */
public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;

        if(x < y) System.out.println("x < y");

        x = x * 2;
        if(x == y) System.out.println("x = y");

        x *= 2;
        if(x > y) System.out.println("x > y");

        if(x != y) System.out.println("x != y");

        // этот оператор не будет ничего выводить
        if(x == y) System.out.println("вы н е увидит е этого");
    }
}
