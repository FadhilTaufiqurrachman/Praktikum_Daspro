import java.util.Scanner;
public class Tugas2Parkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Deklarasi
        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukkan Jenis Kendaraan (1 = Mobil, 2 = Motor, 0 = Keluar ) : ");
            jenis = input.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan Durasi Parkir : ");
                durasi = input.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                } else {
                    System.out.println("Input Tidak Valid");
                }
            } else {
                System.out.println("Input Tidak Valid");
            }  
        } while (jenis != 0);
        System.out.println("Total Biaya Parkir : Rp." + total);
        input.close();
    }
}