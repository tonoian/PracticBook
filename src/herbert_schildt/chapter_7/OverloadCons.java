package herbert_schildt.chapter_7;
/*
    В данном примере конструкторы определяются в классе Вох для
    инициализации размеров параллелепипеда тремя разными способами
 */
class Box{
    double width;
    double height;
    double depth;

    //  конструктор, используемый при указании всех размеров
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // конструктор, используемый, когда ни один из размеров не указан
    Box(){
        width = -1; //использовать значение - 1 для обозначения
        height = -1; //неинициализированного параллелепипеда
        depth = -1;
    }

    // конструктор, используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume(){
        return width * height * depth;
    }
}
public class OverloadCons {
    public static void main(String[] args) {
        // создать параллелепипеды, используя разные
        // конструкторы
        Box my_box1 = new Box(10, 20, 30);
        Box my_box2 = new Box();
        Box my_cube = new Box(9);
        double vol;

        // получить объем первого параллелепипеда
        vol = my_box1.volume();
        System.out.println("V1 = " + vol);

        // получить объем второго параллелепипеда
        vol = my_box2.volume();
        System.out.println("V2 = " + vol);

        // получить объем куба
        vol = my_cube.volume();
        System.out.println("V3 = " + vol);
    }
}
