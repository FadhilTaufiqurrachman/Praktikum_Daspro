import java.util.Scanner;

public class Tugas1Jobsheet3 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in); 
        //Deklarasi
        short kwh, batasPenggunaan = 500;
        int tarif;
        boolean melebihiBatas;

        System.out.print("Masukkan Jumlah Penggunaan Listrik Dalam kWh : ");
        kwh = input.nextShort();

        tarif = kwh * 1500;

        melebihiBatas = kwh > batasPenggunaan;

        System.out.println("Total Tarif Listrik Anda Adalah " + tarif);
        System.out.println("Penggunaan Listrik Melebihi Batas : " + melebihiBatas);

        input.close();
 }   
}
