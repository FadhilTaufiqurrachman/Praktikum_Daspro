import java.util.Scanner;
public class DasproUts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Masukkan Nilai N : ");
        n = input.nextInt();
         
        for (int i = 1; i <= n; i++ ){
            System.out.print((i) + " ");
            System.out.print((i + n) + " ");
            System.out.print((i + 2*n) + " " );
            System.out.println();
        } 
        input.close();
    }
}