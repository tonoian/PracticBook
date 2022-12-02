package herbert_schildt.chapter_8;

// Применение абстрактных методов и классов
abstract class Figure1 {
    double dim1;
    double dim2;

    public Figure1(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // теперь метод area() объявляется абстрактным
    abstract double area();
}

class Rectangle1 extends Figure1 {

    public Rectangle1(double dim1, double dim2) {
        super(dim1, dim2);
    }

    // переопределить метод area() для четырехугольника
    @java.lang.Override
    double area() {
        System.out.println("B области четырехугольника.");
        return dim1 * dim2;
    }
}

class Triangle1 extends Figure1 {

    public Triangle1(double dim1, double dim2) {
        super(dim1, dim2);
    }

    // переопределить метод area() для прямоугольного треугольника
    @java.lang.Override
    double area() {
        System.out.println("B области треугольника. ");
        return dim1 * dim2 / 2;
    }
}

public class AbstractArea {
    public static void main(String[] args) {
//        Figure1 f = new Figure1(12,45); // теперь недопустимо

        Rectangle1 r = new Rectangle1(15, 25);
        Triangle1 t = new Triangle1(45, 25);
        Figure1 f; // верно, но объект не создается

        f = r;
        System.out.println("S = " + f.area());

        f = t;
        System.out.println("S = " + f.area());
    }
}
