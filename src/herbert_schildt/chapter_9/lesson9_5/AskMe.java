package herbert_schildt.chapter_9.lesson9_5;

public class AskMe implements SharedConstants {
    static void answer(int result) {
        switch (result) {
            case NO -> System.out.println("Нет");
            case YES -> System.out.println("Да");
            case MAYBE -> System.out.println("Возможно");
            case LATER -> System.out.println("Позднее");
            case SOON -> System.out.println("Вскоре");
            case NEVER -> System.out.println("Никогда");
        }
    }


    public static void main(String[] args) {
        Question q = new Question();

        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
