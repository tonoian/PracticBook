package herbert_schildt.chapter_9.lesson9_4;

import herbert_schildt.chapter_9.lesson9_4.dynStack.DynStack;
import herbert_schildt.chapter_9.lesson9_4.fixStack.FixedStack;

/*
Создать переменную интерфейса и обратиться к стекам через нее.
*/
public class IFTest3 {
    public static void main(String[] args) {
        IntStack myStack; // создать переменную ссылки на интерфейс
        DynStack dynStack = new DynStack(15);
        FixedStack fixedStack = new FixedStack(10);

        myStack = dynStack; // загрузить динамический стек
        // разместить числа в стеке
        for (int i = 0; i < 20; i++) {
            myStack.push(i);
        }

        myStack = fixedStack; // загрузить фиксированный стек
        for (int i = 0; i < 10; i++) {
            myStack.push(i);
        }

        myStack = dynStack;
        System.out.println("Значения в динамическом стеке:");
        for (int i = 0; i < 20; i++) {
            System.out.print(myStack.pop() + " ");
        }

        myStack = fixedStack;
        System.out.println("Значения в фиксированном стеке:");
        for (int i = 0; i < 10; i++) {
            System.out.print(myStack.pop() + " ");
        }
    }
}
