import java.util.Scanner;
public class Tugas3Jobsheet12 {
    public static boolean cekBilanganPrima(int n, int x) {
        if (x * x > n) {
            return true;
        }
        if (n % x == 0) {
            return false;
        }
        return cekBilanganPrima(n, x + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;
        System.out.print("Masukkan Bilangan Yang Akan Di Cek : ");
        bilangan = sc.nextInt();
        int n = bilangan;
        if (cekBilanganPrima(bilangan, 2)) {
            System.out.println(n + " Adalah Bilangan Prima.");
        } else {
            System.out.println(n + " Bukan Bilangan Prima.");
        }
    }
}