package ru.store;


import goods.Alcohol;
import sport.Ball;
import sport.SportGoods;
import staff1.Cashier;
import staff1.Hostess;
import staff1.ShopAssistant;

public class Store {
    public static void main(String[] args) {

        ClassOfflineStore f2 = new ClassOfflineStore();
        f2. openStore();

        for (int staff = 0; staff < 50;){
            staff++;
            System.out.println(staff);
        }

        ClassOfflineStore f1 = new ClassOfflineStore();
        f1.theBuyerCame();

        Hostess g1 = new Hostess();
        g1.sayHello();

        if (theClientNeedsHelp()){
            System.out.println("Консультант не подходит");
        } else
            System.out.println("Консультант оказывает помощь");

        Hostess g2 = new Hostess();
        g2.offerABasket();

        Hostess g3 = new Hostess();
        g3.escortsToTheDepartment();

        ShopAssistant s1 = new ShopAssistant();
        s1.helpsWithTheChoice();

        Adidas p = new Adidas();
        p.checkBrand();

        Ball color = new Ball("черный");
        System.out.println(color.getColor());
        Ball color1 = new Ball("черный");
        System.out.println(color1.setColor("белый"));

        SportGoods a3 = new  SportGoods();
        a3.takeFromTheShelf();

        SportGoods a5 = new SportGoods();
        a5.testGood();

        SportGoods a4 = new SportGoods();
        a4. putOnBasket();

        ShopAssistant s2 = new ShopAssistant();
        s2.sayGoodbye();

        ClassOfflineStore f3 = new ClassOfflineStore();
        f3.theBuyerGoesToTheCheckout();

        Cashier c1 = new Cashier();
        c1.sayHello();

        Cashier c2 = new Cashier();
        c2.scanGood();

        Cashier c3 = new Cashier();
        c3.sayTheAmount();

        Cashier c4 = new Cashier();
        c4.packGood();

        Cashier c5 = new Cashier();
        c5.sayGoodbye();

        boolean blackBall = true;
        if (blackBall) System.out.println("Покупка совершена");

        int countingProductsInTheBasket = 0, countingProductsInTheBasket2 = 21;
        while (countingProductsInTheBasket < 20){
            countingProductsInTheBasket++;
        }
        System.out.println(countingProductsInTheBasket);

        do {
            countingProductsInTheBasket++;
            System.out.println(countingProductsInTheBasket);
        } while (countingProductsInTheBasket2 < 20);

        System.out.println("-------------------------------------------------");

        Alcohol korzinaProductov[] = {new Alcohol("balantais"), new Alcohol("jack daniels")};
       for (Alcohol n1:korzinaProductov){
            System.out.println(n1.getName());
        }
       Alcohol korzinaProductov2[] = new Alcohol[2];
        for (Alcohol i:korzinaProductov2) {
            System.out.println(i.capacity);
        }
        int korzinaProductov1 = 0, korzinaProductov3 = 3;
        while (korzinaProductov1 < 2){
            korzinaProductov1++;
        }
        System.out.println(korzinaProductov1);

        do {
            korzinaProductov1++;
            System.out.println(korzinaProductov1);
        } while (korzinaProductov3 < 2);

       }

    private static boolean theClientNeedsHelp() {
        return false;
    }


}