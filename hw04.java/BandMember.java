/**
 * An abstract class that includes functoonalities that each band member shares.
 * @author mnguyen354
 * @version 1.0
 */
public abstract class BandMember {
    protected String name;
    protected int talent;

    /**
     * Creates a BandMember with a String name and an integer talent from 1-5.
     * @param nameP the name of the member
     * @param talentP the integer from 1-5 that represents the talent of the member.
     */
    protected BandMember(String nameP, int talentP) {
        this.name = nameP;
        if (talentP < 1) {
            this.talent = 1;
        } else if (talentP > 5) {
            this.talent = 5;
        } else {
            this.talent = talentP;
        }
    }

    /**
     * Abstract class that rates the member's performance out of 10.
     */
    public abstract void perform();

    /**
     * Method that prints the memeber's name and their talemt rated out of 5.
     * @return a string showing the member's name and talent out of 5
     */
    public String toString() {
        return this.name + ": " + this.talent + "/5";
    }

    /**
     * Method that returns a boolean representing whether or not two objects have the same name and talent ratings.
     * @return boolean indicating whether the objects are equal
     * @param anObject a band member that is being compared
     */
    public boolean equals(Object anObject) {
        if (anObject == null) {
            return false;
        } else {
            if (this == anObject) {
                return true;
            } else if (getClass() != anObject.getClass()) {
                return false;
            } else {
                BandMember aObject = (BandMember) anObject;
                return ((this.name.equals(aObject.name)) && (this.talent == aObject.talent));
            }
        }
    }

    /**
     * Getter method that returns the name of the band member.
     * @return name of the band member
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter method that returns the name of the band member.
     * @return name of the band member
     */
    public int getTalent() {
        return this.talent;
    }

    /**
     * Setter method that changes the talent to a certain rating.
     * @param talent integer that represents the talent score of the member
     */
    public void setTalent(int talent) {
        this.talent = talent;
    }

    /**
     * Method that gets the performance score of each member.
     * @return an integer that represents the member's performance
     */
    public abstract int getScore();
}