public class testLaptop {
	public static void main(String[] args) {
		Laptop laptop1 = new Laptop();
		Laptop laptop2 = new Laptop("Acer","Hitam");
		Laptop laptop3 =new Laptop("Axioo","Putih","TidakTersambung");
		Laptop laptop4 = new Laptop("Vaioo","Biru","TidakTersambung",60);

		System.out.println("Merk: "+laptop1.getMerk+" Warna: "+laptop1.getWarna+laptop1.indikatorWifi+laptop1.indikatorBaterai+"");

	}
}