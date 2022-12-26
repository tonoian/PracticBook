package herbert_schildt.chapter_12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Показать все аннотации для класса и метода
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2 {
    String str();

    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "Annotation test class")
@MyAnno2(str = "Meta2", val = 120)

public class Meta2 {
    @What(description = "Annotation test method")
    @MyAnno2(str = "Testing", val = 110)
    public static void myMeth() {
        Meta2 ob = new Meta2();

        try {
            Annotation[] annotation = ob.getClass().getAnnotations();

            // вывести все аннотации для класса Meta2
            System.out.println("Bce аннотации для класса Meta2:");
            for (Annotation a : annotation)
                System.out.println(a);
            System.out.println();

            // вывести все аннотации для метода myMeth()
            Method m = ob.getClass().getMethod("myMeth");
            annotation = m.getAnnotations();

            System.out.println("Bce аннотации для метода myMeth():");
            for (Annotation a : annotation)
                System.out.println(a);
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
