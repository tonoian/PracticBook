package herbert_schildt.chapter_12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Аннотация-маркер
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
}

public class Marker {
    // аннотировать метод с помощью маркера
    // Обратите внимание на обязательность скобок
    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();

        try {
            Method m = ob.getClass().getMethod("myMeth");

            // определить наличие аннотации
            if (m.isAnnotationPresent(MyMarker.class))
                System.out.println("Аннотация-маркер MyMarker присутствует.");
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
