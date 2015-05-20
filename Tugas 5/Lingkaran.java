public class Lingkaran{
	double jari;
	double phi;

	public void cetakKeLayar(){
		System.out.println("Jari-jari = "+jari);
		System.out.println("Phi = "+phi);
	}

	public void ubahProperty(double jariBaru){
		jari = jariBaru;
	}

	public double hitungLuas(){
		double luas;
		luas = jari*jari*phi;
		return luas;
	}

	public double hitungKeliling(){
		double keliling;
		keliling = 2*phi*jari;
		return keliling;
	}
}