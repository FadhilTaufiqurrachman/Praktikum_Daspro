import java.util.Scanner;

public class SiakadJobsheet508 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in); 
        //Deklarasi
        String nama, kelas , nim, nilaiHuruf = "Invalid", kualifikasi = "Invalid";
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir, nilaiSetara = 0;

        System.out.print("Masukkan Nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = sc.nextLine();
        System.out.print("Masukkan No Absen : ");
        absen = sc.nextByte();

        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Ujian : ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiTugas + nilaiKuis + nilaiUjian) / 3;

        if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
            nilaiSetara = 0;
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
            nilaiSetara = 1;
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
            nilaiSetara = 2;
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih Dari Cukup";
            nilaiSetara = 2.5;
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
            nilaiSetara = 3;
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih Dari Baik";
            nilaiSetara = 3.5;
        } else if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
            nilaiSetara = 4;
        } else {
            System.out.println("Invalid");
        }
        
        System.out.println("Mahasiswa Dengan Nama " + nama + " (NIM " + nim + ")");
        System.out.println("Kelas " + kelas + " No Absen " + absen);
        System.out.println("Nilai Akhir = " + nilaiAkhir);
        System.out.println("Nilai Akhir Huruf : " + nilaiHuruf);
        System.out.println("Nilai Setara : " + nilaiSetara);
        System.out.println("Kualifikasi : " + kualifikasi);

        sc.close();
    }
    
}