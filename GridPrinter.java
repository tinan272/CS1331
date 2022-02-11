import java.util.Scanner;

public class GridPrinter {
    public static void main(String[] args) {
        Scanner userInput;
        userInput = new Scanner(System.in);
        int row;
        int column;
        String reply;

        int x;
        int y;
        int z=0;

        while (z<1) {
        System.out.print("Enter number of rows: ");
        row = userInput.nextInt();
        System.out.print("Enter number of columns: ");
        column = userInput.nextInt();

        boolean xSwitch = false;
        for (x=1; x <= row; x++) {
            if (x % 2 != 0) {
                xSwitch = true;
            }
            else  {
                xSwitch = false;
            }
            for (y=1;y<=column; y++) {
                    if (xSwitch) {
                        System.out.print("X");
                    } else {
                        System.out.print("O");
                    }
                    xSwitch = !xSwitch;
            }
            System.out.println("");
        }

        System.out.println("Do you want to continue? (Y/N)");
        userInput = new Scanner(System.in);
        reply = userInput.nextLine();
        if (reply.equals("N")) {
            z=z+4;
        }
        else {
        z=z-1;
        while reply!="No"
        System.out.println("Do you want to continue? (Y/N)");
        userInput = new Scanner(System.in);
        reply = userInput.nextLine();
        }

        }
        
    }
}




import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing Game!");
        Random rand = new Random(); //initializing the random method
        boolean playAgain = true; //decides on which sequence to use
        int geostart;
        int geofactor;
        int squareroot;
        int tracker=0;
        int exbase;
        int randomSequence = rand.nextInt(3);
        int keepPlaying;
        System.out.println(randomSequence);
        Scanner userInput = new Scanner(System.in);
        int answer;
        String play;
        
        while (playAgain = true) {
        randomSequence =  rand.nextInt(3);
        if (randomSequence ==0) { // geometric sequence
            System.out.println("Here is your sequence:"); 
            geostart = rand.nextInt(4) +1;
            geofactor = rand.nextInt(11) - 5;
            while (tracker < 3) { 
            tracker += 1;
            System.out.println(geostart*geofactor);
            geostart = geostart *geofactor;
            }
            geostart = geostart*geofactor;
            System.out.print("What is the next number? ");
            answer = userInput.nextInt();
            if (answer != geostart) {
                System.out.println("Incorrect! The next number was " + geostart);
                System.out.println("Want to play again?");
                tracker = 0;
                userInput = new Scanner(System.in);
                play = userInput.nextLine();
                if (play.equals("Y")) {
                    continue;
                }
                else if (play.equals("N")) {
                    playAgain = false;
                    break;
                }
            }
            else if (answer == geostart) {
                System.out.println("Correct!");
                System.out.println("Want to play again?");
                tracker = 0;
                userInput = new Scanner(System.in);
                play = userInput.nextLine();
                if (play.equals("Y")) {
                    continue;
                }
                else if (play.equals("N")) {
                    playAgain = false;
                    break;
                }
            }
            
        }
        else if (randomSequence==1) {
            System.out.println("Here is your sequence:"); 
            squareroot = rand.nextInt(101) +100;
            while (tracker <3) {
            tracker += 1;
            double squarenum = Math.sqrt(squareroot);
            System.out.println((int) squarenum);
            squareroot = (int) squarenum;
            }
            double squarenum = Math.sqrt(squareroot);
            System.out.print("What is the next number? ");
            answer = userInput.nextInt();
            if (answer != (int) squarenum) {
                System.out.println("Incorrect! The next number was " + (int) squarenum);
                System.out.println("Want to play again?");
                tracker = 0;
                userInput = new Scanner(System.in);
                play = userInput.nextLine();
                if (play.equals("Y")) {
                    continue;
                }
                else if (play.equals("N")) {
                    playAgain = false;
                    break;
                }
                
            }
            else if (answer == (int) squarenum) {
                System.out.println("Correct!");
                System.out.println("Want to play again?");
                tracker = 0;
                userInput = new Scanner(System.in);
                play = userInput.nextLine();
                if (play.equals("Y")) {
                    continue;
                }
                else if (play.equals("N")) {
                    playAgain = false;
                    break;
                }

        }

        else if (randomSequence ==2) {
            exbase = rand.nextInt(10) + 1;
            System.out.println("Here is your sequence:"); 
            System.out.println((int)Math.pow(exbase, 0)); 
            System.out.println((int)Math.pow(exbase, 1)); 
            System.out.println((int)Math.pow(exbase, 2)); 
            double finalnum = Math.pow(exbase, 3);
            System.out.print("What is the next number? ");
            answer = userInput.nextInt();
            if (answer != (int) finalnum) {
                System.out.println("Incorrect! The next number was " + (int) finalnum);
                System.out.println("Want to play again?");
                tracker = 0;
                userInput = new Scanner(System.in);
                play = userInput.nextLine();
                if (play.equals("Y")) {
                    continue;
                }
                else if (play.equals("N")) {
                    playAgain = false;
                    break;
                }
            }
            else if (answer == (int) finalnum) {
                System.out.println("Correct!");
                System.out.print("Want to play again? (Y/N): ");
                tracker = 0;
                userInput = new Scanner(System.in);
                play = userInput.nextLine();
                
                if (play.equals("Y")) {
                    continue;
                }           
                else if (play.equals("N")) {
                    playAgain = !playAgain;
                    break;
                }
            }
        }
    }

    }
}
}