import java.util.Scanner;
public class SiakadFor08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Deklarasi
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + i + " : ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            } else if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);

        sc.close();
    }
}