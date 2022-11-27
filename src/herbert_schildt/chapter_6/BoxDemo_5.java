package herbert_schildt.chapter_6;

// В этой программе применяется метод с параметрами
class Box_5 {
    double width;
    double height;
    double depth;

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }

    //установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo_5 {
    public static void main(String[] args) {
        Box_5 my_box1 = new Box_5();
        Box_5 my_box2 = new Box_5();

        // инициализировать каждый экземпляр класса Вoх
        my_box1.setDim(7, 9, 11);
        my_box2.setDim(12, 4, 8);

        // получить объем первого параллелепипеда
        System.out.println("V1 = " + my_box1.volume());

        // получить объем второго параллелепипеда
        System.out.println("V2 = " + my_box2.volume());
    }
}
