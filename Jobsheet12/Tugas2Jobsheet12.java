import java.util.Scanner;

public class Tugas2Jobsheet12 {
    static int penjumlahanRekursif(int n) {
        if (n==1) {
            return 1;
        } else {
            return (n + penjumlahanRekursif(n-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Bilangan : ");
        int bilangan = sc.nextInt();
        for (int i = 1; i <= bilangan; i++) {
            if (i==bilangan) {
                System.out.print(i + " = ");
            } else {
            System.out.print(i + "+");
            }      
        }

        System.out.println(penjumlahanRekursif(bilangan));
        sc.close();    
    }
}