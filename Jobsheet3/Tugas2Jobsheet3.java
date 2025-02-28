import java.util.Scanner;

public class Tugas2Jobsheet3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //Deklarasi 
        short jumlahJamKerja;
        float upahPerJam, gajiAwal, pajak = 5 / 100f, bonus = 10 / 100f, gajiKotor, totalGajiBersih;
        int totalInt;

        System.out.print("Masukkan Jumlah Jam Kerja : ");
        jumlahJamKerja = input.nextShort();
        System.out.print("Masukkan Upah Per Jam : ");
        upahPerJam = input.nextFloat();

        gajiAwal = jumlahJamKerja * upahPerJam;
        gajiKotor = gajiAwal + (gajiAwal * bonus);
        totalGajiBersih = gajiKotor - (gajiKotor * pajak);

        totalInt = (int) totalGajiBersih;
        
        System.out.println("Total Gaji Bersih Anda Adalah Rp. " + totalInt);
    
        input.close();
    }

}
