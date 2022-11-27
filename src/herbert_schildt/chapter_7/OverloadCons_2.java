package herbert_schildt.chapter_7;

// В этой версии класса Вох один объект допускается
// инициализировать другим объектом
class Box_2 {
    double width;
    double height;
    double depth;

    // конструктор, используемый при указании всех размеров
    public Box_2(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Обратите внимание на этот конструктор.
    // В качестве параметра в нем используется объект типа Вох
    // передать объект конструктору
    Box_2(Box_2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, используемый, если ни один из размеров не указан
    Box_2() {
        width = -1; // использовать значение - 1 для обозначения
        height = -1; //неинициализированного параллелепипеда
        depth = -1;
    }

    // конструктор, используемый при создании куба
    Box_2(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons_2 {
    public static void main(String[] args) {
        // создать параллелепипеды, используя
        // разные конструкторы
        Box_2 my_box1 = new Box_2(10, 20, 30);
        Box_2 my_box2 = new Box_2();
        Box_2 my_box3 = new Box_2(7);

        Box_2 my_clone = new Box_2(my_box1);

        // создать копию объекта my_box1
        double vol;

        // получить объем первого параллелепипеда
        vol = my_box1.volume();
        System.out.println("V1 = " + vol);

        // получить объем второго параллелепипеда
        vol = my_box2.volume();
        System.out.println("V2 = " + vol);

        // получить объем куба
        vol = my_box3.volume();
        System.out.println("V3 = " + vol);

        // получить объем куба
        vol = my_clone.volume();
        System.out.println("V4 = " + vol);

    }
}
