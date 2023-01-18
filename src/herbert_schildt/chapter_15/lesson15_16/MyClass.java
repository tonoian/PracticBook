package herbert_schildt.chapter_15.lesson15_16;

public class MyClass<T> {
    private T val;

    // Этот конструктор принимает один аргумент
    MyClass(T val) {
        this.val = val;
    }

    // А это конструктор по умолчанию
    MyClass() {
        this.val = null;
    }

    public T getVal() {
        return val;
    }
}
