public class Mobil extends Kendaraan {
 	int kecepatanMaks;
 	int jumlahRoda;

public Mobil(int kecepatanMaksInput, int beratInput, int kapasitasInput, int jumlahRodainput){
	kecepatanMaks = kecepatanMaksInput;
	berat = beratInput;
	kapasitas = kapasitasInput;
	jumlahRoda = jumlahRodainput;
}

public void CetakSpesifikasi(){
 	System.out.println("Kecepatan Maksimal Kendaraan : "+getKecepatanMaks());
 	System.out.println("Kecepatan Maksimal Mobil : "+kecepatanMaks);
 	System.out.println("Berat Mobil : "+berat);
 	System.out.println("Jumlah Roda Mobil : "+jumlahRoda);
 }

 public void Jalankan(int kecepatan){
 System.out.println("Mobil dijalankan dengan kecepatan "+kecepatan);
 }
}