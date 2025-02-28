import java.util.Scanner;

public class PrimaSoal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;
        boolean prima = true;
        System.out.println("================ Program Cek Bilangan Prima ================");
        System.out.print("Masukkan Sebuah Bilangan Yang Akan Dicek : ");
        bilangan = input.nextInt();
        
        for (int i = 2; i < bilangan/2; i++) {
            if (bilangan < 2) {
                prima = false;
                break;  
            }
            if (bilangan % i == 0) {
                prima = false;
                break;  
            }
        }
        if (prima) {
            System.out.println(bilangan + " Merupakan Bilangan Prima.");
        } else {
            System.out.println(bilangan + " Bukan Bilangan Prima");
        }
        System.out.println("============================================================");
    }   
}