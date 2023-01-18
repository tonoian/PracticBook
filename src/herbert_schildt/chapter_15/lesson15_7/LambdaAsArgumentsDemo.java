package herbert_schildt.chapter_15.lesson15_7;

/*
Первый параметр этого метода имеет тип функционального
интерфейса. Следовательно, ему можно передать ссылку на
любой экземпляр этого интерфейса, включая экземпляр,
создаваемый в лямбда-выражении. А второй параметр
обозначает обрабатываемую символьную строку
 */
public class LambdaAsArgumentsDemo {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда - выражения повышают эффективность Java";
        String outStr;

        System.out.println("Этo исходная строка: " + inStr);

        // Ниже приведено простое лямбда - выражение, преобразующее
        // в верхний регистр букв все символы исходной строки,
        // передаваемой методу stringOp()
        outStr = stringOp((str) -> {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ')
                    result.append(str.charAt(i));
            }
            return result.toString();
        }, inStr);
        System.out.println("Этo строка с удаленными пробелами: " + outStr);

        // Конечно, можно передать и экземпляр интерфейса StringFunc,
        // созданный в предыдущем лямбда-выражении. Например, после
        // следующего объявления ссылка reverse делается на экземпляр
        // интерфейса StringFunc
        outStr = stringOp(String::toUpperCase, inStr);
        System.out.println("Этo строка в верхнем регистре: " + outStr);

        // А здесь передается блочное лямбда-выражение,
        // пробелы из исходной символьной строки
        StringFunc reverse = (str) -> {
            StringBuilder result = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                result.append(str.charAt(i));
            }
            return result.toString();
        };

        // А теперь ссылку reverse можно передать в качестве первого
        // параметра методу stringOp()
        // since it refers to а StringFunc object.
        System.out.println("Этo обращенная строка: " +
                stringOp(reverse, inStr));
    }
}
