import java.util.Scanner;

public class KDVhesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount, kdv, newAmount;

        System.out.println("Tutarı giriniz:");
        if((amount = input.nextInt()) < 1000 ) {
            kdv = 0.18;
            newAmount = amount * (1 + kdv);
        }
        else {
            kdv = 0.08;
            newAmount = amount * (1 + kdv);
        }

        System.out.println("Tutar:" + amount);
        System.out.println("KDV:" + kdv);
        System.out.println("KDVli fiyat:" + newAmount);
    }
}
