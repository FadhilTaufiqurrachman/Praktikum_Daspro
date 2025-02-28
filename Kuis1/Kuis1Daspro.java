import java.util.Scanner;

public class Kuis1Daspro {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     //Deklarasi
     short jmlBeras, jmlKkDlmDesa;
     int jmlDesa; 
     float brsDesa, brsKeluarga;

     System.err.print("Masukkan Total Bantuan Beras Dari Pemerintah Dengan Satuan Kuintal: ");
     jmlBeras = input.nextShort();
     System.err.print("Masukkan Jumlah Desa Di Kabupaten Malang : ");
     jmlDesa = input.nextInt();
     System.err.print("Masukkan Jumlah KK Dalam Desa Anda : ");
     jmlKkDlmDesa = input.nextShort();

     brsDesa = jmlBeras / jmlDesa;
     brsKeluarga = brsDesa / jmlKkDlmDesa;

     System.err.println("Beras Yang Di Bagikan Pada Setiap Desa Di Kabupaten Malang Adalah " + brsDesa +" Kuintal");
     System.err.println("Beras Yang Di Bagikan Pada Setiap KK Di Desa Anda Adalah " +brsKeluarga +" Kuintal");

     input.close();
 }   
}
