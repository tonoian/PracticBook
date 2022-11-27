package lesson_2;
//-------------------2.2-----------------//
public class AssignExample {
    public static void main(String[] args) {
        int var1;
        int var2;

        var1 = 4096;
        var2 = var1 / 4;

        System.out.println("var1 = " + var1);
        System.out.println("var2 = var1 / 4 = " + var2);

        System.out.println();

        //-------------2.3.2---------------//

        int var3 = 99;
        if(var3 < 100){
            System.out.println("It`s true");
        }
        if(var3 > 100){
            System.out.println("It`s false");
        }
        if(99 > 100){
            System.out.println("It`s false to");
        }

    }
}
