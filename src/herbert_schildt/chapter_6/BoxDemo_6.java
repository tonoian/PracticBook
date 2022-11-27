package herbert_schildt.chapter_6;

// В данном примере программы для инициализации размеров
// параллелепипеда в классе Вох применяется конструктор
class Box_6 {
    double width;
    double height;
    double depth;

    Box_6() {
        System.out.println("Конструирование обьекта Box_6");
        width = 10;
        height = 10;
        depth = 10;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo_6 {
    public static void main(String[] args) {
        // объявить, выделить память и инициализировать объекты типа Вох
        Box_6 my_box1 = new Box_6();
        Box_6 my_box2 = new Box_6();

        //  получить объем первого параллелепипеда
        System.out.println("V1 = " + my_box1.volume());

        // получить объем второго параллелепипеда
        System.out.println("V2 = " + my_box2.volume());
    }
}
