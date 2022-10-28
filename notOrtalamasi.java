import java.util.Scanner;

public class notOrtalamasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
		System.out.println("Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik notlarınızı giriniz:");
		
		int[] notlar = new int[6];
		double sum = 0;
		
		for (int i = 0; i < 6; i++) {
			notlar[i] = input.nextInt();
			sum += (double) notlar[i];
		}
		sum /= 6;
		
		String output = sum > 60.0 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
		System.out.println(output);
		
	}
}