package herbert_schildt.chapter_3;
// Вычислить площадь круга
public class Area {
    public static void main(String[] args) {
        double pi, r, s;

        pi = 3.1416; // приблизительное значение числа пи
        r = 10.8; // радиу с окружности
        s = pi * r * r; // вычислить площадь круга

        System.out.println("Площадь круга равна " + s);
    }
}
