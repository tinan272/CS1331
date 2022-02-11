import java.util.Scanner;
public class Leetspeak {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String text;
        System.out.println("EnterLeet text: ");
        text = userInput.nextLine();
        text = text.toLowerCase();
        text = text.replace("a","@");
        text = text.replace("i","1");
        text = text.replace("e","3");
        text = text.replace("o","0");
        text = text.replace("s","$");
        text = text.replace("t","7");
        System.out.println("Translation" + text.toLowerCase());        
    }
}