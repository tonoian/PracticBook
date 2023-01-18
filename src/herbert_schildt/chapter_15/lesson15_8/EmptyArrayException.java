package herbert_schildt.chapter_15.lesson15_8;

public class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Массив пуст");
    }
}
