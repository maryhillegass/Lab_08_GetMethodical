import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        double itemPrice = 0;
        double total = 0;
        do{
            itemPrice = SafeInput.getRangedDouble(in,"Enter your item price ", 0.50, 10.00);
            total = total + itemPrice;
            done = !SafeInput.getYNConfirm(in, "Do you have more items?");
        }while (!done);
        System.out.printf("Your total price is $%.2f%n", total);
    }
}
