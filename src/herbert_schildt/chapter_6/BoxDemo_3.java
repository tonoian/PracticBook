package herbert_schildt.chapter_6;
// В этой программе применяется метод, введенный в класс Вох

class Box_3 {
    double width;
    double height;
    double depth;

    // вывести объем параллелепипеда
    void volume() {
        System.out.println("V = " + (width * height * depth));
    }
}

public class BoxDemo_3 {
    public static void main(String[] args) {
        Box_3 my_box1 = new Box_3();
        Box_3 my_box2 = new Box_3();

        // присвоить значение переменным экземпляра my_box1
        my_box1.width = 10;
        my_box1.height = 16;
        my_box1.depth = 8;

        // присвоить другие значения переменным экземпляра my_box2
        my_box2.width = 2;
        my_box2.height = 4;
        my_box2.depth = 16;

        // вывести объем первого параллелепипеда
        my_box1.volume();

        // вывести объем второго параллелепипеда
        my_box2.volume();
    }
}
