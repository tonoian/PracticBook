package herbert_schildt.chapter_15.lesson15_17;

// Простой не обобщенный класс
public class MyClass2 {
    String str;

    // Конструктор, принимающий один аргумент

    MyClass2(String str) {
        this.str = str;
    }

    // Конструктор по умолчанию. Этот конструктор в
    // данной программе НЕ используется
    MyClass2() {
        this.str = "";
    }

    String getStr() {
        return str;
    }
}
