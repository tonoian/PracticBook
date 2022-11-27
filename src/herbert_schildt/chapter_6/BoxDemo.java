package herbert_schildt.chapter_6;
/*
    Программа, использующая класс Вох
    Присвоить исходному файлу имяBoxDemo.java
 */

class Box {
    double width;
    double height;
    double depth;
}

// В этом классе объявляется объект типа Вох
public class BoxDemo {
    public static void main(String[] args) {
        Box my_box = new Box();

        double vol;
        my_box.width = 10;
        my_box.height = 20;
        my_box.depth = 15;

        // рассчитать объем параллелепипеда
        vol = my_box.width * my_box.height * my_box.depth;
        System.out.println("V = " + vol);
    }
}
