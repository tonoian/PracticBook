package herbert_schildt.chapter_15.lesson15_10;

// определяется статический метод strReverse()
public class MyStringOps {
    // Статический метод, изменяющий порядок
    // следования символов в строке
    public static String strReverse(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
