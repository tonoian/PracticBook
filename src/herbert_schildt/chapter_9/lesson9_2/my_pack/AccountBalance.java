package herbert_schildt.chapter_9.lesson9_2.my_pack;

public class AccountBalance {
    public static void main(String[] args) {
        Balance[] current = new Balance[3];

        current[0] = new Balance("John", 123.23);
        current[1] = new Balance("Mike", 15.9);
        current[2] = new Balance("Tom", 45.78);

        for (Balance i : current) {
            i.show();
        }
    }
}
