/**
* Represents magical item lamp.
* @author mnguyen354
* @version 1.0
*/
public class Lamp extends MagicItem {
    private boolean genieHome;

    /**
     * Creates a lamp.
     * @param lName name of lamp
     * @param lPower power of lamp
     * @param lHome whether genie is home or not
     */
    public Lamp(String lName, int lPower, boolean lHome) {
        super(lName, lPower);
        genieHome = lHome;
    }

    /**
     * Check if genie is home.
     * @return boolean representing if genie is home.
     */
    public boolean getGenieHome() {
        return this.genieHome;
    }

    /**
     * Prints the name of the object and how much power it has.
     * @return String describing object's name and amount of power
     */
    @Override
    public String toString() {
        return "Lamp: " + this.name + " has " + this.power + " power left";
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
            Lamp newItem = (Lamp) item;
            return (this.name.equals(newItem.name)) && (this.power == newItem.power)
                    && (this.genieHome == newItem.genieHome);
        }
    }

    /**
     * Grants wish depending on current item power.
     */
    @Override
    public void invoke() {
        if (genieHome) {
            if (this.getPower() > 50) {
                System.out.println("Wish granted!");
            } else {
                System.out.println("Not enough power!");
            }
        } else {
            System.out.println("Genie away, come back later!");
        }
    }
}
