package herbert_schildt.chapter_10;

// Эта программа содержит ошибку, и поэтому она не подлежит компиляции
//public class ThrowsDemo {
//    static void throw_one() {
//        System.out.println("B теле метода throwOne().");
//        throw new IllegalAccessException("демонстрация");
//    }
//
//    public static void main(String[] args) {
//        throw_one();
//    }
//}

//  Эта программа написана верно
class ThrowsDemo {
    static void throw_one() throws IllegalAccessException {
        System.out.println("B теле метода throwOne().");
        throw new IllegalAccessException("демонстрация");
    }

    public static void main(String[] args) {
        try {
            throw_one();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
