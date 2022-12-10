package herbert_schildt.chapter_9.lesson9_6;

// Этот класс должен реализовать все методы из интерфейсов А и В
public class MyClass implements B {
    @Override
    public void meth1() {
        System.out.println("Реализация метода meth1().");
    }

    @Override
    public void meth2() {
        System.out.println("Реализация метода meth2().");
    }

    @Override
    public void meth3() {
        System.out.println("Реализация метода meth3().");
    }
}
