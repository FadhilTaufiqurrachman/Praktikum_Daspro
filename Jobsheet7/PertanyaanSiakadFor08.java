import java.util.Scanner;
public class PertanyaanSiakadFor08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Deklarasi
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + i + " : ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            } else if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);
        System.out.println("Jumlah Mahasiswa Yang Lulus : " + lulus);
        System.out.println("Jumlah Mahasiswa Yang Tidak Lulus : " + tidakLulus);

        sc.close();
    }
}