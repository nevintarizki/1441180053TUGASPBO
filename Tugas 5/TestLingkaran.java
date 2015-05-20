public class TestLingkaran{
	
	public static void main(String[] args) {
		Lingkaran bangun = new Lingkaran();

		bangun.jari = 7;
		bangun.phi = 3.14;

		bangun.cetakKeLayar();

		System.out.println("Keliling= "+bangun.hitungKeliling());
		System.out.println("Luas= "+bangun.hitungLuas());

		bangun.ubahProperty(21);

		System.out.println("Property baru:");
		bangun.cetakKeLayar();

		System.out.println("Keliling Baru= "+bangun.hitungKeliling());
		System.out.println("Luas Baru= "+bangun.hitungLuas());	
	}
}