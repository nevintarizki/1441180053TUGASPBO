public class Segitiga{
	double alas;
	double tinggi;
	double miring;

	public void cetakKeLayar(){
		System.out.println("Alas= "+alas);
		System.out.println("Tinggi= "+tinggi);
		System.out.println("Sisi Miring= "+miring);
	}

	public void ubahProperty(double alasBaru, double tinggiBaru, double miringBaru){
		alas = alasBaru;
		tinggi = tinggiBaru;
		miring = miringBaru;
	}

	public double hitungLuas(){
		double luas;
		luas = alas * tinggi;
		return luas;
	}

	public double hitungKeliling(){
		double keliling;
		keliling = alas + miring + miring;
		return keliling;
	}
}