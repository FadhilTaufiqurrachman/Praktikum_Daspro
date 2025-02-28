import java.util.Scanner;

public class KonversiSoal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jam, waktu, menit, sisaDetik, detik;
        System.out.println("==================== Program Konversi Waktu ====================");
        System.out.print("Masukkan Waktu (Dalam Detik) : ");
        waktu = input.nextInt();
        
        jam = waktu / 3600;
        sisaDetik = waktu % 3600;
        menit = sisaDetik / 60;
        detik = sisaDetik % 60;

        System.out.printf("Konversi Waktu %s Detik Adalah %s Jam : %s Menit : %s Detik\n", waktu, jam, menit, detik);
        System.out.println("================================================================");
        input.close();
    }
}