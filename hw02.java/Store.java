
public class Store {

    private Cheese[] cheeseStock;
    private Turkey[] turkeyStock;
    private String storeName;
    int cheeseCounter;
    int turkeyCounter;

    public Store(String name) {

        cheeseStock = new Cheese[5];
        turkeyStock = new Turkey[5];
        this.storeName = name;

    }

    public String currentStock() {

        for (int i=0; i<cheeseStock.length; i++) {
            if (cheeseStock[i] != null) {
                cheeseCounter +=1;
            }
        }

        for (int i=0; i<turkeyStock.length; i++) {
            if (turkeyStock[i] != null) {
                turkeyCounter +=1;
            }
        }

        return ("Current stock " + storeName + ": \n" + 
             "Cheese: " + cheeseCounter +
             "\nTurkey: " + turkeyCounter);

    }

    public void addStock(Cheese cheeseAdd) {

            for (int i=0; i<cheeseStock.length; i++) {
                if (cheeseStock[i] == null) {
                    cheeseStock[i] = cheeseAdd;
                    break;
            }
        }
    }

    public void addStock(Turkey turkeyAdd) {
            for (int i=0; i<turkeyStock.length; i++) {
                if (turkeyStock[i] == null) {
                    turkeyStock[i] = turkeyAdd;
                    break;
            }
        }
    }
    
    public Cheese deleteCheese() {
        for (int i=0; i<cheeseStock.length; i++) {

            if (cheeseStock[i] == null) {

                if(i==0) {

                    cheeseStock[0] = new Cheese("Gouda", "shredded");
                    cheeseStock[1] = new Cheese("Mozerella");
                    cheeseStock[2] = new Cheese();
                    cheeseStock[3] = new Cheese("Brie");
                    cheeseStock[4] = new Cheese("Feta", "not shredded");

                }

                else {
                    Cheese x = cheeseStock[i-1]; 
                    cheeseStock[i-1] = null;
                    return x;

                }

            }
        }
        Cheese removedC = cheeseStock[4];
        cheeseStock[4] = null;
        return removedC;
    }

    public Turkey deleteTurkey() {
        for (int i=0; i<turkeyStock.length; i++) {
            if (turkeyStock[i] == null) {
                if(i==0) {

                    turkeyStock[0] = new Turkey((float) 3.25);
                    turkeyStock[1] = new Turkey((float) 5.65);
                    turkeyStock[2] = new Turkey((float) 2.34);
                    turkeyStock[3] = new Turkey((float) 1.23);
                    turkeyStock[4] = new Turkey((float) 6.43);

                }

                else {

                    Turkey t = turkeyStock[i-1]; 
                    turkeyStock[i-1] = null;
                    return t;

                }

            }
        }
        
        Turkey removedT = turkeyStock[4];
        turkeyStock[4] = null;
        return removedT;
        
    }

    
    

    public float getTPrice (Turkey turkeyPrice) {
        return turkeyPrice.getPriceT();
    }


}