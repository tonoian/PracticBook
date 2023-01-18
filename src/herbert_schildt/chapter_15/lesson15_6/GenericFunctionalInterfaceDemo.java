package herbert_schildt.chapter_15.lesson15_6;

class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        // использовать строковый вариант интерфейса SomeFunc
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Лямбдa обращается на " +
                reverse.func("Лямбдa"));
        System.out.println("Выражение обращается на " +
                reverse.func("Выражение"));

        // а теперь использовать целочисленный вариант интерфейса SomeFunc
        SomeFunc<Integer> functional = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println("Фaктopиaл числа 4 равен " +
                functional.func(4));
        System.out.println("Фaктopиaл числа 7 равен " +
                functional.func(7));
    }
}
