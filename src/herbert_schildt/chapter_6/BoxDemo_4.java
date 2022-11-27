package herbert_schildt.chapter_6;

// Теперь метод volume() возвращает объем параллелепипеда
class Box_4 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo_4 {
    public static void main(String[] args) {
        Box_4 my_box1 = new Box_4();
        Box_4 my_box2 = new Box_4();
        double vol;

        // присвоить значение переменным экземпляра my_box1
        my_box1.width = 22;
        my_box1.height = 12;
        my_box1.depth = 42;

        // присвоить другие значения переменным экземпляра my_box2
        my_box2.width = 9;
        my_box2.height = 15;
        my_box2.depth = 3;

        // вывести объем первого параллелепипеда
        vol = my_box1.volume();
        System.out.println("V1 = " + vol);

        // вывести объем второго параллелепипеда
        vol = my_box2.volume();
        System.out.println("V2 = " + vol);
    }
}
