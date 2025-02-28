import java.util.Scanner;
public class Pemilihan2Percobaan108 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        //Deklarasi
        short tahun;

        System.out.print("Masukkan Tahun Saat Ini : ");
        tahun = input08.nextShort();

        if ( tahun % 4 == 0) {
            if ( tahun % 100 != 0 )
            System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
        input08.close();
    }
}