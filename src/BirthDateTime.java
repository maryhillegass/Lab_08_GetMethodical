import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        int day = 0;
        switch (month){
            case 1,3,5,7,8,10,12:
                day = SafeInput.getRangedInt(in, "Enter your brith day", 1, 31);
                break;
            case 2:
                if(year%4 == 0)
                    day = SafeInput.getRangedInt(in, "Enter your brith day", 1, 29);
                else
                    day = SafeInput.getRangedInt(in, "Enter your brith day", 1, 28);
                break;
            case 4,6,9,11:
                day = SafeInput.getRangedInt(in, "Enter your brith day", 1, 30);
                break;
        }
        int hour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter your birth minute", 0, 59);
        if(minute < 10)
            System.out.println("Your birth date and time is: " + month + " " + day + " " + hour + ":0" + minute + " " + year);
        else
            System.out.println("Your birth date and time is: " + month + " " + day + " " + hour + ":" + minute + " " + year);
    }
}
