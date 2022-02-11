/**
* Represents a carpet which is a magic item.
* @author mnguyen354
* @version 1.0
*/
public class Carpet extends MagicItem implements Rechargeable {
    private double height;

    /**
     * Creates a carpet.
     * @param cName name of carpet
     * @param cPower power of carpet
     * @param cHeight current flying height in meters
     */
    public Carpet(String cName, int cPower, double cHeight) {
        super(cName, cPower);
        this.height = cHeight;
    }

    /**
     * Grants wish depending on current item power.
     */
    @Override
    public void invoke() {
        if (power >= 10) {
            power -= 10;
            System.out.println("We're " + height + " meters off the ground!");
        } else {
            System.out.println("Not enough power");
        }
    }

    /**
     * Sets height to 0 and lands the carpet.
     */
    public void land() {
        height = 0.0;
        System.out.println("We landed");
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
            Carpet newItem = (Carpet) item;
            return (this.name.equals(newItem.name)) && (this.power == newItem.power) && (this.height == newItem.height);
        }
    }

    /**
     * Adds more power to item.
     * @param addP power added to item
     */
    @Override
    public void recharge(int addP) {
        this.power += addP;
    }

    /**
     * Prints the name of the object and how much power it has.
     * @return String describing object's name and amount of power
     */
    @Override
    public String toString() {
        return "Carpet: " + this.name + " has " + this.power + " power left";
    }
}
