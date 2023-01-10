package herbert_schildt.chapter_14;

// Ситуация, в которой создается мостовой метод
class Gen9<T> {
    T ob;

    // передать конструктору ссыпку на объект типа Т
    public Gen9(T ob) {
        this.ob = ob;
    }

    // возвратить объект

    public T getOb() {
        return ob;
    }
}

// Подкласс, производный от класса Gen9
class Gen10 extends Gen9<String> {
    public Gen10(String ob) {
        super(ob);
    }

    // перегрузить метод getOb() для получения символьных строк
    public String getOb() {
        System.out.print("Вызван метод String getOb(): ");
        return ob;
    }
}

// продемонстрировать ситуацию, когда требуется мостовой метод
public class BridgeDemo {
    public static void main(String[] args) {

        // создать объект типа Gen10 для символьных строк
        Gen10 str = new Gen10("Тест обобщений");

        System.out.println(str.getOb());
    }
}
