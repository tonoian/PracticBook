package lesson_2;
//---------------------2.3-------------------//
public class IfStatementDemo {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 2;
        b = 3;

        System.out.println("a = 2, b = 3");//
        if(a < b){
            System.out.println("a < b");//
        }
        if(a > b){
            System.out.println("It`s never print");
        }

        System.out.println();

        c = a - b;
        System.out.println("c = " + c);//
        if(c >= 0) System.out.println("c is positive number");
        if(c < 0) System.out.println("c is negative number");//

        System.out.println();

        d = b - a;
        System.out.println("d = " + d);//
        if(d >= 0) System.out.println("d is positive number");//
        if(d < 0) System.out.println("d is negative number");

        System.out.println();

        if(a + c != b) System.out.println("a + c != b");//
        if(a + d == b) System.out.println("a + d == b");//
    }
}
