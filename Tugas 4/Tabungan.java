class Tabungan{

	private double simpanan;
	private String pemilik;
	private String rekening;

	public void setSimpanan(double simpananInput){
		simpanan = simpananInput;
	}
	public void setPemilik(String pemilikInput){
		pemilik = pemilikInput;
	}
	public void setRekening(String rekeningInput){
		rekening = rekeningInput;
	}
	
	

	public Tabungan()
	{
		
		simpanan 	="Toshiba";
		pemilik 	="Pink";
		rekening 	="Tersambung";
		baterai =50;
		
	}

	public Tabungan(String merkInput, String warnaInput)
	{
		
		simpanan 	= merkInput;
		pemilik 	= warnaInput;
	}

	public Tabungan(String merkInput, String warnaInput, String wifiInput) 
	{
		
		simpanan 	= merkInput;
		pemilik 	= warnaInput;
		rekening 	= wifiInput;
	}

	public Tabungan(String merkInput, String warnaInput, String wifiInput, int bateraiInput)
	{
		
		simpanan 	= merkInput;
		pemilik 	= warnaInput;
		rekening 	= wifiInput;
		baterai = bateraiInput;
		
	}


	public void menyala()
	
	{
		System.out.println("Welcome To Tabungan");
			
	}	

	public void mati()
	
	{
		System.out.println("Thank You Have a Nice Day");
			
		}	

	public void indikatorBaterai()
	
	{
		System.out.println("Baterai: "+baterai +"%");
			
		}	

	public void indikatorWifi()
	
	{
		System.out.println("rekening: "+rekening);

		}	


	public String getMerk(){

		return simpanan;
	}

	public String getWarna(){

		return pemilik;
	}
	
	public int getBaterai(){

		return baterai;
	}
	
	public String getWifi(){

		return rekening;
	}


}