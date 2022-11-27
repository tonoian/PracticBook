package herbert_schildt.chapter_7;

// Эта программа не подлежит компиляции
class Outer_2 {
    int outer_x = 100;

    void test() {
        Inner_2 inner = new Inner_2();
        inner.display();
    }

    // это внутренний класс
    class Inner_2 {
        int y = 10; // у - локальная переменная класса Inner_2

        void display() {
            System.out.println("outer_x = " + outer_x);
        }
    }


    void show_y() {
//        System.out.println(y); // ошибка, здесь переменная у недоступна!
    }


}

public class InnerClassDemo_2 {
    public static void main(String[] args) {
        Outer_2 outer_2 = new Outer_2();
        outer_2.test();
    }
}
