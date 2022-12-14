package herbert_schildt.chapter_7;
/*
   В этой программе демонстрируется отличие
   модификаторов public и private.
 */
class Test_4{
    int a; // доступ, определяемый по умолчанию
    public int b; // открытый доступ
    private int c; // закрытый доступ

    // методы доступа к члену с данного класса
    void set_c(int i){ // установить значение члена с данного класса
        c = i;
    }
    int get_c(){ // получить значение члена с данного класса
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Test_4 ob = new Test_4();

        // Эти операторы правильны, поэтому члены а и Ь
        // данного класса доступны непосредственно
        ob.a = 10;
        ob.b = 20;

        // Этот оператор не верен и может вызвать ошибку
        // оb.с = 100; ОШИБКА!

        // Доступ к члену с данного класса должен осуществляться
        // с помощью методов ее класса
        ob.set_c(100);
        System.out.println("a, b, c: " + ob.a + ", " + ob.b + ", " + ob.get_c());


    }
}
