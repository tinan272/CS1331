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
        int keepPlaying = 0;
        Scanner userInput = new Scanner(System.in);
        int answer;
        String play;
        
        while (playAgain) {
            System.out.println(playAgain);
            randomSequence =  rand.nextInt(3);
            keepPlaying = 0;
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
                    while (keepPlaying ==0) {
                        System.out.print("Want to play again? (Y/N): ");
                        tracker = 0;
                        userInput = new Scanner(System.in);
                        play = userInput.nextLine();
                        play = play.toUpperCase();
                        if (play.equals("Y")) {
                            keepPlaying +=1;
                            continue;
                        }           
                        else if (play.equals("N")) {
                            playAgain = false;
                            keepPlaying = keepPlaying + 1;

                        }
                    }
                }
    
                else if (answer == geostart) {
                    System.out.println("Correct!");
                    while (keepPlaying ==0) {
                        System.out.print("Want to play again? (Y/N): ");
                        tracker = 0;
                        userInput = new Scanner(System.in);
                        play = userInput.nextLine();
                        play = play.toUpperCase();
                        if (play.equals("Y")) {
                            keepPlaying +=1;
                            continue;
                        }           
                        else if (play.equals("N")) {
                            playAgain = false;
                            keepPlaying +=1;
                        }
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
                while (keepPlaying ==0) {
                    System.out.print("Want to play again? (Y/N): ");
                    tracker = 0;
                    userInput = new Scanner(System.in);
                    play = userInput.nextLine();
                    play = play.toUpperCase();
                    if (play.equals("Y")) {
                        keepPlaying +=1;
                        continue;
                    }           
                    else if (play.equals("N")) {
                        playAgain = false;
                        keepPlaying +=1;
                        break;
                    }
                }
                
            }
            else if (answer == (int) squarenum) {
                System.out.println("Correct!");
                while (keepPlaying ==0) {
                    System.out.print("Want to play again? (Y/N): ");
                    tracker = 0;
                    userInput = new Scanner(System.in);
                    play = userInput.nextLine();
                    play = play.toUpperCase();
                    if (play.equals("Y")) {
                        keepPlaying +=1;
                        continue;
                    }           
                    else if (play.equals("N")) {
                        playAgain = false;
                        keepPlaying +=1;

                    }
                }
            }
        }

        else if (randomSequence ==2) {
            keepPlaying = 0;
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
                tracker = 0;
                while (keepPlaying ==0) {
                    System.out.print("Want to play again? (Y/N): ");
                    tracker = 0;
                    userInput = new Scanner(System.in);
                    play = userInput.nextLine();
                    play = play.toUpperCase();
                    if (play.equals("Y")) {
                        keepPlaying +=1;
                        continue;
                    }           
                    else if (play.equals("N")) {
                        playAgain = false;
                        keepPlaying +=1;
                        
                    }
                }
            }


            else if (answer == (int) finalnum) {
                keepPlaying = 0;
                System.out.println("Correct!");
                while (keepPlaying ==0) {
                System.out.print("Want to play again? (Y/N): ");
                tracker = 0;
                userInput = new Scanner(System.in);
                play = userInput.nextLine();
                play = play.toUpperCase();
                if (play.equals("Y")) {
                    keepPlaying +=1;
                    continue;
                }           
                else if (play.equals("N")) {
                    playAgain = false;
                    keepPlaying +=1;
                    
                }
            }
        }
}

        }
    }
}