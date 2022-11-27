package herbert_schildt.chapter_7;

// Определить внутренний класс в цикле for
class Outer_3 {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner_3 {
                void display() {
                    System.out.println("outer_x = " + outer_x);
                }
            }
            Inner_3 inner_3 = new Inner_3();
            inner_3.display();
        }
    }
}

public class InnerClassDemo_3 {
    public static void main(String[] args) {
        Outer_3 outer_3 = new Outer_3();
        outer_3.test();
    }
}
