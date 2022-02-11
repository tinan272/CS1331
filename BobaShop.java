import java.util.Scanner; 
public class BobaShop {
    public static void main(String[] args) {
        Scanner userInput;
        int text; //the text the user inputs will be a string
        String bobaShop;
        userInput = new Scanner(System.in); //create scanner object called userInput where user will input their stuff
        System.out.print("What is your desired zipcode? "); // ask what their zipcode is
        text = userInput.nextInt(); //the text the userinputs will be in the next line
        
        switch (text)
        {   case 30309:
                bobaShop = "Sweet Hut";
                System.out.println("There is a bubble tea shop called " + bobaShop + " here!");
                System.out.print("Enter your budget: ");

                int budget = userInput.nextInt();
                if (budget <= 10 && budget >= 1) {
                    System.out.println("You can purchase 2 drinks.");
                }
                else if (budget <= 20 && budget >= 11) {
                    System.out.println("You can purchase 4 drinks.");
                }
                else if (budget <= 40 && budget >=21) {
                    System.out.println("You can purchase 8 drinks.");
                }
                else if (budget > 40) {
                    System.out.println("You can purchase 20 drinks.");
                }
                else {
                    System.out.println("Invalid.");
                }
                break;

            case 30308:
            bobaShop = "Tea Corner";
            System.out.println("There is a bubble tea shop called " + bobaShop + " here!");
            System.out.print("Enter your budget: ");
            budget = userInput.nextInt();

                if (budget <= 10 && budget >=1) {
                    System.out.println("You can purchase 2 drinks.");
                }
                else if (budget <= 20 && budget >=11) {
                    System.out.println("You can purchase 4 drinks.");
                }
                else if (budget <= 40 && budget >=21) {
                    System.out.println("You can purchase 8 drinks.");
                }
                else if (budget > 40) {
                    System.out.println("You can purchase 20 drinks.");
                }
                else {
                    System.out.println("Invalid.");
                }
            break;

            case 30306:
            bobaShop = "Honey Bubble";
            System.out.println("There is a bubble tea shop called " + bobaShop + " here!");
            System.out.print("Enter your budget: ");
            budget = userInput.nextInt();
            if (budget <= 10 && budget >=1) {
                System.out.println("You can purchase 2 drinks.");
            }
            else if (budget <= 20 && budget >=11) {
                System.out.println("You can purchase 4 drinks.");
            }
            else if (budget <= 40 && budget >=21) {
                System.out.println("You can purchase 8 drinks.");
            }
            else if (budget > 40) {
                System.out.println("You can purchase 20 drinks.");
            }
            else {
                System.out.println("Invalid.");
            }
            break;

            case 30360:
            bobaShop = "Tea Corner";
            System.out.println("There is a bubble tea shop called " + bobaShop + " here!");
            System.out.print("Enter your budget: ");
            budget = userInput.nextInt();
            if (budget <= 10 && budget >=1) {
                System.out.println("You can purchase 2 drinks.");
            }
            else if (budget <= 20 && budget >=11) {
                System.out.println("You can purchase 4 drinks.");
            }
            else if (budget <= 40 && budget >=21) {
                System.out.println("You can purchase 8 drinks.");
            }
            else if (budget > 40) {
                System.out.println("You can purchase 20 drinks.");
            }
            else {
                System.out.println("Invalid.");
            }
            break;

            default:
            System.out.println("Sorry, no shops found.");
            break;
        }

    }
}

