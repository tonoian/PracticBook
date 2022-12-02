package herbert_schildt.chapter_8;
// Расширение класса BoxWeight в ключением в него
// поля стоимости доставки

// создать сначала класс Вох3
class Box3 {
    private double width;
    private double height;
    private double depth;

    // сконструировать клон объекта
    Box3(Box3 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, применяемый при указании всех размеров
    public Box3(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // конструктор, применяемый в отсутствие размеров
    Box3() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор, применяемый при создании куба
    Box3(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

//добавить поле веса
class BoxWeight3 extends Box3 {
    double weight;

    // сконструировать клон объекта
    BoxWeight3(BoxWeight3 ob) {
        super(ob);
        weight = ob.weight;
    }

    // конструктор , применяемый при указании всех параметров

    public BoxWeight3(double w, double h, double d, double m) {
        super(w, h, d); // вызвать конструктор суперкласса
        this.weight = m;
    }

    // конструктор, применяемый по умолчанию
    BoxWeight3() {
        super();
        weight = -1;
    }

    // конструктор, применяемый при создании куба
    BoxWeight3(double len, double m) {
        super(len);
        weight = m;

    }
}

class Shipment extends BoxWeight3 {
    double cost;

    // сконструировать клон объекта
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    // конструктор, используемый при указании всех параметров

    public Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        this.cost = c;
    }

    //конструктор применяемый по умолчанию
    Shipment() {
        super();
        cost = -1;
    }

    // конструктор, применяемый при создании куба
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 30, 0.5, 45);
        Shipment shipment2 = new Shipment();
        Shipment shipment3 = new Shipment(10, 2, 60);
        double vol;

        vol = shipment1.volume();
        System.out.println("V1 = " + vol);
        System.out.println("M1 = " + shipment1.weight);
        System.out.println("C1 = " + shipment1.cost + " $");
        System.out.println();

        vol = shipment2.volume();
        System.out.println("V2 = " + vol);
        System.out.println("M2 = " + shipment2.weight);
        System.out.println("C2 = " + shipment2.cost + " $");
        System.out.println();

        vol = shipment3.volume();
        System.out.println("V3 = " + vol);
        System.out.println("M3 = " + shipment3.weight);
        System.out.println("C3 = " + shipment3.cost + " $");
        System.out.println();
    }
}
