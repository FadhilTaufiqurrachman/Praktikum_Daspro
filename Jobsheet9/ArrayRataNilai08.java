import java.util.Scanner;
public class ArrayRataNilai08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double rata2, total = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = total / nilaiMhs.length;
        System.out.println("Rata - Rata Nilai = " + rata2);

        input.close();
    }
}