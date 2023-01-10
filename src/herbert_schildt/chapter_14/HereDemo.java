package herbert_schildt.chapter_14;

// В подкласс могут быть введены свои параметры типа
class Gen2<T> {
    T ob2; // объявить объект типа Т

    // передать конструктору ссылку на объект типа Т
    public Gen2(T ob2) {
        this.ob2 = ob2;
    }

    // возвратить ссылку ob
    public T getOb2() {
        return ob2;
    }
}

// Подкласс, производный от класса Gen2, где
// определяется второй параметр типа V
class Gen3<T, V> extends Gen2<T> {
    V ob3;

    public Gen3(T ob2, V ob3) {
        super(ob2);
        this.ob3 = ob3;
    }

    public V getOb3() {
        return ob3;
    }
}

// создать объект типа Gen3
public class HereDemo {
    public static void main(String[] args) {

        // создать объекты типа Gen2 для символьных строк целых чисел
        Gen3<String, Integer> x =
                new Gen3<>("Значение равно: ", 55);

        System.out.print(x.getOb2());
        System.out.println(x.getOb3());
    }
}
