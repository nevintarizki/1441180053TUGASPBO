import java.util.Scanner;

public class HitungTB{
	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);

		//masukkan tinggi badan
		System.out.print("masukkan tinggi badan dalam cm");
		double tinggi = masukan.nextDouble();

		if (tinggi < 100)
			System.out.print("tidak memenuhi syarat");

		else {
			System.out.print("memenuhi syarat");
			
		}
	}
	
}