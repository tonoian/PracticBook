package herbert_schildt.chapter_12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno1 {
    String str();

    int val();
}

public class Meta1 {
    // У ме тода myMeth() теперь имеются два аргумента
    @MyAnno1(str = "Два параметра", val = 19)
    public static void myMeth(String str, int i) {
        Meta1 ob = new Meta1();
        try {
            Class<?> c = ob.getClass();

            // Здесь указываются типы параметров
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno1 anno1 = m.getAnnotation(MyAnno1.class);

            System.out.println(anno1.str() + " " + anno1.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth("Тест", 10);
    }
}
