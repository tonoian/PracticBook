package herbert_schildt.chapter_9.lesson9_7;

// Использовать метод по умолчанию
public class DefaultMethDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        // Метод getNumber() можно вызвать, т.к. он явно реализован
        // в классе МyIFImp:
        System.out.println(obj.getName());

        // Метод getString() также можно вызвать, т.к. в интерфейсе
        // имеется его реализация по умолчанию:
        System.out.println(obj.getString());

        // Вызван статический метод
        int defNum = MyIF.getDefaultNumber();
        System.out.println(defNum);

        System.out.println(MyIF.getDefaultNumber());
    }
}
