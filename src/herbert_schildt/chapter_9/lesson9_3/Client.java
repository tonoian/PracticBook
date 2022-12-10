package herbert_schildt.chapter_9.lesson9_3;

class Client implements Callback {
    // реализовать интерфейс Callback
    @Override
    public void callback(int param) {
        System.out.println("Метод callback(), вызываемый со значением " + param);
    }

    void nonInterfaceMeth() {
        System.out.println("B классах, реализующих интерфейсы, " +
                "могут определяться и другие члены.");
    }
}
