import java.util.Scanner;

public class PertanyaanPercobaan3Jobsheet9 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double rataLulus = 0, rataTidakLulus = 0, totalLulus = 0, totalTidakLulus = 0;
        int jumlahMhs = 0, lulus = 0, tidakLulus = 0;

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        jumlahMhs = input.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                lulus++;
                totalLulus += nilaiMhs[i];
                rataLulus = totalLulus/lulus;          
            } else {
                tidakLulus++;
                totalTidakLulus += nilaiMhs[i];
                rataTidakLulus = totalTidakLulus/tidakLulus;
            }
        }
        System.out.println("Jumlah Mahasiswa Yang Lulus = " + lulus);
        System.out.println("Jumlah Mahasiswa Yang Tidak Lulus = " + tidakLulus);
        System.out.println("Rata-Rata Nilai Lulus = " + rataLulus);
        System.out.println("Rata-Rata Nilai Tidak Lulus = " + rataTidakLulus);
        input.close();
    }
}
