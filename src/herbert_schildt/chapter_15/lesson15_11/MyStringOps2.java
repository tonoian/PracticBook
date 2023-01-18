package herbert_schildt.chapter_15.lesson15_11;

//  Теперь в этом классе определяется метод экземпляра strReverse()
public class MyStringOps2 {
    String strReverse(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
