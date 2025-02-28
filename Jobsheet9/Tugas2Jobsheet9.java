import java.util.Scanner;

public class Tugas2Jobsheet9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah, sum = 0;
        System.out.println("---------------------------Kafe------------------------------");
        System.out.print("Masukkan Jumlah Pesanan : ");
        jumlah = input.nextInt();

        String pesanan[] = new String [jumlah];
        int harga[] = new int [jumlah];

        input.nextLine();

        jumlah = 0;
        while ( jumlah < pesanan.length && jumlah < harga.length ) {
            System.out.print("Masukkan Nama Makanan Atau Minuman Yang Dipesan : ");
            pesanan[jumlah] = input.nextLine();
            System.out.print("Masukkan Harganya : ");
            harga[jumlah] = input.nextInt();

            input.nextLine();

            if (harga[jumlah] < 0) {
                System.out.println("Input Tidak Valid, Silahkan Masukkan Lagi");
                continue;
            }
            sum+=harga[jumlah];
            jumlah++;
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Jumlah Pesanan Anda Adalah " + jumlah);
        for (jumlah = 0; jumlah < pesanan.length; jumlah++) {
            System.out.println("Menu Pesanan Anda Adalah " + pesanan[jumlah] + " Dengan Harga Rp." + harga[jumlah]);
        }
        System.out.println("Total Biaya : " + sum);
        System.out.println("-------------------------------------------------------------");
        input.close();
    }
}