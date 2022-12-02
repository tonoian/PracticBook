package herbert_schildt.chapter_8;

// В этой программе наследование применяется
// для расширения класса Вох
class Box {
    double width;
    double height;
    double depth;

    // сконструировать клон объекта
    Box(Box ob) {  // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, применяемый при указании всех размеров
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // конструктор, применяемый в отсутствие размеров
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор, применяемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

// расширить класс Вох , включив в него поле веса
class BoxWeight extends Box {
    double weight;

    // конструктор BoxWeight()

    BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    double R() {
        return volume() * weight;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight my_box1 = new BoxWeight(10, 20, 30, 2);
        BoxWeight my_box2 = new BoxWeight(1, 2, 3, 4);
        double vol;

        vol = my_box1.volume();
        System.out.println("V1 = " + vol);
        System.out.println("Bec my_box1 равен: " + my_box1.weight);
        System.out.println();

        vol = my_box2.volume();
        System.out.println("V2 = " + vol);
        System.out.println("Bec my_box2 равен: " + my_box2.weight);
    }
}
