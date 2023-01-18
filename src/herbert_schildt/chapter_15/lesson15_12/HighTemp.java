package herbert_schildt.chapter_15.lesson15_12;

// Класс для хранения максимальной температуры задень
public class HighTemp {
    private int hTemp;

    public HighTemp(int ht) {
        this.hTemp = ht;
    }

    // возвратить логическое значение true, если вызывающий объект
    // типа HighTemp имеет такую же температуру, как и у объекта ht2
    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    // возвратить логическое значение true, если вызывающий объект
    // типа HighTemp имеет температуру ниже, чем у объекта ht2
    boolean lessThenTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}
