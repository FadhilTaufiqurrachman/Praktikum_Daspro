import java.util.Scanner;

public class PemilihanBilanganDenganTernaryOperators08 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan Sebuah Angka : ");
    int angka = sc.nextInt();
    String hasil;

    hasil = (angka % 2 == 0) ? " Termasuk Bilangan Genap." : " Termasuk Bilangan Ganjil.";
    System.out.println("Angka " + angka + hasil);

    sc.close();
    }    
}