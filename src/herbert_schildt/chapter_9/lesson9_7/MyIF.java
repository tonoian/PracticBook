package herbert_schildt.chapter_9.lesson9_7;

public interface MyIF {
    // Это объявление обычного метода в интерфейсе.
    // Он НЕ предоставляет реализацию по умолчанию
    int getName();

    // А это объявление метода по умолчанию. Обратите
    // внимание на его реализацию по умолчанию
    default String getString() {
        return "Объект типа String по умолчанию";
    }

    // Это объявление статического метода в интерфейсе
    static int getDefaultNumber() {
        return 0;
    }
}
