package herbert_schildt.chapter_15.lesson15_2;

class LambdaDemo2 {
    public static void main(String[] args) {
        // Лямбда - выражение, проверяющее, является ли число четным
        NumericTest isEven = (n) -> (n % 2) == 0;

        if (isEven.test(10))
            System.out.println("Число 10 четное");
        if (!isEven.test(7))
            System.out.println("Число 7 нечетное");

        // А теперь воспользоваться лямбда - выражением, в котором
        // проверяется, является ли число неотрицательным
        NumericTest isNonNeg = (n) -> n >= 0;

        if (isNonNeg.test(1))
            System.out.println("Число 1 неотрицательное");
        if (!isNonNeg.test(-3))
            System.out.println("Число -3 отрицательное");
    }
}
