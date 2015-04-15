public class testLaptop {
	public static void main(String[] args) {
		Laptop laptop1 = new Laptop();
		Laptop laptop2 = new Laptop("Acer","Hitam");
		Laptop laptop3 = new Laptop("Axioo","Putih","TidakTersambung");
		Laptop laptop4 = new Laptop("Vaioo","Biru","TidakTersambung",60);

		System.out.println("Merk: "+ laptop1.getMerk()      + "Warna: " + laptop1.getWarna() + "Wifi: " + laptop1.getWifi() + "Baterai: " + laptop1.getBaterai());
		System.out.println("Merk: "+ laptop2.getMerk() + "Warna: " + laptop2.getWarna() + "Wifi: " + laptop2.getWifi() + "Baterai: " + laptop2.getBaterai());
		System.out.println("Merk: "+ laptop3.getMerk() + "Warna: " + laptop3.getWarna() + "Wifi: " + laptop3.getWifi() + "Baterai: " + laptop3.getBaterai());
		System.out.println("Merk: "+ laptop4.getMerk() + "Warna: " + laptop4.getWarna() + "Wifi: " + laptop4.getWifi() + "Baterai: " + laptop4.getBaterai());

	}
}
