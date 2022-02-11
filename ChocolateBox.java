import java.util.Random;
public class ChocolateBox {
    enum Chocolate {
        CARAMEL, MARSHMALLOW, DARK, NOUGAT, MILK
    }
    
    
    public static Chocolate[] createBox() {
        Random rand = new Random();
        Chocolate[] box = new Chocolate[6];
        for(int i=0; i<box.length; i++) {
            int randomChoc = rand.nextInt(5);
            box[i] = Chocolate.values()[randomChoc];
        }
        return box;
    }
    
    public static void printBox(Chocolate[] a) {
        System.out.println("Your  assortment  of chocolates includes: ");
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i].name());
        }
        System.out.println();

    }

    public static void main(String[] args) {
        printBox(createBox());
        printBox(createBox());
    }




}
