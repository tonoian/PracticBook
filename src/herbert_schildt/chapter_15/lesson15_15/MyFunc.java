package herbert_schildt.chapter_15.lesson15_15;

// Продемонстрировать применение ссылки на конструктор
// В функциональном интерфейсе MyFunc определяется метод,
// возвращающий ссылку на класс MyClass
public interface MyFunc {
    MyClass func(int n);
}
