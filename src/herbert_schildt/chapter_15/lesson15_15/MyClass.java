package herbert_schildt.chapter_15.lesson15_15;

public class MyClass {
    private final int val;

    // Этот конструктор принимает один аргумент

    public MyClass(int val) {
        this.val = val;
    }

    // А это конструктор по умолчанию
    MyClass() {
        val = 0;
    }

    public int getVal() {
        return val;
    }
}
