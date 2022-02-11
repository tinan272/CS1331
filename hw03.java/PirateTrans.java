/**
 * Purpose is to translate an English sentence given by the user into an Pirate sentence.
 * @author mnguyen354
 * @version 1.0
 */
public class PirateTrans {
    private String notLetter;
    private String pirateSentence;

    /**
     * creates a Pirate English translater that stores the
     * value for the translated Pirate sentence beginning with the word "Yar".
     */
    public PirateTrans() {
        this.pirateSentence = "Yar! ";
    }

    /**
     * Method translating an English sentence into Pirate sentences by splitting
     * the sentence up by each word into an array and translates.
     * Each line of the translated Pirate sentence is put into the variable pirateSentence.
     * pirateSentence is then returned.
     * @param notTranslated The original, not translated English sentence.
     * @return this Pirate-translated sentence.
     */
    public String pirateTranslate(String notTranslated) {
        String[] splitSentence = notTranslated.split(" ");
        int getLength = splitSentence.length;
        String[] translatedParts2 = new String[getLength];
        for (int i = 0; i < splitSentence.length; i++) {
            switchParts(splitSentence[i], i, translatedParts2);
        }
        for (int i = 0; i < translatedParts2.length; i++) {
            if (i != translatedParts2.length - 1) {
                pirateSentence += (translatedParts2[i] + " ");
            } else {
                pirateSentence += (translatedParts2[i]);
            }
        }
        return pirateSentence;
    }


    /**
     * Method that switches specific English words to its Pirate language counterpart.
     * @param parts each word in the English sentence.
     * @param indexNumber indexNumber that corresponds to a word in the English sentence.
     * @param translatedParts will hold each word of the translated English sentence.
     */
    public void switchParts(String parts, int indexNumber,
            String[] translatedParts) {
        if ((!Character.isLetter(parts.charAt(parts.length() - 1)))) {
            this.notLetter = parts.substring(parts.length() - 1);
            parts = parts.substring(0, parts.length() - 1);
        }
        switch (parts) {
        case "and":
            translatedParts[indexNumber] = "'n";
            checker(indexNumber, translatedParts);
            break;

        case "my":
            translatedParts[indexNumber] = "me";
            checker(indexNumber, translatedParts);
            break;

        case "is": case "am": case "are":
            translatedParts[indexNumber] = "be";
            checker(indexNumber, translatedParts);
            break;

        default:
            if (parts.endsWith("ing")) {
                translatedParts[indexNumber] = parts.substring(0, parts.length() - 3) + "in'";
                checker(indexNumber, translatedParts);
            } else if (parts.startsWith("you")) {
                translatedParts[indexNumber] = "ye" + parts.substring(3, parts.length());
                checker(indexNumber, translatedParts);
            } else {
                translatedParts[indexNumber] = parts;
                checker(indexNumber, translatedParts);
            }
        }
    }

    /**
     * Method that checks if any word in the middle of the original sentence has punctuation at the end of the word.
     * @param indexNumber indexNumber that corresponds to a word in the English sentence.
     * @param translatedParts will hold each word of the translated English sentence.
     */
    public void checker(int indexNumber, String[] translatedParts) {
        if (this.notLetter != null) {
            translatedParts[indexNumber] += this.notLetter;
        }
        this.notLetter = null;
    }
}
