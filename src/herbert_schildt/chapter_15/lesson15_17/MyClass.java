package herbert_schildt.chapter_15.lesson15_17;

// Простой обобщенный класс
public class MyClass<T> {
    private final T val;

    // Конструктор, принимающий один параметр
    MyClass(T val) {
        this.val = val;
    }

    // Конструктор по умолчанию. Этот конструктор
    // в данной программе НЕ используется
    MyClass() {
        this.val = null;
    }

    public T getVal() {
        return val;
    }
}
