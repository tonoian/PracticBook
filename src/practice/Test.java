package practice;

public class Test {
    public static void main(String[] args) {
        System.out.println("1.Print numbers from 1 to 15:");
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
///////////////////////////////////
        System.out.println("2.Print even numbers from -10 to 20:");
        for (int i = -10; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = -10; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
//////////////////////////////////
        System.out.println("3.Print * symbols using given number:");
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
//////////////////////////////////
        System.out.println("4.Create an array with 1 to 11");
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
//////////////////////////////////
        System.out.println("5.Create an array with even numbers from -10 to 10");
        int[] array1 = new int[11];
        for (int i = 0, j = -10; i < array1.length; i++, j += 2) {
            array1[i] = j;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("\n");
//////////////////////////////////
        System.out.println("6.Given an array. Print odd elements");
        int[] array3 = {1, -9, 6, -7, 3, -15, 4, 8, 13, 12, 54};
        System.out.print("array: ");
        for (int a : array3) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (int a : array3) {
            if (a % 2 != 0)
                System.out.print(a + " ");
        }
        System.out.println("\n");
//////////////////////////////////
        System.out.println("7.Given an array. Print elements from -10 to 5");
        System.out.print("array: ");
        for (int a : array3) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (int a : array3) {
            if (a >= -10 && a <= 5)
                System.out.print(a + " ");
        }
        System.out.println("\n");
//////////////////////////////////
        System.out.println("8.Given an array. Print elements which can be divided 3 or 4");
        System.out.print("array: ");
        for (int a : array3) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (int a : array3) {
            if (a % 3 == 0 || a % 4 == 0)
                System.out.print(a + " ");
        }
        System.out.println("\n");
//////////////////////////////////
        System.out.println("9.Given an array. Print count of even elements");
        int count = 0;
        System.out.print("array: ");
        for (int a : array3) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (int j : array3) {
            if (j % 2 == 0)
                count++;
        }
        System.out.println("Count: " + count);
        System.out.println();
//////////////////////////////////
        System.out.println("10.Given an array. Print sum elements");
        array3 = new int[]{4, 9, 7, -12, 6, -1};
        System.out.print("array: ");
        for (int a : array3) {
            System.out.print(a + " ");
        }
        System.out.println();

        int sum = 0;
        for (int a : array3) {
            sum += a;
        }
        System.out.println("sum = " + sum);
        System.out.println();
//////////////////////////////////
        System.out.println("11.Given an array. Print sum of positive elements");
        array3 = new int[]{4, 9, 7, -12, 6, -1};
        System.out.print("array: ");
        for (int a : array3) {
            System.out.print(a + " ");
        }
        System.out.println();

        sum = 0;
        for (int a : array3) {
            if (a > 0)
                sum += a;
        }
        System.out.println("sum = " + sum);
        System.out.println();
//////////////////////////////////
        System.out.println("12.Given an array. Print multiplication elements");
        array3 = new int[]{4, 9, 7, -12, 6, -1};
        System.out.print("array: ");
        for (int a : array3) {
            System.out.print(a + " ");
        }
        System.out.println();

        int multi = 1;
        for (int a : array3) {
            multi *= a;
        }
        System.out.println("multi = " + multi);
        System.out.println();
//////////////////////////////////
        System.out.println("13.Given an array. Find max element from array");
        array3 = new int[]{-12, 42, 54, -9, 6, 4, 3, -1};
        System.out.print("array: ");
        for (int a : array3) {
            System.out.print(a + " ");
        }
        System.out.println();

        int max = array3[0];
        for (int a : array3) {
            if (a > max)
                max = a;
        }
        System.out.println("max = " + max);
        System.out.println();
//////////////////////////////////
        System.out.println("14.Given an array. Find min element from array");
        array3 = new int[]{-12, 42, 54, -9, -105, 6, 4, 3, -1};
        System.out.print("array: ");
        for (int a : array3) {
            System.out.print(a + " ");
        }
        System.out.println();

        int min = array3[0];
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] < min)
                min = array3[i];
        }
        System.out.println("min = " + min);
        System.out.println();
///////////////////////////////////
        System.out.println("15.Given an array. Find element which is alone");
        array3 = new int[]{-4, 2, 42, 2, -4};
        System.out.print("array: ");
        for (int a : array3)
            System.out.print(a + " ");
        System.out.println();

        int result = array3[0];
        for (int i = 1; i < array3.length; i++) {
            result ^= array3[i];
        }
        System.out.println("alone number is: " + result);
        System.out.println();
///////////////////////////////////
        System.out.println("16.Given an array. Sort array in asc");
        array3 = new int[]{-4, 2, 64, -102, -56, 12, 0, 42, 2, -4};
        System.out.print("array: ");
        for (int a : array3)
            System.out.print(a + " ");
        System.out.println();

        boolean l = true;
        int counter = 0;
        while (l) {
            l = false;
            for (int i = 0; i < array3.length - counter - 1; i++) {
                if (array3[i] > array3[i + 1]) {
                    int m = array3[i];
                    array3[i] = array3[i + 1];
                    array3[i + 1] = m;
                    l = true;
                }
            }
            counter++;
        }

        for (int a : array3)
            System.out.print(a + " ");
    }
}
