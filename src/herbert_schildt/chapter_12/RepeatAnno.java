package herbert_schildt.chapter_12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Продемонстрировать применение повторяющейся аннотации
// сделать аннотацию МyAnno4 повторяющейся
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnno.class)
@interface MyAnno4 {
    String str() default "Testing";

    int val() default 7000;
}

// Это контейнерная аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnno {
    MyAnno4[] value();
}

public class RepeatAnno {
    // повторить аннотацию МyAnno в методе myMeth()
    @MyAnno4(str = "First annotation", val = -1)
    @MyAnno4(str = "Second annotation", val = 200)
    @MyAnno4
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();

        try {
            Class<?> c = ob.getClass();

            // получить аннотации для метода myMeth()
            Method m = c.getMethod("myMeth", String.class, int.class);

            // вывести повторяющиеся аннотации МyAnno
            Annotation anno = m.getAnnotation(MyRepeatedAnno.class);
            System.out.println(anno);
            System.out.println();

            Annotation[] anno1 = m.getDeclaredAnnotationsByType(MyAnno4.class);
            for (Annotation a : anno1)
                System.out.println(a);
            System.out.println();

            Annotation[] anno2 = m.getAnnotationsByType(MyAnno4.class);
            for (Annotation a : anno2)
                System.out.println(a);
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}
