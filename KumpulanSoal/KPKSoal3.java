import java.util.Scanner;
public class KPKSoal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan1, bilangan2, hasil = 1;
        System.out.println("====================================================");
        System.out.println("===== Program Menghitung KPK Dari Dua Bilangan =====");
        System.out.println("====================================================");
        System.out.print("Masukkan Bilangan Pertama : "); 
        bilangan1 = input.nextInt();
        System.out.print("Masukkan Bilangan Kedua : "); 
        bilangan2 = input.nextInt();
        
        for (int i = bilangan1 * bilangan2; i > bilangan1 || i > bilangan2; i--) {
            if (i % bilangan1 == 0 && i % bilangan2 == 0) {
                hasil = i;
            }
        }
        System.out.printf("Kpk Dari %s Dan %s Adalah %s\n", bilangan1, bilangan2, hasil);
        System.out.println("====================================================");
    }   
}