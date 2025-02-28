import java.util.Scanner;
public class Tugas1Bioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Deklarasi
        int tiket, jmlhTiket = 0, harga = 50000, totalHarga, hargaDiskon, totalBayar, pendapatan = 0;
        double diskon = 0;
        String kondisi;
        
        while (true) {
            System.out.print("Masukkan Nama Pelanggan (Ketik 'Batal' Untuk Selesai) : ");
            kondisi = input.nextLine();
            if (kondisi.equalsIgnoreCase("Batal")) {
                break;
            }
            System.out.print("Masukkan Jumlah Tiket Yang Dibeli : ");
            tiket = input.nextInt();
            harga = 50000;
            totalHarga = 0;
            if (tiket > 0) {
                if (tiket > 0 && tiket <= 4) {
                diskon = 0;
                System.out.println("Diskon Yang Didapat Sebesar : 0 " );
                } else if (tiket > 4 && tiket <= 10) {
                diskon = 0.1;
                System.out.println("Diskon Yang Didapat Sebesar : 10% " );
                } else if (tiket > 10) {
                diskon = 0.15;
                System.out.println("Diskon Yang Didapat Sebesar : 15% " );
                } else {
                    System.out.println("Jumlah Tidak Valid");
                }

                totalHarga = tiket * harga;
                hargaDiskon = (int) (totalHarga * diskon);
                totalBayar = totalHarga - hargaDiskon;
                System.out.println("Total Tiket yang dibeli : " + tiket);
                System.out.println("Total Yang Harus Dibayarkan : Rp." + totalBayar);

                jmlhTiket += tiket;
                pendapatan += totalBayar;
            } else {
                System.out.println("Jumlah Tidak Valid");
            }  
            input.nextLine();
        }
            System.out.println("Jumlah Tiket Yang Terjual : " + jmlhTiket);
            System.out.println("Total Pendapatan Hari Ini : Rp." + pendapatan);
        input.close();
    }
}