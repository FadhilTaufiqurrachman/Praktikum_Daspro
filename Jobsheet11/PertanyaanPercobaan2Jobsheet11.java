public class PertanyaanPercobaan2Jobsheet11 {

    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda Adalah Member, Dapatkan Diskon 10% Untuk Setiap Pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat, Anda Mendapatkan Diskon 50% Untuk Setiap Pembelian!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Selamat, Anda Mendapatkan Diskon 30% Untuk Setiap Pembelian!");
        } else {
            System.out.println("Kode Promo Tidak Valid!");
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
    public static void main(String[] args) {
        menu("Andi",true, "DISKON50");    
    } 
}