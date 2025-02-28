import java.util.Scanner;
public class PertanyaanPercobaan4Jobsheet9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah, hasil = 0;

        System.out.print("Masukkan Banyaknya Nilai Yang Akan Diinput : ");
        jumlah = input.nextInt();

        int[] arrNilai = new int[jumlah];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            arrNilai[i] = input.nextInt(); 
        }

        System.out.print("Masukkan Nilai Yang Ingin Dicari : ");
        int key = input.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i + 1;
                break;
            }
        }

        System.out.println();
        if (hasil != 0) {
            System.out.println("Nilai " + key + " Merupakan Nilai Mahasiswa Ke-" + (hasil));
        } else {
            System.out.println("Nilai Yang Dicari Tidak Ditemukan");
        }
        System.out.println();
    }
}