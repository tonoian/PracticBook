package herbert_schildt.chapter_6;

// В этом классе определяется целочисленный стек, в котором
// можно хранить до 10 целочисленных значений
class Stack {
    int[] st = new int[10];
    int tos;

    // инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    // разместить элемент в стеке
    void push(int item) {
        if (tos == 9) {
            System.out.println("Стек заполнен.");
        } else {
            st[++tos] = item;
        }
    }

    // извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else {
            return st[tos--];
        }
    }
}

public class TestStack {
    public static void main(String[] args) {
        Stack my_stack1 = new Stack();
        Stack my_stack2 = new Stack();

        // разместить числа в стеке
        for (int i = 0; i < 10; i++) my_stack1.push(i);
        for (int i = 10; i < 20; i++) my_stack2.push(i);

        // извлечь эти числа из стека
        System.out.println("Содержимое стека my_stack1:");
        for (int i = 0; i < 10; i++)
            System.out.println(my_stack1.pop());

        System.out.println("Содержимое стека my_stack2:");
        for (int i = 0; i < 10; i++)
            System.out.println(my_stack2.pop());
    }
}
