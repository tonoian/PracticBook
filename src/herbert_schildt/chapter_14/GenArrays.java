package herbert_schildt.chapter_14;

// Обобщения и массивы
class Gen11<T extends Number> {
    T ob;
    T[] values; //  Верно !

    public Gen11(T ob, T[] values) {
        this.ob = ob;
        this.values = values; // можно присвоить ссылку существующему массиву

        // Этот оператор не верен
        // values = new Т[10]; // нельзя создать массив типа Т
        // Тем не менее этот оператор верен
    }
}

public class GenArrays {
    public static void main(String[] args) {

        Integer[] n = {1, 2, 3, 4, 5};
        Gen11<Integer> iOb = new Gen11<>(50, n);

        // Нельзя создать массив специфических для типа обобщенных ссылок
        // Gen11<Integer> gens[] = new Gen11<Integer>[10]; // Неверно!

        // А это верно!
        Gen11<?>[] gens = new Gen11<?>[10]; // Верно!
    }
}
