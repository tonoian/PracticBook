package herbert_schildt.chapter_9.lesson9_4.fixStack;

public class IFTest {
    public static void main(String[] args) {
        FixedStack myStack1 = new FixedStack(10);
        FixedStack myStack2 = new FixedStack(8);

        // разместить числа в с теке
        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }

        // извлечь эти числа из стека
        System.out.println("Стек в myStack1:");
        for (int i = 0; i < 10; i++) {
            System.out.print(myStack1.pop() + " ");
        }

        System.out.println("Стек в myStack2:");
        for (int i = 0; i < 8; i++) {
            System.out.print(myStack2.pop() + " ");
        }
    }
}
