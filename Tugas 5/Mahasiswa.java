public class Mahasiswa{
	private String nama;
	private int umur;

	public void setNama(String namaInput){
		nama = namaInput;
	}
	public void setUmur(int umurInput){
		umur = umurInput;
	}

	public Mahasiswa(String namaInput, int umurInput){
		nama = namaInput;
		umur = umurInput;
	}

	public String getNama(){
		return nama;
	}
	public int getUmur(){
		return umur;
	}

	public void tampilkanBiodata(){
		System.out.println("BIODATA");
		System.out.println("Nama: "+getNama());
		System.out.println("Umur: "+getUmur());
	}
}