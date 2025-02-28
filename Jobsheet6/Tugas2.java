import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        //Deklarasi
        String buku;
        double diskon;
        int jumlah;

        System.out.print("Masukkan Jenis Buku : ");
        buku = input08.nextLine();
        System.out.print("Masukkan Jumlah Buku Yang Dibeli : ");
        jumlah = input08.nextInt();

        if ( buku.equalsIgnoreCase("Kamus") ) {
            if ( jumlah > 2 ) {
                diskon = 0.12;
            } else {
                diskon = 0.10;
            }
        } else if ( buku.equalsIgnoreCase("Novel")  ||  jumlah > 3) {
            if ( buku.equalsIgnoreCase("Novel") ) {
                if ( jumlah <= 3 ) {
                diskon = 0.08;
                } else {
                diskon = 0.09;
                }
            } else {
                diskon = 0.05;
            }
        } else diskon = 0;
        
        System.out.println("Jumlah Diskon Yang Anda Dapatkan Sebesar : " + diskon);

        input08.close();
    }
}
