import java.util.Scanner;
public class RataNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi
        int i, j;
        float nilaiMhs, totalNilai, rataNilai;

        i = 1;
        while (i <= 5) {
        totalNilai = 0;
        System.out.println("Input Nilai Mahasiswa Ke " + i );
            for (j = 1; j <= 5; j++) {
                System.out.print("Masukkan Nilai Ke-" + j + " = ");
                nilaiMhs = sc.nextFloat();
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai / 5;
            i++;
            System.out.println("Rata-Rata Nilai Mahasiswa Ke " + i + " Adalah " + rataNilai);
        }
        sc.close();
    }
}