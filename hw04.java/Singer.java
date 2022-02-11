import java.util.Random;

/**
 * Creates a singer that is one of the band members.
 * @author mnguyen354
 * @version 1.0
 */
public class Singer extends BandMember {

    /**
     * The enum stores the possible vocal ranges of a singer.
     */
    public enum Range {
        BASS, BARITONE, TENOR, ALTO, SOPRANO;
    }

    /**
     * The variable stores the range that the specific singer can sing in.
     */
    private Range playRange;
    private int performScore;

    /**
     * Creates a singer band member with a name, talent rating from 1-5, and the range of the singer's voice.
     * @param name the name of the singer
     * @param talent the talent rating of the singer
     * @param playRangeP the range of the singer's voice
     */
    public Singer(String name, int talent, Range playRangeP) {
        super(name, talent);
        playRange = playRangeP;
        performScore = 0;
    }

    /**
     * Method for the singer to perform and recieve a rating based on their talent added to a random integer.
     */
    @Override
    public void perform() {
        Random rand = new Random();
        int randomNum = rand.nextInt(9) + 1;
        int highNote = rand.nextInt(100);
        performScore = this.talent + randomNum;
        if (highNote < 10) {
            performScore *= 2;
        }

        if (performScore > 10) {
            performScore = 10;
        }

        if (performScore < 5) {
            System.out.println(this.name + "'s voice cracked in the middle of their performance! Score: "
                    + performScore + "/10");
        } else if (performScore >= 5) {
            System.out.println(this.name + " sang their heart out! Score: " + performScore + "/10");
        }
    }

    /**
     * Method that returns the memeber's name and their talemt rated out of 5 and their vocal range.
     * @return string of their name and their talent and their vocal range
     */
    public String toString() {
        return this.name + ": " + this.talent + "/5 " + this.playRange;
    }

    /**
     * Method that checks if the a singer is identical to another object.
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
                Singer aObject = (Singer) anObject;
                return ((this.name.equals(aObject.name)) && (this.talent == aObject.talent)
                        && (this.playRange.equals(aObject.playRange)));
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
