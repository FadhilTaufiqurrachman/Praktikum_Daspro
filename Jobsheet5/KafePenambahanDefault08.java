import java.util.Scanner;

public class KafePenambahanDefault08 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Deklarasi
    boolean keanggotaan, validasi = true;
    String menu;
    char ukuranCup;
    int jumlah;
    double diskon, totalHarga, nominalBayar; 

    System.out.print("Masukkan Menu : ");
    menu = input.nextLine();
    System.out.print("Masukkan Ukuran Cup : ");
    ukuranCup = input.next().charAt(0);
    System.out.print("Masukkan Jumlah : ");
    jumlah = input.nextInt();
    System.out.print("Masukkan Keanggotaan (true/false) : ");
    keanggotaan = input.nextBoolean();

    double hargaMenu = 0;

    switch (menu.toLowerCase()) {
        case "kopi":
            hargaMenu = 12000;
            break;
        case "teh":
            hargaMenu = 7000;
            break;
        case "coklat":
            hargaMenu = 20000;
            break;
        default:
            validasi = false;
    }

    totalHarga = hargaMenu * jumlah;

    switch (ukuranCup) {
        case 'S':
            break;
        case 'M':
            totalHarga += 0.25 * totalHarga;
            break;
        case 'L':
            totalHarga += 0.4 * totalHarga;
            break;
        default:
            validasi = false;
    }
    
    diskon = keanggotaan? 0.1 : 0;
    nominalBayar = totalHarga - (diskon * totalHarga);

    if (validasi) {
        System.out.println("Item Pembelian : " + jumlah + " " + menu + " Dengan Ukuran Cup " + ukuranCup);
        System.out.println("Nominal Bayar : " + nominalBayar);
    } else {
        System.out.println("Invalid Menu Atau Ukuran Tidak Tersedia");
    }

    input.close();
    }
}
