import java.util.Scanner;

public class PengurutanSoal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bilangan1, bilangan2, bilangan3, terkecil, terbesar, tengah;

        System.out.println("================================================================");
        System.out.println("============ Program Mengurutkan Bilangan Ascending ============");
        System.out.println("================================================================");
        System.out.print("Masukkan Bilangan 1 : ");
        bilangan1 = input.nextDouble();
        System.out.print("Masukkan Bilangan 2 : ");
        bilangan2 = input.nextDouble();
        System.out.print("Masukkan Bilangan 3 : ");
        bilangan3 = input.nextDouble();

        if ( bilangan1 > bilangan2 ) { 
            if ( bilangan1 > bilangan3 ) {
                terbesar = bilangan1;
                tengah = bilangan3;
                terkecil = bilangan2;
            } else {
                tengah = bilangan1;
                terbesar = bilangan3;
                terkecil = bilangan2;
            }
        } else if ( bilangan2 > bilangan3) {
            terbesar = bilangan2;
            if (bilangan1 > bilangan3) {
                tengah = bilangan1;
                terkecil = bilangan3;
            } else {
                tengah = bilangan3;
                terkecil = bilangan1;
            }
        } else {
            terbesar = bilangan3;
            terkecil = bilangan1;
            tengah = bilangan2;
        }
        System.out.println();
        System.out.printf("Bilangan Dari Terkecil Ke Terbesar Adalah %s, %s, %s.\n", terkecil, tengah, terbesar);
        System.out.println("================================================================");
        input.close();
    }
}