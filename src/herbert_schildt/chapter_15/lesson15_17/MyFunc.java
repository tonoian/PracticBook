package herbert_schildt.chapter_15.lesson15_17;

//  Реализовать простую фабрику классов, используя ссылку на конструктор
public interface MyFunc<R, T> {
    R func(T n);
}
