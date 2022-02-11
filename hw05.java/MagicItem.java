/**
* Represents a magic item that has a name and amount of power.
* @author mnguyen354
* @version 1.0
*/
public abstract class MagicItem implements Comparable<MagicItem> {
    protected int power;
    protected String name;

    /**
     * Makes a magic item with a name and amount of power in item.
     * @param name name of item
     * @param power amount of power in item
     */
    public MagicItem(String name, int power) {
        this.name = name;
        this.power = power;
    }

    /**
     * Gets item's power.
     * @return amount of power of item
     */
    public int getPower() {
        return this.power;
    }

    /**
     * Gets item's name.
     * @return name of item
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets item's power to a new power amount.
     * @param newPower amount of power to change to
     */
    public void setPower(int newPower) {
        this.power = newPower;
    }

    /**
     *
     */
    public abstract void invoke();

    /**
     * Prints the name of the object and how much power it has.
     * @return String describing object's name and amount of power
     */
    @Override
    public String toString() {
        return this.name + " has " + this.power + " power left";
    }

    /**
     * Compares two items to see if they're equal.
     * @param item takes in an Object to compare to current object
     * @return boolean telling whether the objects are equal
     */
    @Override
    public boolean equals(Object item) {
        MagicItem newItem;
        if (item == null) {
            return false;
        } else if (getClass() != item.getClass()) {
            return false;
        } else {
            newItem = (MagicItem) item;
            return (this.name.equals(newItem.getName())) && (this.power == newItem.getPower());
        }
    }

    /**
     * Sees if the power of the current item is less or greater than the other item.
     * @param mitem item being compared to current magic item
     * @return integer representing whether the current object's power was less or greater than the other.
     */
    @Override
    public int compareTo(MagicItem mitem) {
        if (this.power > mitem.getPower()) {
            return power - mitem.getPower();
        } else if (this.power < mitem.getPower()) {
            return power - mitem.getPower();
        } else {
            return 0;
        }
    }
}
