package herbert_schildt.chapter_15.lesson15_14;

import java.util.ArrayList;
import java.util.Collections;

public class UseMethodRef {
    // Метод compare(), совместимый с аналогичным методом,
    // определенным в интерфейсе Comparator<T>
    static int compareMC(MyClass a, MyClass b){
        return a.getVal() - b.getVal();
    }
    public static void main(String[] args) {
        ArrayList<MyClass> a1 = new ArrayList<>();

        a1.add(new MyClass(1));
        a1.add(new MyClass(-10));
        a1.add(new MyClass(9));
        a1.add(new MyClass(5));
        a1.add(new MyClass(6));
        a1.add(new MyClass(-1));
        a1.add(new MyClass(8));

        // найти значение, используя метод compareMC()
        MyClass maxValObj = Collections.max(a1, UseMethodRef::compareMC);

        System.out.println("максимальное значение равно: " + maxValObj.getVal());
    }
}
