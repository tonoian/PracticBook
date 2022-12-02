package herbert_schildt.chapter_8;
// Простой пример наследования

// создать суперкласс
class A {
    int i, j;

    void showIJ() {
        System.out.println("i & j: " + i + " " + j);
    }
}

// создать подкласс путем расширения класса А
class B extends A {
    int k;

    void showK() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        A supOb = new A();
        B subOb = new B();

        // суперкласс может использоваться самостоятельно
        supOb.i = 10;
        supOb.j = 20;
        System.out.println("Содержимое объекта supOb: ");
        supOb.showIJ();
        System.out.println();

        /*
        Подкласс имеет доступ ко всем открытым членам
        своего суперкласса.
        */
        subOb.i = 1;
        subOb.j = 2;
        subOb.k = 3;
        System.out.println("Содержимое объекта subOb: ");
        subOb.showIJ();
        subOb.showK();

        System.out.println();
        System.out.println("Сумма i, j, k  в объекте subOb : ");
        subOb.sum();

    }
}
