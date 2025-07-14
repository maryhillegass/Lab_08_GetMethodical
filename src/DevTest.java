import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String name = SafeInput.getNonZeroLenString(in, "What is your name? ");
        //System.out.println("Your name is " + name);
        //int fav = SafeInput.getInt(in, "What is your favorite number?");
        //System.out.println("Your favorite number is " + fav);
        //double favDouble = SafeInput.getDouble(in, "What is your favorite number?");
        //System.out.println("Your favorite number is " + favDouble);
        //int rangedInt = SafeInput.getRangedInt(in, "Pick a number within range ", 1, 10);
        //System.out.println("You picked " + rangedInt);
        //double rangedDouble = SafeInput.getRangedDouble(in, "Pick a number within range ", 1, 10);
        //System.out.println("You picked " + rangedDouble);
        //boolean coffee = SafeInput.getYNConfirm(in,"Do you like coffee?");
        //System.out.println("I like coffee is " + coffee);
        String SSN = "";
        SSN = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
    }
}
