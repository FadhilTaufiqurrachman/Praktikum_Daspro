import java.util.Scanner;
public class Tugas1Jobsheet9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rataRata, i, terendah = 100, tertinggi = 0, sum = 0;

        System.out.print("Masukkan Jumlah Nilai : ");
        i = input.nextInt();
        int nilai[] = new int[i];

        i = 0;
        while ( i < nilai.length ) {
            System.out.print("Masukkan Nilai Ke-" + (i + 1) + " Mahasiswa : ");
            nilai[i] = input.nextInt();
            
            if (nilai[i] < 0 || nilai[i] > 100) {
                System.out.println("Nilai Tidak Valid, Masukkan Lagi Nilai Yang Valid");
                continue;
            }
            sum = sum + nilai[i];
            i++;
        }

        rataRata = sum / nilai.length;

        System.out.println("===============Nilai Mahasiswa===============");
        for (i = 0; i < nilai.length; i++) {
            System.out.println("Nilai Ke-" + (i+1) +" : " + nilai[i]);
        }

        for (i = 0; i < nilai.length; i++) {
            if (tertinggi < nilai[i]) {
                tertinggi = nilai[i];
            } else if (terendah > nilai[i]) {
                terendah = nilai[i];
            }
        }

        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);
        System.out.println("Nilai Rata-Rata : " + rataRata);

        System.out.println("---------------------------------------------");

        input.close();
    }
}