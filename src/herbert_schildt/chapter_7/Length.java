package herbert_schildt.chapter_7;

// В этой программе демонстрируется применение члена длины массива
public class Length {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        int[] a2 = {3, 5, -9, 22, 45, 7};
        int[] a3 = {-7, 55, 12};

        System.out.println("длина a1 равна: " + a1.length);
        System.out.println("длина a2 равна: " + a2.length);
        System.out.println("длина a3 равна: " + a3.length);
    }
}
