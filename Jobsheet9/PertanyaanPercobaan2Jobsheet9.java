import java.util.Scanner;
public class PertanyaanPercobaan2Jobsheet9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan Nilai Akhir Ke-" + i + " : ");
            nilaiAkhir[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa Ke-" + i + " Lulus!");                
            } else {
                System.out.println("Mahasiswa Ke-" + i + " Tidak Lulus!");
            }
        }

        input.close();
    }
}