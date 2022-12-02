package herbert_schildt.chapter_8;

// Применение полиморфизма во время выполнения
class Figure {
    double dim1;
    double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    double area() {
        System.out.println("Площадь не определена. ");
        return 0;
    }
}

class Rectangle extends Figure {

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    // переопределить метод area() для четырехугольника

    @java.lang.Override
    double area() {
        System.out.println("B области четырехугольника.");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @java.lang.Override
    double area() {
        System.out.println("B области треугольника.");
        return dim1 * dim2 / 2;
    }
}

public class FindArea {
    public static void main(String[] args) {
        Figure f = new Figure(10, 20);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure fig_ref;

        fig_ref = f;
        System.out.println("S = " + fig_ref.area());

        fig_ref = r;
        System.out.println("S = " + fig_ref.area());

        fig_ref = t;
        System.out.println("S = " + fig_ref.area());
    }
}
