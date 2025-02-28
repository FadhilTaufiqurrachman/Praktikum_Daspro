import java.util.Scanner;

public class SuhuSoal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("\t   Program Konversi Suhu\t");
        System.out.println("===========================================");
        System.out.print("Masukkan Suhu Saat Ini (Celcius) : ");
        double suhu = input.nextDouble();

        double fahrenheit = (suhu * 9d/5d) + 32;

        System.out.println("Suhu " + suhu + "°C Dalam Fahrenheit Adalah " + fahrenheit + "°F");
        System.out.println("===========================================");
        input.close();
    }   
}