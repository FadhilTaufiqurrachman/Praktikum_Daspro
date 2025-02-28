import java.util.Scanner;
public class RataRataSoal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rata;
        double[][] nilai = new double[3][5];
        System.out.println("========= Program Menghitung Rata-Rata Nilai Mahasiswa =========");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1));
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Masukkan Nilai Ke-" + (j + 1) + " : ");
                nilai[i][j] = input.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < nilai.length; i++) {
            rata = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                rata += nilai[i][j];
            }
            rata /= nilai[i].length;
            System.out.println("Rata-Rata Nilai Mahasiswa Ke-" + (i + 1) + " Adalah : " + rata);
        }
        System.out.println("================================================================");
        input.close();
    }
}