import java.util.Scanner;

public class Tugas4Jobsheet12 {
    public static int pasanganMarmut(int bulan) {
        if (bulan <= 1) {
            return (bulan);
        } else {
            return (pasanganMarmut(bulan - 2) + pasanganMarmut(bulan - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Bulan Saat Ini Ke : ");
        int bulan = sc.nextInt();
        int jumlahPasangan = pasanganMarmut(bulan);

        System.out.println("Pasangan Marmut Pada Akhir Bulan Ke-" + bulan + " Adalah " + jumlahPasangan);
        sc.close();
    }
}