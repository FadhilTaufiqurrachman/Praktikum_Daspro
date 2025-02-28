import java.util.Scanner;
public class PertanyaanPercobaan3Jobsheet11 {
public static void  menu(String namaPelanggan, boolean isMember) {
    System.out.println("Selamat Datang, " + namaPelanggan + "!");

    if (isMember) {
        System.out.println("Anda Adalah Member, Dapatkan Diskon 10% Untuk Setiap Pembelian!");
    }

    System.out.println("===== MENU RESTO KAFE =====");
    System.out.println("1. Kopi Hitam - Rp 15,000");
    System.out.println("2. Cappuccino - Rp 20,000");
    System.out.println("3. Latte - Rp 22,000");
    System.out.println("4. Teh Tarik - Rp 12,000");
    System.out.println("5. Roti Bakar - Rp 10,000");
    System.out.println("6. Mie Goreng - Rp 18,000");
    System.out.println("===========================");
    System.out.println("Silahkan Pilih Menu Yang Anda Inginkan");
    }

    public static int HitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda Mendapatkan Diskon 50%!");
            int hargaTotal = (hargaItems[pilihanMenu-1] * banyakItem) * 50 / 100;
            return (int) hargaTotal;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda Mendapatkan Diskon 30%!");
            int hargaTotal = (hargaItems[pilihanMenu-1] * banyakItem) * 30 / 100;
            return (int) hargaTotal;
        } else {
            System.out.println("Kode Promo Tidak Valid!");
            int hargaTotal = hargaItems[pilihanMenu-1] * banyakItem;
            return hargaTotal;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Nama Pelanggan : ");
        String namaPelanggan = sc.nextLine();
        System.out.print("Apakah Anda Member? (true/false) : ");
        boolean isMember = sc.nextBoolean();
        menu(namaPelanggan, isMember);
        int pilihan, totalItem = 0, seluruhHarga = 0;
        
        while (true) {
        System.out.print("1. Memesan, 2. Keluar (Masukkan Nomor Pilihan) : ");
        pilihan = sc.nextInt();
        switch (pilihan) {
            case 1 :
            System.out.print("Masukkan Nomor Menu Yang Ingin Anda Pesan : ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan Jumlah Item Yang Ingin Dipesan : ");
            int banyakItem = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan Kode Promo : ");
            String kodePromo = sc.nextLine();
            
            int totalHarga = HitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalItem += banyakItem;
            seluruhHarga += totalHarga;
    
            System.out.println("Total Harga Untuk Pesanan Anda : Rp" + totalHarga);
            System.out.println();
            continue;
            case 2 :
                System.out.println("Total Item Yang Dipesan : " + totalItem);
                System.out.println("Total Harga Yang Harus Dibayar : Rp." + seluruhHarga);
                System.out.println("Terima Kasih, Semua Transaksi Selesai");
                break;
            default:
                System.out.println("Pilihan Tidak Tersedia");
                continue;
            }
            if (pilihan == 2) {
                break;
            }
        }
    }
}