import java.util.Scanner;

public class LatihanIndividu4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int umur;
        String kategori;

        System.out.print("Masukkan Umur Anda : ");
        umur = input.nextInt();

        if (umur >= 0 && umur <= 12) {
            kategori = "Anak-Anak";
        } else if (umur > 12 && umur <= 19) {
            kategori = "Remaja";
        } else if (umur > 19 && umur <= 64) {
            kategori = "Dewasa";
        } else if (umur > 64) {
            kategori = "Lansia";
        } else {
            kategori = "Umur Tidak Valid";
        }

        System.out.println("Umur Anda Adalah " + umur);
        System.out.println("Termasuk Ke Dalam Kategori " + kategori);

        input.close();
    }
}
