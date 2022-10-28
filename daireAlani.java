import java.util.Scanner;

public class daireAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını girin:");
        double r = input.nextDouble();

        double alan = Math.PI * r * r;
        double cevre = 2 * Math.PI * r;

        System.out.println("Alanı:" + alan);
        System.out.println("Çevresi:" + cevre);


        Scanner input2 = new Scanner(System.in);

        System.out.println("Daire diliminin Yarıçapı ile Merkez açısını giriniz:");
        r = input2.nextDouble();
        double alpha = input2.nextDouble();

        double dilim = Math.PI * r * r * alpha / 360;
        System.out.println("Daire diliminin alanı:" + dilim);
    }
}
