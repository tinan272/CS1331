public class Cart {
    private Cheese[] cheeseNum;
    private Turkey[] turkeyNum; 
    private float moneySpent;
    private Store store1;
    

    public Cart(Store s) {

        this.cheeseNum = new Cheese[3];
        this.turkeyNum = new Turkey[3];
        this.store1 = s;
        this.moneySpent = 0;

    }

    public void cartCheeseStock() {
        System.out.println(cheeseNum[0] + "\n" + cheeseNum[1] + "\n" + cheeseNum[2]);
    }
    public void cartTurkeyStock() {
        System.out.println(turkeyNum[0] + "\n" + turkeyNum[1] + "\n" + turkeyNum[2]);
    }

    public void addCart(String CoT) {

        if (CoT.equals("Cheese")) {

            Cheese cheeseInCart = store1.deleteCheese();

            for (int i = 0; i<cheeseNum.length; i++) {
                if (cheeseNum[i] == null) {
                    cheeseNum[i] = cheeseInCart;
                    break;
                } 
            }

        }

        if (CoT.equals("Turkey")) {

            Turkey turkeyInCart = store1.deleteTurkey();

            for (int i = 0; i<turkeyNum.length; i++) {
                if (turkeyNum[i] == null) {
                    turkeyNum[i] = turkeyInCart;
                    break;
                } 
            }

        }

    }

    public float moneySpent() {

        float tCounter = 0f;
        float cCounter = 0f;
        Turkey notNullT = new Turkey(1f);
        Cheese notNullC = new Cheese();

        for (int i =0; i<turkeyNum.length; i++) {
            if (turkeyNum[i] != null) {
                tCounter += 1;
                notNullT = turkeyNum[i];
            }
        }
        
        if (tCounter != 0) {
            this.moneySpent = notNullT.getPriceT() * tCounter;
        }
            


        for (int i =0; i<cheeseNum.length; i++) {
            if (cheeseNum[i] != null) {
                cCounter += cCounter;
                notNullC = cheeseNum[i];
            }
        }

        if (tCounter != 0) {
            this.moneySpent += notNullC.getPriceC() * cCounter;
        }
        
        return this.moneySpent;

    }

    public float checkOut(double money) {

        if (money>= (double) moneySpent) {

            for (int i=0; i<cheeseNum.length; i++) {
                cheeseNum[i] = null;
                turkeyNum[i] = null;
            }

            return (float) money - moneySpent;
        }
        
        else {

            return (float) -1.0;
    
        }
    }

}
