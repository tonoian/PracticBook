package herbert_schildt.chapter_12;

// Усовершенствованная версия программы принятия решений
// из главы 9. В этой версии для представления возможных ответов
// используется перечисление, а не переменные экземпляра

import java.util.Random;

// Перечисление возможных ответов
enum Answers {
    NO, YES, MAYBE, LATER, SOON, NEVER
}

class Question {
    Random rand = new Random();

    Answers ask() {
        int prob = (int) (100 * rand.nextDouble());

        if (prob < 15) {
            return Answers.MAYBE;
        } else if (prob < 30) {
            return Answers.NO;
        } else if (prob < 60) {
            return Answers.YES;
        } else if (prob < 75) {
            return Answers.LATER;
        } else if (prob < 98) {
            return Answers.SOON;
        } else
            return Answers.NEVER;
    }
}

public class AskMe {
    static void answer(Answers result) {
        switch (result) {
            case NO -> System.out.println("Heт");
            case YES -> System.out.println("Дa");
            case MAYBE -> System.out.println("Возможно");
            case SOON -> System.out.println("Вскоре");
            case LATER -> System.out.println("Позднее");
            case NEVER -> System.out.println("Никогда");
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
