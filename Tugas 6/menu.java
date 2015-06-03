import java.util.Scanner;  
  
public class menu  
  
{  
  
    public static void main(String args[])  
  
    {  
        int angka1;
        int angka2;
        int input;
        for (int f=1; f<1000;f++){
  
                System.out.println("======= Menu =======");  
  
                System.out.println("1. Penjumlahan (+)");  
  
                System.out.println("2. Pengurangan (-)");  
  
                System.out.println("3. Perkalian (*)");  
  
                System.out.println("4. Pembagian (/)");  
  
                System.out.println("5. Exit"); 


            
                System.out.println("Masukkan Angka Pertama :");
                Scanner a1 = new Scanner(System.in);
                angka1 = a1.nextInt();

                System.out.println("Masukkan Angka Kedua :");
                Scanner a2 = new Scanner(System.in);
                angka2 = a2.nextInt();
               
                System.out.print("Masukkan Pilihan : ");  
                Scanner in = new Scanner(System.in);
                input = in.nextInt();

   
  
                System.out.println(" "); 
                System.out.println(" ");  
                System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*");
                System.out.println(" "); 
                System.out.println(" ");  
                
        
  
                switch(input)  
  
                {   
  
                    case 1 : 
                    System.out.println("Penjumlahan");
                    System.out.println(" ");
                    System.out.print("Hasil penjumlahan dari :"+angka1+"+"+angka2+"=");
                    System.out.println(" ");
                    System.out.println(angka1+angka2);
  
                    break;  
  
                    case 2 : 
                    System.out.println("Pengurangan");
                    System.out.println(" ");
                    System.out.print("Hasil pengurangan dari :"+angka1+"-"+angka2+"=");
                    System.out.println(" ");
                    System.out.println(angka1-angka2);
                    break;  
  
                    case 3 : 
                    System.out.println("Perkalian");
                    System.out.println(" ");
                    System.out.print("Hasil perkalian dari :"+angka1+"*"+angka2+"=");
                    System.out.println(" ");
                    System.out.println(angka1*angka2);
  
                    break;  
  
                    case 4 : 
                    System.out.println("Pembagian");
                    System.out.println(" ");
                    System.out.print("Hasil pembagian dari :"+angka1+"/"+angka2+"=");
                    System.out.println(" ");
                    System.out.println(angka1/angka2);;  
  
                    break;  
  
                    case 5 : 
                    System.out.println(":D Terima Kasih :D");  
  
                    System.exit(0);  
  
                    break;  
  
                    default: System.out.println("Maaf pilihan tidak ada, silahkan coba lagi");  
  
                    break;  
  
                }  
                
                System.out.println(" "); 
                System.out.println(" ");  
                System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*"); 
                System.out.println(" "); 
                System.out.println(" ");  

                  }
              }
  
    }  
  