import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = SafeInput.getNonZeroLenString(in, "What is your name? ");
        System.out.println("Your name is " + name);
    }
}
