import java.util.Scanner;
public class PertanyaanPercobaan3Jobsheet8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        
        int i = 1;
        while(i <= N) {
            int j = 0;
            while(j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); 
            i++;
        }
        sc.close();
    }
}
