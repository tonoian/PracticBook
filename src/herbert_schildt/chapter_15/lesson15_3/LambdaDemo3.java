package herbert_schildt.chapter_15.lesson15_3;

class LambdaDemo3 {
    public static void main(String[] args) {
        // В этом лямбда - выражении проверяется, является ли
        // одно число множителем другого
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2))
            System.out.println("Число 2 является множителем числа 10");
        if (!isFactor.test(10, 7))
            System.out.println("Число 7 не является множителем числа 10");
    }
}
