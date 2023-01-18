package herbert_schildt.chapter_15.lesson15_16;

// Продемонстрировать применение ссылки на
// конструктор обобщенного класса

// Теперь функциональный интерфейс MyFunc обобщенный
public interface MyFunc<T> {
    MyClass<T> func(T n);
}
