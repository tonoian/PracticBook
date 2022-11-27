package herbert_schildt.chapter_7;

// В этом классе определяется целочисленный стек, который может
// содержать 10 значений
class Stack {
    /*
        Теперь переменные stack и tos являются закрытыми.
        Это означает, что они не могут быть случайно или
        намеренно изменены таким образом, чтобы нарушить стек.
    */
    private final int[] stack = new int[10];
    private int tos;

    // инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    // разместить элемент в стеке
    void push(int item) {
        if (tos == 9)
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

public class TestStack {
    public static void main(String[] args) {
        Stack my_stack1 = new Stack();
        Stack my_stack2 = new Stack();

        // разместить числа в стеке
        for (int i = 0; i < 10; i++) {
            my_stack1.push(i);
        }
        for (int i = 20; i > 10; i--) {
            my_stack2.push(i);
        }

        // извлечь эти числа из стека
        System.out.println("Стек в my_stack1:");
        for (int i = 0; i< 10; i++){
            System.out.print(my_stack1.pop() + " ");
        }

        System.out.println();
        System.out.println("Стек в my_stack2:");
        for (int i = 0; i < 10; i++)
            System.out.print(my_stack2.pop() + " ");

        /*
           эти операторы недопустимы
           my_stack1.tos = -2;
           my_stack2.stack[З] = 100;
         */
    }
}