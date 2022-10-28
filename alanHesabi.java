import java.lang.FdLibm.Pow;
import java.util.Scanner;

public class alanHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Dik kenarların uzunluğunu giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenüs:" + c);



        double[] kenar = new double[3];
        double u = 0;

        for(int i = 0; i < 3; i++) {
            kenar[i] = input2.nextDouble();
            u += kenar[i];
        }
        u /= 2;

        double alan = u * (u-kenar[0]) * (u-kenar[1]) * (u-kenar[2]);

        System.out.println("Üçgenin alanı:" + alan);
    }
}
