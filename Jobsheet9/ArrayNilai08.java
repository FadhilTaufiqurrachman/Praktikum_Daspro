import java.util.Scanner;
public class ArrayNilai08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan Nilai Akhir Ke-" + i + " : ");
            nilaiAkhir[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai Akhir Ke-" + i + " Adalah " + nilaiAkhir[i]);
        }

        input.close();
    }
}