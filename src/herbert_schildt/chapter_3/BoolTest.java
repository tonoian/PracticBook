package herbert_schildt.chapter_3;
// Продемон стрировать применение значений типа boolean
public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b = " + b);
        b = true;
        System.out.println("b = " + b);

        // значение типа boolean может управлять оператором if
        if(b) System.out.println("Этот код выполняется.");

        b = false;
        if(b) System.out.println("Этот код не выполняется.");

        // результат сравнения - значение типа boolean
        System.out.println("10 > 9 = " + (10 > 9));
    }
}
