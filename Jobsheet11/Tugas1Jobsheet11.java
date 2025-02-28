import java.util.Scanner;
public class Tugas1Jobsheet11 {

    static int volumeKubus(int rusuk) {
        int hasil = 0;
        hasil = rusuk * rusuk * rusuk;
        return hasil;
    }

    static int luasPermukaanKubus(int rusuk) {
        int hasil = 0;
        hasil = 6 * (rusuk * rusuk);
        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rusuk;
        System.out.print("Masukkan Panjang Rusuk Kubus : ");
        rusuk = input.nextInt();

        int hasilVolume = volumeKubus(rusuk);
        int hasilLuas = luasPermukaanKubus(rusuk);

        System.out.printf("Hasil Dari Volume Kubus Dengan Panjang Rusuk %s Adalah %s \n", rusuk, hasilVolume);
        System.out.printf("Hasil Dari Luas Permukaan Kubus Dengan Panjang Rusuk %s Adalah %s \n", rusuk, hasilLuas);

        input.close();
    }
}