import java.util.Scanner;

public class Pertanyaan1Jobsheet3 {
   public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in); 
        //Deklarasi
        String nama, nim, kelas;
        byte absen;
        int nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.print("Masukkan Nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = sc.nextLine();
        System.out.print("Masukkan No Absen : ");
        absen = sc.nextByte();

        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = sc.nextInt();
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        nilaiUAS = sc.nextInt();

        nilaiAkhir = (nilaiKuis * 20 / 100) + (nilaiTugas * 15 / 100) + (nilaiUTS * 30 / 100) + (nilaiUAS * 35 / 100);

        System.out.println("Nama = " + nama + " NIM = " + nim);
        System.out.println("Kelas = " + kelas + " No Absen = " + absen);
        System.out.println("Nilai Akhir = " + nilaiAkhir);
        
        sc.close();

    }
}