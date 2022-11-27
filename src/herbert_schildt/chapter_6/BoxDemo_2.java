package herbert_schildt.chapter_6;
//В этой программе объявляются два объекта класса Вох

class Box_2 {
    double width;
    double height;
    double depth;
}

public class BoxDemo_2 {
    public static void main(String[] args) {
        Box_2 my_box1 = new Box_2();
        Box_2 my_box2 = new Box_2();
        double vol;

        // присвоить значения переменным экземпляра my_box1
        my_box1.width = 2;
        my_box1.height = 4;
        my_box1.depth = 6;

        // присвоить другие значения переменным экземпляра my_box2
        my_box2.width = 10;
        my_box2.height = 12;
        my_box2.depth = 16;

        // рассчитать объем первого параллелепипеда
        vol = my_box1.width * my_box1.height * my_box1.depth;
        System.out.println("V1 = " + vol);

        // рассчитать объем второго параллелепипеда
        vol = my_box2.width * my_box2.height * my_box2.depth;
        System.out.println("V2 = " + vol);
    }
}
