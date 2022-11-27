package herbert_schildt.chapter_6;

/*
В данном примере программы для инициализации размеров
параллелепипеда в классе Вох_7 применяется параме тризированный
конструктор
 */
class Box_7 {
    double width;
    double height;
    double depth;

    // Это конструктор класса Вох
    Box_7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo_7 {
    public static void main(String[] args) {
        // объявить, выделить память и инициализировать объекты типа Вох_7
        Box_7 my_box1 = new Box_7(10, 20, 30);
        Box_7 my_box2 = new Box_7(1, 2, 3);

        // получить объем первого параллелепипеда
        System.out.println("V1 = " + my_box1.volume());

        // получить объем второго параллелепипеда
        System.out.println("V2 = " + my_box2.volume());
    }
}
