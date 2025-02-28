import java.util.Scanner;

public class PemilihanHariDenganIf08 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int angka;
     String dayType;

     System.out.print("Masukkan Hari Dalam Angka : " );
     angka = sc.nextInt();

     if (angka > 0 && angka <= 5) {
        dayType = "weekday";
     } else if (angka >= 6 && angka <= 7){
        dayType = "weekend";
     } else {
        dayType = "Invalid Number";
     }
     
     System.out.println(dayType);
     
     sc.close();
    }
}