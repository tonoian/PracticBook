package herbert_schildt.chapter_8;

// Полная реализация класса ВoxWeight2
class Box2 {
    private double width;
    private double height;
    private double depth;

    // сконструировать клон объекта
    Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, применяемый при указании всех размеров
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, применяемый в отсутствие размеров
    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор, применяемый при создании куба
    Box2(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double value() {
        return width * height * depth;
    }
}

// Теперь в классе ВoxWeight2 полностью реализованы все конструкторы
class BoxWeight2 extends Box2 {
    double weight; // вес параллелепипеда

    // сконструировать клон объекта
    BoxWeight2(BoxWeight2 ob) {
        super(ob);
        weight = ob.weight;
    }

    // конструктор, применяемый при указании всех параметров

    public BoxWeight2(double w, double h, double d, double m) {
        super(w, h, d);
        this.weight = m;
    }

    // конструктор, применяемый по умолчанию
    BoxWeight2() {
        super();
        weight = -1;
    }

    // конструктор, применяемый при создании куба
    BoxWeight2(double len, double m) {
        super(len);
        weight = m;
    }
}

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight2 my_box1 = new BoxWeight2(10, 20, 30, 4);
        BoxWeight2 my_box2 = new BoxWeight2();
        BoxWeight2 my_cube = new BoxWeight2(10, 20);
        BoxWeight2 my_clone1 = new BoxWeight2(my_box1);
        BoxWeight2 my_clone2 = new BoxWeight2(my_box2);
        double vol;

        vol = my_box1.value();
        System.out.println("V1 = " + vol);
        System.out.println("M1 = " + my_box1.weight);
        System.out.println();

        vol = my_box2.value();
        System.out.println("V2 = " + vol);
        System.out.println("M2 = " + my_box2.weight);
        System.out.println();

        vol = my_cube.value();
        System.out.println("VCube = " + vol);
        System.out.println("MCube = " + my_cube.weight);
        System.out.println();

        vol = my_clone1.value();
        System.out.println("VClone1 = " + vol);
        System.out.println("MClone1 = " + my_clone1.weight);
        System.out.println();

        vol = my_clone2.value();
        System.out.println("VClone2 = " + vol);
        System.out.println("MClone2 = " + my_clone2.weight);

    }
}
