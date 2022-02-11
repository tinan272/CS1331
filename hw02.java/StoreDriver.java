public class StoreDriver {
    public static void main(String[] args) {

    Store Publix = new Store("Publix");
    Cart cart1 = new Cart(Publix);
    Cheese Gouda = new Cheese("Gouda");
    Turkey turk1 = new Turkey(1.23f);

    Publix.addStock(Gouda);// testing Store methods: ADDSTOCK, DELETE, GET PRICE
    Publix.addStock(turk1);
    System.out.println(Publix.currentStock()); 
    System.out.println(Publix.deleteCheese());
    System.out.println(Publix.deleteCheese());
    System.out.println(Publix.deleteTurkey());
    System.out.println(Publix.currentStock());
    System.out.println(turk1.getPriceT());
    System.out.println(Gouda.getPriceC());

    cart1.addCart("Cheese"); // testing cart
    cart1.addCart("Cheese");
    cart1.addCart("Turkey");
    cart1.addCart("Turkey");
    cart1.cartCheeseStock();
    cart1.cartTurkeyStock();
    System.out.println(cart1.moneySpent());
    System.out.println(cart1.checkOut(20));
    System.out.println("can't check out: " + cart1.checkOut(2));

    Gouda.changePrice(3.0f);
    turk1.changePrice(12.222f);
    turk1.getPriceT();
    System.out.println(Gouda.getPriceC());
    System.out.println("price of turkey is $" + Publix.getTPrice(turk1));


    }

}