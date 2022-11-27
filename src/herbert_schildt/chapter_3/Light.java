package herbert_schildt.chapter_3;
/*
Вычислить расстояние, проходимое светом,
используя переменные типа long
 */
public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // скорость света, миль в секунду
        lightspeed = 186000;

        days = 1000;
        seconds = days * 24 * 60 * 60; // переобразовать в секунды
        distance = lightspeed * seconds; // вычислить расстояние

        System.out.print("За " + days);
        System.out.print(" дней свет пройдёт около ");
        System.out.println(distance + " миль.");
    }
}
