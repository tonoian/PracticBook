package herbert_schildt.chapter_9.lesson9_4.dynStack;

public class IFTest2 {
    public static void main(String[] args) {
        DynStack myStack1 = new DynStack(5);
        DynStack myStack2 = new DynStack(10);

        // В этих циклах увеличиваются размеры каждого стека
        for (int i = 0; i < 12; i++) {
            myStack1.push(i);
        }

        for (int i = 0; i < 20; i++) {
            myStack2.push(i);
        }

        System.out.println("Стек в myStack1:");
        for (int i = 0; i < 12; i++) {
            System.out.print(myStack1.pop() + " ");
        }

        System.out.println("Стек в myStack2:");
        for (int i = 0; i < 20; i++) {
            System.out.print(myStack2.pop() + " ");
        }
    }
}
