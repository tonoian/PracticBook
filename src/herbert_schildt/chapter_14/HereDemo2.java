package herbert_schildt.chapter_14;

/*Необобщенный класс может быть суперклассом
  для обобщенного подкласса
  Необобщенный класс
*/
class NonGen1 {
    int num;

    public NonGen1(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}

// Обобщенный подкласс
class Gen4<T> extends NonGen1 {
    T ob; // объявить объект типа Т

// передать конструктору объект типа Т

    public Gen4(T ob, int num) {
        super(num);
        this.ob = ob;
    }

    // возвратить объект ob

    public T getOb() {
        return ob;
    }
}

// создать объект типа Gen4
public class HereDemo2 {
    public static void main(String[] args) {
        // создать объект типа Gen4 для символьных строк
        Gen4<String> w = new Gen4<>("Добро пожаловать", 47);

        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
