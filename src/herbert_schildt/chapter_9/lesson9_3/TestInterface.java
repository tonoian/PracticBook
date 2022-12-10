package herbert_schildt.chapter_9.lesson9_3;

public class TestInterface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(43);

        Client c1 = new Client();
        c1.nonInterfaceMeth();
        c1.callback(54);
    }
}
