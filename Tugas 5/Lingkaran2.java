class Lingkaran2 {

	private double phi;
	private double jari;

	Lingkaran2(double phi, double jari){
		this.phi = phi;
		this.jari = jari;
	}	

	public void property_lingkaran(){
		System.out.println("Phi       : "+this.phi);n
		System.out.println("Jari-Jari : "+this.jari);
	}

	public void luas(){
		double luas;
		luas = this.phi * (this.jari * this.jari);
		System.out.println("Luas Lingkaran : "+luas);
	}

	public void keliling(){
		double keliling;
		keliling = 2 * this.phi * this.jari;
		System.out.println("Keliling Lingkaran : "+keliling);
	}
}