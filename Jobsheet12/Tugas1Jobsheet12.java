import java.util.Scanner;

public class Tugas1Jobsheet12 {
    static int deretDescendingRekursif(int n) {
        if (n==0) {
            return 0;
        } else {
            System.out.print(n + ", ");
            return (deretDescendingRekursif(n-1));
            
        }
    }
    static int deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            if (i==0) {
                System.out.print(0);
            } else {
                System.out.print(i + ", ");
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Bilangan : ");
        int bilangan = input.nextInt();
        
        System.out.println(deretDescendingRekursif(bilangan));
        deretDescendingIteratif(bilangan);
        input.close();
    }
}