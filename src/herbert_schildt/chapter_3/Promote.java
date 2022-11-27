package herbert_schildt.chapter_3;

public class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        long l = 1245L;
        float f = 5.67F;
        double d = 0.1257;
        double result = (f * b) + (i / c) - (d * s) + l;
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s) + " + " + l);
        System.out.println("result = " + result);
    }
}
