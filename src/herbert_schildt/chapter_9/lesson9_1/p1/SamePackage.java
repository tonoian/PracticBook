package herbert_schildt.chapter_9.lesson9_1.p1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("конструктор этого же пакета");
        System.out.println("n = " + p.n);
        // доступно только для класса
//        System.out.println("n_pri = " + p.n_pri);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
