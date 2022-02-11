import java.util.Scanner;

/**
* Represents magical item wand.
* @author mnguyen354
* @version 1.0
*/
public class Wand extends MagicItem implements Rechargeable {
    private String owner;

    /**
     * Creates a wand.
     * @param wName name
     * @param wPower power
     * @param owner owner of the wands
     */
    public Wand(String wName, int wPower, String owner) {
        super(wName, wPower);
        this.owner = owner;
    }

    /**
     * Grants wish depending on current item power.
     */
    @Override
    public void invoke() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scan.nextLine();
        if (!(userName.equals(owner))) {
            System.out.println("I'm sorry, you are not the true owner");
        } else if (userName.equals(owner) && power >= 25) {
            System.out.println("FIREBALL!");
        } else {
            System.out.println("Not enough power");
        }
    }

    /**
     * Compares two items to see if they're equal.
     * @param item takes in an Object to compare to current object
     * @return boolean telling whether the objects are equal
     */
    @Override
    public boolean equals(Object item) {
        if (item == null) {
            return false;
        } else if (getClass() != item.getClass()) {
            return false;
        } else {
            Wand newItem = (Wand) item;
            return (this.name.equals(newItem.name)) && (this.power == newItem.power) && (this.owner.equals(owner));
        }
    }

    /**
     * Adds more power to item.
     * @param addP power added to item
     */
    public void recharge(int addP) {
        this.power += addP;
    }

    /**
     * Prints the name of the object and how much power it has.
     * @return String describing object's name and amount of power
     */
    @Override
    public String toString() {
        return "Wand: " + this.name + " has " + this.power + " power left";
    }
}
