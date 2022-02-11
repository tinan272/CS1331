/**
 * Purpose is to store and print the last 3 translations or less.
 * @author mnguyen354
 * @version 1.0
 */
public class History {

    private String[] storeNewTrans;
    private String[] storeOldTrans;
    private String newT;

    /**
     * creates an instance of the History of the translations with two
     * empty arrays meant to store the new translations with the English counterpart.
     */
    public History() {
        this.storeNewTrans = new String[4];
        this.storeOldTrans = new String[4];
    }

    /**
     * Method that checks if any part of the array is null and
     * stores both the new translated strings into the storeNewTrans array
     * and the original translated strings into the storeOldTrans array.
     * @param eachTrans The translated English sentence.
     * @param orgInput The original English sentence.
     */
    public void storeTrans(String eachTrans, String orgInput) {
        this.newT = eachTrans;
        for (int i = 0; i < storeNewTrans.length; i++) {
            if (storeNewTrans[i] == null) {
                storeNewTrans[i] = eachTrans;
                storeOldTrans[i] = orgInput;
                break;
            }
        }
    }

    /**
     * Method that checks to see where the new sentences are within the arrays and aren't. It
     * then prints all the original and past translations. The method also takes into account
     * when the arrays are filled to the maximum and thus replaces the oldest translations with
     * newer ones to print.
     */
    public void getTranslations() {
        if (storeNewTrans[1] != null) {
            System.out.println("Past Translations: ");
            System.out.println(storeOldTrans[0] + " -> " + storeNewTrans[0]);
        }
        if (storeOldTrans[2] != null) {
            System.out.println(storeOldTrans[1] + " -> " + storeNewTrans[1]);
        }
        if (storeOldTrans[3] != null) {
            System.out.println(storeOldTrans[2] + " -> " + storeNewTrans[2]);
        }

        if (storeNewTrans[3] != null) {
            storeNewTrans[0] = storeNewTrans[1];
            storeNewTrans[1] = storeNewTrans[2];
            storeNewTrans[2] = storeNewTrans[3];
            storeNewTrans[3] = newT;

            storeOldTrans[0] = storeOldTrans[1];
            storeOldTrans[1] = storeOldTrans[2];
            storeOldTrans[2] = storeOldTrans[3];
            storeOldTrans[3] = newT;
        }
    }
}
