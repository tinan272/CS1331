import java.util.Scanner;
/**
 * Purpose is to run the PirateTrans, ElmerTrans, and History class to translate
 * an English sentence into Pirate or Elmer fudd sentences.
 * @author mnguyen354
 * @version 1.0
 */
public class PirateFudd {
     /**
     * The method asks the users to input a sentence they want to translate. It then
     * prints the associated translation using the necessary classes.
     * The method also loops the program until the user no longer has a sentence
     * they want to convert. This is done using a while loop.
     * @param args arguments for the command line.
     */
    public static void main(String[] args) {
        boolean repeatQ = true;
        boolean goAgain = true;
        boolean repeatAgain = true;
        History history1 = new History();
        while (goAgain) {
            Scanner askInput = new Scanner(System.in);
            PirateTrans translate1 = new PirateTrans();
            ElmerTrans translate2 = new ElmerTrans();
            System.out.print("Input English Sentence: ");
            String sentInput = askInput.nextLine();
            System.out.print("Pirate (Y/N): ");
            String answerInputP = askInput.nextLine();
            while (!answerInputP.equals("Y") && (!answerInputP.equals("N"))) {
                System.out.print("Pirate (Y/N): ");
                answerInputP = askInput.nextLine();
                if (answerInputP.equals("Y") || (answerInputP.equals("N"))) {
                    break;
                }
            }
            repeatQ = true;
            while (repeatQ) {
                if (answerInputP.equals("Y")) {
                    String pirateSent = translate1.pirateTranslate(sentInput);
                    System.out.println(pirateSent);
                    System.out.print("Elmer Fudd (Y/N): ");
                    String answerInputE = askInput.nextLine();
                    while (!answerInputE.equals("Y") && (!answerInputE.equals("N"))) {
                        System.out.print("Elmer Fudd (Y/N): ");
                        answerInputE = askInput.nextLine();
                        if (answerInputP.equals("Y") || (answerInputP.equals("N"))) {
                            break;
                        }
                    }
                    if (answerInputE.equals("Y")) {
                        String tempV = translate2.elmerTranslate(pirateSent);
                        history1.storeTrans(tempV, sentInput);
                        System.out.println(tempV);
                    } else if (answerInputE.equals("N")) {
                        history1.storeTrans(pirateSent, sentInput);
                    }
                    history1.getTranslations();
                    System.out.print("Would you like to translate again (Y/N)? ");
                    String goAgainAns = askInput.nextLine();
                    while (repeatAgain) {
                        if (goAgainAns.equals("Y")) {
                            goAgain = true;
                            repeatQ = false;
                            repeatAgain = false;
                        } else if (goAgainAns.equals("N")) {
                            goAgain = false;
                            repeatQ = false;
                            repeatAgain = false;
                        } else {
                            System.out.print("Would you like to translate again (Y/N)? ");
                            goAgainAns = askInput.nextLine();
                        }
                    }
                }
                if (answerInputP.equals("N")) {
                    System.out.print("Elmer Fudd (Y/N): ");
                    String answerInputE = askInput.nextLine();
                    while (!answerInputE.equals("Y") && (!answerInputE.equals("N"))) {
                        System.out.print("Elmer Fudd (Y/N): ");
                        answerInputE = askInput.nextLine();
                        if (answerInputP.equals("Y") || (answerInputP.equals("N"))) {
                            break;
                        }
                    }
                    if (answerInputE.equals("Y")) {
                        String tempV = translate2.elmerTranslate(sentInput);
                        history1.storeTrans(tempV, sentInput);
                        System.out.println(tempV);
                    }
                    history1.getTranslations();
                    System.out.print("Would you like to translate again (Y/N)? ");
                    String goAgainAns = askInput.nextLine();
                    while (repeatAgain) {
                        if (goAgainAns.equals("Y")) {
                            goAgain = true;
                            repeatQ = false;
                            repeatAgain = false;
                        } else if (goAgainAns.equals("N")) {
                            goAgain = false;
                            repeatQ = false;
                            repeatAgain = false;
                        } else {
                            System.out.print("Would you like to translate again (Y/N)? ");
                            goAgainAns = askInput.nextLine();
                        }
                    }
                }
            }
        }
    }
}




