class Laptop{

	private String merk;
	private String warna;
	private String wifi;
	private int	baterai;

	public void setMerk(String merkInput){
		merk = merkInput;
	}
	public void setWarna(String warnaInput){
		warna = warnaInput;
	}
	public void setBaterai(int bateraiInput){
		baterai = bateraiInput;
	}
	public void setWifi(String wifiInput){
		wifi = wifiInput;
	}


	public Laptop()
	{
		
		merk 	="Toshiba";
		warna 	="Pink";
		wifi 	="Tersambung";
		baterai =50;
		
	}

	public Laptop(String merkInput, String warnaInput)
	{
		
		merk 	= merkInput;
		warna 	= warnaInput;
	}

	public Laptop(String merkInput, String warnaInput, String wifiInput) 
	{
		
		merk 	= merkInput;
		warna 	= warnaInput;
		wifi 	= wifiInput;
	}

	public Laptop(String merkInput, String warnaInput, String wifiInput, int bateraiInput)
	{
		
		merk 	= merkInput;
		warna 	= warnaInput;
		wifi 	= wifiInput;
		baterai = bateraiInput;
		
	}


	public void menyala()
	
	{
		System.out.println("Welcome To Laptop");
			
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
		System.out.println("Wifi: "+wifi);

		}	


	public String getMerk(){

		return merk;
	}

	public String getWarna(){

		return warna;
	}
	
	public int getBaterai(){

		return baterai;
	}
	
	public String getWifi(){

		return wifi;
	}


}