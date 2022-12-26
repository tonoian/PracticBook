package herbert_schildt.chapter_12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Объявление типа аннотации, в ключая значения ее членов по умолчанию
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno3 {
    String str() default "Testing";

    int val() default 9000;
}

public class Meta3 {
    // аннотировать метод, используя значения по умолчанию
    @MyAnno3()
    public static void myMeth() {
        Meta3 ob = new Meta3();

        // получить аннотацию для данного метода
        // и вывести значения ее членов
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno3 anno = m.getAnnotation(MyAnno3.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
