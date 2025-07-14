import java.util.Locale;
import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //SSN
        String SSN = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN is: " + SSN);

        //UC M number
        String UCM = SafeInput.getRegExString(in, "Enter your UC Student M number", "^(M|m)\\d{5}$");
        System.out.println("Your UC Student M number is: " + UCM);

        //Menu O, S, V, Q
        String menu = SafeInput.getRegExString(in, "Open, Save, View or Quit [O,S,V,Q]", "^[OoSsVvQq]$");
        menu = menu.toLowerCase();
        switch(menu){
            case "o":
                System.out.println("Open");
                break;
            case "s":
                System.out.println("Save");
                break;
            case "v":
                System.out.println("View");
                break;
            case "q":
                System.out.println("Quit");
        }

    }
}
