import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double start = 10.0;
        double rate = 2.20;
        double tutar = start;

        System.out.println("Gidilen KMyi girin:");
        double taksimetre = tutar < 20.0 ? 20.0 : (tutar + rate*input.nextDouble());
        System.out.println("Taksimetre:" + taksimetre);
    }
}
