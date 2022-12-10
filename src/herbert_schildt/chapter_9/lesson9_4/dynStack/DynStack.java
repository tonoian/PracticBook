package herbert_schildt.chapter_9.lesson9_4.dynStack;

import herbert_schildt.chapter_9.lesson9_4.IntStack;

// Реализация " наращиваемого " стека
public class DynStack implements IntStack {

    private int[] stack;
    private int tos;

    //  выделить память и инициализировать
    public DynStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    @Override
    public void push(int item) {
        // если стек заполнен, выделить память под стек большего размера
        if (tos == stack.length - 1) {
            int[] temp = new int[stack.length * 2]; // удвоить размер стека
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
            stack[++tos] = item;
        } else
            stack[++tos] = item;
    }

    // извлечь элемент из стека
    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен.");
            return 0;
        } else
            return stack[tos--];
    }
}
