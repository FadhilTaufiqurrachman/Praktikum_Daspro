import java.util.Scanner;
public class Tugas1NestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah;

        do {
            System.out.print("Masukkan Nilai N (Masukkan 0 Untuk Keluar): ");
            jumlah = input.nextInt();
            if (jumlah > 0 && jumlah <= 2) {
                System.out.println("Nilai N harus lebih dari 2");
                continue;
            }
            for (int i = 1; i <= jumlah; i++) {
                for (int j = 1; j <= jumlah; j++) {
                    if (i == 1 || i == jumlah || j == 1 || j == jumlah) {
                        System.out.print(jumlah);
                    } else {
                        System.out.print(" ");
                        if (jumlah >= 10) {
                            System.out.print(" ");
                        }
                    } System.out.print(" ");
                } 
                System.out.println();
            }
        } while (jumlah != 0);
        System.out.println("Program Selesai");
        input.close();
    }
}