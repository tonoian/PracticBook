package herbert_schildt.chapter_9.lesson9_2.my_pack;

// Простой пакет

class Balance {
    String name;
    double bal;

    Balance(String name, double bal) {
        this.name = name;
        this.bal = bal;
    }

   void show() {
        if (bal < 0)
            System.out.println("--> ");
        System.out.println(name + ": $" + bal);
    }
}


// для класса TestBalance

//public class Balance {
//    String name;
//    double bal;
//
//    public Balance(String name, double bal) {
//        this.name = name;
//        this.bal = bal;
//    }
//
//    public void show() {
//        if (bal < 0)
//            System.out.println("--> ");
//        System.out.println(name + ": $" + bal);
//    }
//}
