package herbert_schildt.chapter_9.lesson9_4;

public interface IntStack {
    void push(int item);  // сохранить элемент в стеке

    int pop(); // извлечь элемент из стека

    /*
    У метода clear() теперь имеется вариант по умолч анию, поэтому
    его придется реализоваться в том существующем классе, где уже
    применяется интерфейс IntStack
     */
    default void clear() {
        System.out.println("Метод clear() не реализован.");
    }
}
