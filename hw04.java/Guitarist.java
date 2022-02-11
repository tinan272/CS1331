import java.util.Random;

/**
 * Creates a guitarist that is one of the band members.
 * @author mnguyen354
 * @version 1.0
 */
public class Guitarist extends BandMember {

    /**
     * The enum stores the possible specalities (acoustic and electric) that guitarists can have.
     */
    public enum Specialty {
        ACOUSTIC, ELECTRIC;
    }

    /**
     * The variable stores the specialty that the specific guitarist can play their guitar in.
     */
    private Specialty specialization;
    private int performScore;

    /**
     * Creates a guitarist that has a name, talent rating, and a specialty in acoustic or electric guitar.
     * @param nameP the name of the guitarist
     * @param talentP the integer rating representing the guitarist's talent
     * @param specP the speciality of the guitarist
     */
    public Guitarist(String nameP, int talentP, Specialty specP) {
        super(nameP, talentP);
        specialization = specP;
    }

    /**
     * Method for the guitarist to perform and recieve a rating based on their talent added to a random integer.
     */
    @Override
    public void perform() {
        Random rand = new Random();
        int randomNum = rand.nextInt(9) + 1;
        int highNote = rand.nextInt(100);
        performScore = this.talent + randomNum;
        if (highNote < 30) {
            performScore *= 2;
        }

        if (performScore > 10) {
            performScore = 10;
        }

        if (performScore < 5) {
            System.out.println(this.name + "'s fingers slipped and hit the wrong note! Score: "
                    + performScore + "/10");
        } else if (performScore >= 5) {
            System.out.println(this.name + " sang their heart out! Score: " + performScore + "/10");
        }
    }

    /**
     * Method that returns the memeber's name and their talemt rated out of 5 and their vocal range.
     * @return string of their name and their talent and their vocal range.
     */
    public String toString() {
        return this.name + ": " + this.talent + "/5 " + this.specialization;
    }

    /**
     * Method that checks if the a guitarist is identical to another object.
     * @return boolean that states if it's true that two objects are identical or false it they aren't
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
                Guitarist aOb = (Guitarist) anObject;
                return ((this.name.equals(aOb.name)) && (this.talent == aOb.talent)
                        && (this.specialization.equals(aOb.specialization)));
            }
        }
    }

    /**
     * Method that gets the performance score of each member.
     * @return an integer that represents the member's performance
     */
    @Override
    public int getScore() {
        return performScore;
    }
}
