/**
 * Purpose is to translate an English sentence given by the user into an Elmer fudd sentence.
 * @author mnguyen354
 * @version 1.0
 */
public class ElmerTrans {

    private String elmerSentence = "";

    /**
     * Method translating an English sentence into Elmer fudd sentences by splitting
     * the original English sentence. The method then replaces instances of specific strings
     * inside the original English sentence. The translated string is then returned.
     * @param notTranslated The original, not translated sentence.
     * @return this Elmer-translated string.
     */
    public String elmerTranslate(String notTranslated) {
        String[] splitSentence = notTranslated.split(" ");
        int getLength = splitSentence.length;
        String[] translatedParts = new String[getLength];
        for (int i = 0; i < splitSentence.length; i++) {
            String word = splitSentence[i].toLowerCase();
            String originalWord = splitSentence[i];
            if (word.indexOf("th") != -1 || word.indexOf("ith") != -1) {
                if (word.indexOf("ith") != -1) {
                    if (isCap(word, "ith", originalWord)) {
                        translatedParts[i] = originalWord.replace("Ith", "If");
                        word = translatedParts[i];
                    } else {
                        translatedParts[i] = originalWord.replace("ith", "if");
                        word = translatedParts[i];
                    }
                } else {
                    if (isCap(word, "th", originalWord)) {
                        translatedParts[i] = originalWord.replace("Th", "D");
                    } else {
                        translatedParts[i] = originalWord.replace("th", "d");
                        word = translatedParts[i];
                    }
                }
            }

            if (word.indexOf("l") != -1) {
                if (isCap(word, "l", originalWord)) {
                    translatedParts[i] = originalWord.replace("L", "W");
                    word = translatedParts[i];
                } else {
                    translatedParts[i] = originalWord.replace("l", "w");
                    word = translatedParts[i];
                }
            }
            if (word.indexOf("r") != -1) {
                if (isCap(word, "r", originalWord)) {
                    translatedParts[i] = originalWord.replace("R", "W");
                } else {
                    translatedParts[i] = originalWord.replace("r", "w");
                }
            }
            if (translatedParts[i] == null) {
                translatedParts[i] = originalWord;
            }
        }

        for (int i = 0; i < translatedParts.length; i++) {
            if (i != translatedParts.length - 1) {
                elmerSentence += (translatedParts[i] + " ");
            } else {
                elmerSentence += (translatedParts[i]);
            }
        }
        return elmerSentence;
    }

    /**
     * Method that checks if the word is capitalized or not. If it is capitalized,
     * then it would return a boolean which then allows the elmerTranslate class to
     * translate accordingly.
     * @param word The lowercase original, not translated word.
     * @param substring The specific cases of words/letters being looked for to change.
     * @param original The original, not translated word.
     * @return this boolean to see whether the original word was capitalized or not.
     */
    public boolean isCap(String word, String substring, String original) {
        boolean isTrueOrF = true;
        int indexOfSub = word.indexOf(substring);
        char getChar = original.charAt(indexOfSub);
        if (Character.isUpperCase(getChar)) {
            isTrueOrF = false;
        }
        return isTrueOrF;
    }
}