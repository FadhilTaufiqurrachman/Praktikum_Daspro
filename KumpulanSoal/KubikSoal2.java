import java.util.Scanner;

public class KubikSoal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kubik, total = 0, hasilPertama, hasilKedua, hasilKetiga, hasilKeempat;

        System.out.println("==================== Program Kubik Air PAM ====================");
        System.out.print("Masukkan Jumlah M Kubik Air PAM Yang Digunakan : ");
        kubik = input.nextDouble();

        if (kubik <= 50) {
            total = kubik * 1000;
        } else if (kubik > 50 && kubik <= 100) {
            hasilPertama = 50 * 1000;
            hasilKedua = (kubik - 50) * 1500;
            total = hasilPertama + hasilKedua;
        } else if (kubik > 100 && kubik <= 150) {
            hasilPertama = 50 * 1000;
            hasilKedua = 50 * 1500;
            hasilKetiga = (kubik - 100) * 2000;
            total = hasilPertama + hasilKedua + hasilKetiga;
        } else {
            hasilPertama = 50 * 1000;
            hasilKedua = 50 * 1500;
            hasilKetiga = 50 * 2000;
            hasilKeempat = (kubik - 150) * 3000;
            total = hasilPertama + hasilKedua + hasilKetiga + hasilKeempat;
        }

        System.out.println("Harga Yang Harus Dibayar Adalah Rp." + total);
        System.out.println("===============================================================");
        input.close();
    }
}