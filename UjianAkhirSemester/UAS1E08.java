// Nama   : Fadhil Taufiqurrachman
// Nim    : 244107020090
// Absen  : 08

import java.util.Scanner;
public class UAS1E08 {
    static Scanner input08 = new Scanner(System.in);
    static int menu08, jumlahData08 = 0, totalSkor08;
    static String [][] arrSkor08;

    static void tampilMenu08 () {
        System.out.println("========= Menu Utama =========");
        System.out.println("1. Input Data Skor Tim.\n" + 
                            "2. Tampilkan Tabel Skor.\n" + 
                            "3. Tentukan Juara.\n" +
                            "4. Keluar.");
        System.out.println("==============================");
        System.out.print("Pilihan Menu (1-4) : ");
        menu08 = input08.nextInt();
        input08.nextLine();
        System.out.println();
    }

    static void inputSkor08() {
        while (jumlahData08 < 4) {
            int level108 = 0, level208 = 0;
            String nama08;
            totalSkor08 = 0;

                System.out.print("Masukkan Nama Tim Ke-" + (jumlahData08 + 1) + " : ");
                nama08 = input08.nextLine();
                System.out.print("Masukkan Skor " + nama08 + " Untuk Level 1 : ");
                level108 = input08.nextInt();
                System.out.print("Masukkan Skor " + nama08 + " Untuk Level 2 : ");
                level208 = input08.nextInt();
                input08.nextLine();
                System.out.println();
            

            if (level108 < 0 || level208 < 0) {
                System.out.println("Input Tidak Valid, Silahkan Input Ulang.\n");
                continue;
            } else if (level108 < 35) {
                level108 = 0;
            }

            totalSkor08 = level108 + level208;
            arrSkor08[jumlahData08][0] = Integer.toString(jumlahData08);
            arrSkor08[jumlahData08][1] = nama08;
            arrSkor08[jumlahData08][2] = Integer.toString(level108);
            arrSkor08[jumlahData08][3] = Integer.toString(level208);
            arrSkor08[jumlahData08][4] = Integer.toString(totalSkor08);
            jumlahData08++;
        }
    }

    static void tampilData08() {
        System.out.println("Tabel Skor Turnamen");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor");
        for (int i08 = 0; i08 < jumlahData08; i08++) {
            System.out.printf("%-10s %-10s %-10s %-10s", arrSkor08[i08][1],arrSkor08[i08][2],arrSkor08[i08][3],arrSkor08[i08][4]);
            System.out.println();
        }
        System.out.println();
    }

    static void juara08() {
        for (int i = 0; i < jumlahData08 - 1; i++) {
            for (int j = 0; j < jumlahData08 - i - 1; j++) {
                if (Integer.parseInt(arrSkor08[j][4]) < Integer.parseInt(arrSkor08[j+1][4])) {
                    String[] sementara08 = arrSkor08[j];
                    arrSkor08[j] = arrSkor08[j+1];
                    arrSkor08[j+1] = sementara08;
                }
            }
        }
        System.out.println("Selamat Kepada Tim " + arrSkor08[0][1] + "Yang Telah Memenangkan Kompetisi!");
    } 


    public static void main(String[] args) {
        arrSkor08 = new String[100][5];
        do {
            tampilMenu08();
                switch (menu08) {
                    case 1:
                    inputSkor08();
                    break;
                    case 2:
                    tampilData08();
                    break;
                    case 3:
                    juara08();
                    break;
                    case 4:
                    System.out.println("Terima Kasih!");
                    break;
                    default:
                    System.out.println("Pilihan Tidak Valid.");
                    break;
            }
        } while (menu08 != 4 );
    }   
}