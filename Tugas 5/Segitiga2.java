class  Segitiga2 {
	
	private double alas;
	private double tinggi;
	private double miring;

	Segitiga2(double alas, double tinggi, double miring){
		this.alas 	= alas;
		this.tinggi = tinggi;
		this.miring = miring;
	}

	public void property_segitiga(){
		System.out.println("Alas 	: "+this.alas);
		System.out.println("Tinggi 	: "+this.tinggi);
		System.out.println("Miring 	: "+this.miring);
	}

	public void luas(){
		double luas;
		luas = this.alas * this.tinggi;
		System.out.println("Luas Segitiga : "+luas);
	}

	public void keliling(){
		double keliling;
		keliling = this.alas + this.tinggi + this.miring;
		System.out.println("Keliling Segitiga : "+keliling);
	}
}