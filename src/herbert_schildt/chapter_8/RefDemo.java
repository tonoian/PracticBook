package herbert_schildt.chapter_8;

class Box1 {
    double width;
    double height;
    double depth;

    // сконструировать клон объекта
    Box1(Box1 ob) {  // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, применяемый при указании всех размеров
    Box1(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // конструктор, применяемый в отсутствие размеров
    Box1() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор, применяемый при создании куба
    Box1(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

// расширить класс Вох1 , включив в него поле веса
class BoxWeight1 extends Box1 {
    double weight;

    // конструктор BoxWeight1()

    BoxWeight1(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }
}

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight1 weight_box = new BoxWeight1(4, 3, 2, 1);
        Box1 plain_box = new Box1();
        double vol;

        vol = weight_box.volume();
        System.out.println("Объем weight_box равен: " + vol);
        System.out.println("Bec weight_box равен: " + weight_box.weight);

        System.out.println();
        // присвоитьссылке на объект Вox_Weight1 ссылки на объект Вoх1
        plain_box = weight_box;
        vol = plain_box.volume(); // Верно, т.к. метод volume()
        // определен в классе Вох1
        System.out.println("Объем plain_box равен: " + vol);

//        System.out.println("Bec plain_box равен: " + plain_box.weight);

    }
}
