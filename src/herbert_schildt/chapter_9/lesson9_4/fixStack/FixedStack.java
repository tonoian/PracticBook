package herbert_schildt.chapter_9.lesson9_4.fixStack;

import herbert_schildt.chapter_9.lesson9_4.IntStack;

// Реализация интерфейса IntStack для стека фиксированного размера
public class FixedStack implements IntStack {

    private final int[] stack;
    private int tos;

    // выделить память и инициализировать стек
    public FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    @Override
    public void push(int item) {
        if (tos == stack.length - 1) // использовать поле длины стека
            System.out.println("Стек заполнен.");
        else
            stack[++tos] = tos;
    }

    // извлечь элемент из стека
    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else
            return stack[tos--];
    }
}
