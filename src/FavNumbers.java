import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int fav = SafeInput.getInt(in, "What is your favorite integer?");
        System.out.println("Your favorite integer is " + fav);

        double favDouble = SafeInput.getDouble(in, "What is your favorite double?");
        System.out.println("Your favorite double is " + favDouble);

    }
}
