package herbert_schildt.chapter_14;

// Использовать обобщенный конструктор
class GenCons {
    private double val;

    <T extends Number> GenCons(T arg) {
        val = arg.doubleValue();
    }

    void showVal() {
        System.out.println("val: " + val);
    }
}

public class GenConsDemo {
    public static void main(String[] args) {
        GenCons test = new GenCons(100);
        GenCons test1 = new GenCons(123.3f);

        test.showVal();
        test1.showVal();
    }
}
