import java.util.Scanner;
public class Pemilihan2Percobaan208 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        //Deklarasi
        int pilihan_menu;
        String member;
        double total_bayar, diskon, harga;

        System.out.println("-----------------------------------------");
        System.out.println("============= Menu Kafe JTI =============");
        System.out.println("-----------------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling ( Ricebowl + Ice Tea )");
        System.out.println("-----------------------------------------");
        
        System.out.print("Masukkan Angka Dari Menu Yang Dipilih : ");
        pilihan_menu = input08.nextInt();
        input08.nextLine();
        System.out.print("Apakah Punya Member (t/n) ? = ");
        member = input08.nextLine();
        System.out.println("-----------------------------------------");

        if (member.equalsIgnoreCase("t")) {
            diskon = 0.10;
            System.out.println("Besar Diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
            } else {
                System.out.println("Masukkan Pilihan Menu Dengan Benar");
                return;
            } 

        total_bayar = harga - (harga * diskon);
        System.out.println("Total Bayar Setelah Diskon = " + total_bayar);
        
        } else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
            } else {
                System.out.println("Masukkan Pilihan Menu Dengan Benar");
                return;
            }
            
            System.out.println("Total Bayar = " + harga);
        } else {
            System.out.println("Member Tidak Valid");
            return;
        }
        System.out.println("-----------------------------------------");
        
        input08.close();
    }
}