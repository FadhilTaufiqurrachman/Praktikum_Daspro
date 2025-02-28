import java.util.Scanner;

public class Percobaan508 {
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     int p, l, t, L, vol;

    //     System.out.println("Masukkan Panjang");
    //     p = input.nextInt();
    //     System.out.println("Masukkan Lebar");
    //     l = input.nextInt();
    //     System.out.println("Masukkan Tinggi");
    //     t = input.nextInt();

    //     L = p * l;
    //     System.out.println("Luas Persegi Panjang Adalah " + L);

    //     vol = p * L * t;
    //     System.out.println("Volume Balok Adalah " + vol);
    // }
    static int hitungLuas(int pjg, int lb) {
        int luas = pjg * lb;
        return luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukkan Panjang : ");
        p = input.nextInt();
        System.out.print("Masukkan Lebar : ");
        l = input.nextInt();
        System.out.print("Masukkan Tinggi : ");
        t = input.nextInt();    

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang Adalah " + L);
        vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok Adalah " + vol);
    }
}