public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.printf(" Celsius   Farenheit%n");
        for (int i = -100; i <= 100 ; i++) {
            double celsius = i;
            double farenheit = CtoF(celsius);
            System.out.printf("%8.1f %8.1f%n",celsius,farenheit);
        }

    }

    public static double CtoF(double Celsius){
        double farenheit = 0;
        farenheit = (Celsius * (9.0/5.0) + 32.0);
        return farenheit;
    }
}
