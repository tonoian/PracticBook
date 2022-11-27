package herbert_schildt.chapter_4;
// Применение сдвига влево в качестве быстрого способа умножения на 2
public class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xffffffe;
        System.out.println(num);

        for(i = 0; i < 4; i++){
            num = num << 1;
            System.out.println(num);
        }
    }
}
