package herbert_schildt.chapter_9.lesson9_1.p1;

// получить экземпляры различных классов из пакета р1
public class Demo1 {
    public static void main(String[] args) {
        Protection ob1 = new Protection();
        Derived ob2 = new Derived();
        SamePackage oob3 = new SamePackage();
    }
}
