import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        /*
         * Array'deki indekslendirme:
         * Armut: 0
         * Elma: 1
         * Domates: 2
         * Muz: 3
         * Patlıcan: 4
         */

        double[] fiyat = {2.14, 3.67, 1.11, 0.95, 5.00};
        double[] tutar = new double[5];
        System.out.print("Armut kaç kilo?");
        tutar[0] = input.nextDouble();
        System.out.print("Elma kaç kilo?");
        tutar[1] = input.nextDouble();
        System.out.print("Domates kaç kilo?");
        tutar[2] = input.nextDouble();
        System.out.print("Muz kaç kilo?");
        tutar[3] = input.nextDouble();
        System.out.print("Patlıcan kaç kilo?");
        tutar[4] = input.nextDouble();

        double toplam = 0;
        for (int i = 0; i < 5; i++) {
            toplam += fiyat[i] * tutar[i];
        }
        System.out.println("Toplam Tutar:" + toplam);

    }
}
