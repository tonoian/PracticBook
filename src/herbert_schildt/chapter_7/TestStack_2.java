package herbert_schildt.chapter_7;

//Усовершенствованный класс Stack, в котором
// использован член длины массива
class Stack_2 {
    private int[] stack;
    private int tos;

    // выделить память под стек и инициализировать его
    Stack_2(int size) {
        stack = new int[size];
        tos = -1;
    }

    // разметить элемент в стеке
    void push(int item) {
        if (tos == stack.length - 1) // использован член длины массива
            System.out.println("Стек заполнен.");
        else
            stack[++tos] = item;
    }

    // извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else
            return stack[tos--];
    }
}

public class TestStack_2 {
    public static void main(String[] args) {
        Stack_2 st1 = new Stack_2(6);
        Stack_2 st2 = new Stack_2(16);

        //разместить числа в стеке
        for (int i = 0; i < 6; i++) {
            st1.push(i);
        }
        for (int i = 0; i < 16; i++) {
            st2.push(i);
        }

        // извлечь эти числа из стека
        System.out.println("Стек в st1:");
        for (int i = 0; i < 6; i++) {
            System.out.print(st1.pop() + " ");
        }

        System.out.println("\nСтек в st2:");
        for (int i = 0; i < 16; i++) {
            System.out.print(st2.pop() + " ");
        }
    }
}
