package herbert_schildt.chapter_9.lesson9_7;

// Реализовать интерфейс МyIF
public class MyIFImp implements MyIF {
    // В этом классе должен быть реализован только метод getNumber(),
    // определенный в интерфейсе МyIF.
    // А вызов метода qetString() разрешается по умолчанию
    @Override
    public int getName() {
        return 100;
    }

    // В этом классе предоставляются реализации методов
//    @Override
//    public String getString() {
//        return "Это другая символьная строка.";
//    }
}
