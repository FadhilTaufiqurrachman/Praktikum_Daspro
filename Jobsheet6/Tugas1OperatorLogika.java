import java.util.Scanner;
public class Tugas1OperatorLogika {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        //Deklarasi
        double bil1, bil2, bil3;
       
        System.out.print("Masukkan Bilangan Pertama : ");
        bil1 = input08.nextDouble();
        System.out.print("Masukkan Bilangan Kedua : ");
        bil2 = input08.nextDouble();
        System.out.print("Masukkan Bilangan Ketiga : ");
        bil3 = input08.nextDouble();

        if ( bil1 > bil2 && bil1 > bil3 ) {
            System.out.println("Bilangan Terbesar : " + bil1);
        } else if ( bil2 > bil1 && bil2 > bil3 ) {
            System.out.println("Bilangan Terbesar : " + bil2);
        } else {
            System.out.println("Bilangan Terbesar : " + bil3);
        }

        input08.close();
    }
}
