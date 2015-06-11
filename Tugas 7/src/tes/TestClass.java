package tes;

/**
 * Created by Nevinta on 11/06/2015.
 */
public class TestClass {
    public static void main(String[] args) {
        Penulis Nevinta = new Penulis("Nevinta","Jalan mana aja",'P',"Single",28);
        Penulis Dyah = new Penulis("Dyah","Jalan ikan bandeng",'P',"Single",30);

        Buku novelMitos = new Buku("novelMitos",45000.0,"Airjangga",Nevinta);
        System.out.println(novelMitos.toString());
    }
}
