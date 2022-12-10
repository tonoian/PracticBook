package herbert_schildt.chapter_9.lesson9_3;

public class AnotherClient2 implements Callback {
    // реализовать интерфейс Callback
    @Override
    public void callback(int param) {
        System.out.println("Eщe один вариант метода callback()");
        System.out.println("param в квадрате равно " + (param * param));
    }

}
