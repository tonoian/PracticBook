package herbert_schildt.chapter_14;

// Ограниченные метасимвольные аргументы
// Двумерные координаты
class TwoD {
    int x, y;

    public TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// Трехмерные координаты
class ThreeD extends TwoD {
    int z;

    public ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

// Четырехмерные координаты
class FourD extends ThreeD {
    int t;

    public FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
}

// Этот класс хранит массив координатных объектов
class Cords<T extends TwoD> {
    T[] cords;

    public Cords(T[] cords) {
        this.cords = cords;
    }
}

// Продемонстрировать применение ограниченных метасимволов
public class BoundedWildcard {
    static void showXY(Cords<?> c) {
        System.out.println("Координаты X Y:");
        for (int i = 0; i < c.cords.length; i++) {
            System.out.println(c.cords[i].x + " " + c.cords[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Cords<? extends ThreeD> c) {
        System.out.println("Координаты X Y Z:");
        for (int i = 0; i < c.cords.length; i++) {
            System.out.println(c.cords[i].x + " " +
                    c.cords[i].y + " " + c.cords[i].z);
        }
        System.out.println();
    }

    static void showAll(Cords<? extends FourD> c) {
        System.out.println("Координаты X Y Z T:");
        for (int i = 0; i < c.cords.length; i++) {
            System.out.println(c.cords[i].x + " " + c.cords[i].y +
                    " " + c.cords[i].z + " " + c.cords[i].t);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD[] td = {
                new TwoD(0, 0),
                new TwoD(2, 4),
                new TwoD(-9, -120)
        };

        Cords<TwoD> tdLoc = new Cords<>(td);

        System.out.println("Содержимое объекта tdLoc.");
        showXY(tdLoc); // Верно, это тип ТWoD
//        showXYZ(tdLoc); // Ошибка, это не тип ThreeD
//        showAll(tdLoc); // Ошибка, это не тип FourD

        // а теперь создать несколько объектов типа FourD
        FourD[] fd = {
                new FourD(1, 2, 3, 4),
                new FourD(-5, 9, -4, 45),
                new FourD(5, 2, -9, 4)
        };

        Cords<FourD> fdLoc = new Cords<>(fd);

        System.out.println("Содержимое объекта fdLoc");
        // Здесь все верно
        showAll(fdLoc);
        showXYZ(fdLoc);
        showXY(fdLoc);
    }
}
