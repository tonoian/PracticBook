package herbert_schildt.chapter_9.lesson9_3;

public class TestInterface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient2 ob = new AnotherClient2();

        Callback c1 = new AnotherClient2();

        c.callback(42);
        c = ob; // теперь переменная с ссылается на объект типа AnotherClient
        c.callback(12);
        ob.callback(11);

        c1.callback(42);
    }
}
