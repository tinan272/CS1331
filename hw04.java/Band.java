import java.util.ArrayList;

/**
 * Creates a band that includes singers and guitarists.
 * @author mnguyen354
 * @version 1.0
 */
public class Band {
    private String bandName;
    private String genre;
    private ArrayList<BandMember> members = new ArrayList<>();
    private double end = 0.0;
    private double tracker;

    /**
     * Creates a band with a name, genre, and band members.
     * @param bandNameP name of the band
     * @param genreP genre of the band
     * @param membersP ArrayList storing band members
     */
    public Band(String bandNameP, String genreP, ArrayList<BandMember> membersP) {
        bandName = bandNameP;
        genre = genreP;
        members = membersP;
    }

    /**
     * Method that returns the name of the band.
     * @return the name of the band
     */
    public String getName() {
        return bandName;
    }

    /**
     * Method that returns the array that holds all the band members.
     * @return the ArrayList storing all band members
     */
    public ArrayList<BandMember> getMembers() {
        return members;
    }

    /**
     * Method that calculates the average of all the performance scores of each band member.
     * @return the average of all the performance scores of each band member.
     */
    public double talentRating() {
        double track = 0.0;
        if (members.isEmpty()) {
            return 1;
        }
        for (int i = 0; i < members.size(); i++) {
            track += (members.get(i)).getTalent();
        }
        end = ((track) / ((double) members.size()));
        return end;
    }

    /**
     * Simulates each band's performance and prints the band's official performance score.
     * @return the performance score of the band
     */
    public double perform() {
        double track = 0.0;
        for (int i = 0; i < members.size(); i++) {
            members.get(i).perform();
        }
        for (int i = 0; i < members.size(); i++) {
            track += (members.get(i)).getScore();
        }
        tracker = ((track) / ((double) members.size()));
        System.out.println(bandName + "'s Performance Score: " + tracker + "/10");
        return tracker;
    }

    /**
     * Shows summary of band's name, genre, and performance score and each member's specifics.
     * @return A summary of the band's information including the specifics of each band member.
     */
    public String toString() {
        String summary;
        talentRating();
        summary = bandName + " (" + genre + "): " + end + "/5" + "\n";
        for (int i = 0; i < members.size(); i++) {
            if (i == members.size() - 1) {
                summary += members.get(i);
            } else {
                summary += members.get(i) + "\n";
            }
        }
        return summary;
    }

    /**
     * Adds members to the band.
     * @param member a band member that gets add to the arrayList
     */
    public void addMembers(BandMember member) {
        members.add(member);
    }

    /**
     * Obtains the average performance score of the band.
     * @return the average performance score of the band
     */
    public double getWinner() {
        return tracker;
    }
}
