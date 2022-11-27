package herbert_schildt.chapter_7;
class StaticDemo{
    static int a = 45;
    static int b = 99;

    static void call_me(){
        System.out.println("a = " + a);
    }
}
public class StaticByName {
    public static void main(String[] args) {
        StaticDemo.call_me();
        System.out.println("b = " + StaticDemo.b);
    }
}
