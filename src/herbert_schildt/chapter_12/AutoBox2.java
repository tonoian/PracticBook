package herbert_schildt.chapter_12;

// Автоупаковка / автораспаковка происходит при передаче
// параметров и возврате значений из методов
public class AutoBox2 {
    // принять параметр типа Integer и возвратить значение типа int
    static int m(Integer v) {
        return v;
    }

    public static void main(String[] args) {
        // Передать значение типа int методу m() и присвоить
        // возвращаемое значение объекту типа Integer.
        // Здесь значение 100 аргумента автоматически
        // упаковывается в объект типа Integer.
        // Возвращаемое значение также упаковывается
        // в объект типа Integer.
        Integer iOb = m(120);

        System.out.println(iOb);
    }
}
