import java.util.Scanner;
public class OperasiMatriks {
    static Scanner input = new Scanner(System.in);
    static int menu, pilihan, baris, kolom;
    static String next;

    static void tampilMenu() {
        System.out.println("========= Operasi Hitung Matriks =========");
        System.out.println("1. Penjumlahan Atau Pengurangan Matriks.\n" + 
                            "2. Perkalian Matriks.                   \n" + 
                            "3. Transpose Matriks.                   \n" +
                            "4. Invers Matriks.                      \n" +
                            "5. Keluar.                              ");
        System.out.println("==========================================");
        System.out.print("Masukkan Nomor Menu : ");
        menu = input.nextInt();
        input.nextLine();
        System.out.println();
    }
    
    static void input() {
        System.out.print("Masukkan Ordo Baris Matriks : ");
        baris = input.nextInt();
        System.out.print("Masukkan Ordo Kolom Matriks : ");
        kolom = input.nextInt();
        input.nextLine();
        System.out.println();
    }

    static void pilihan() {
        do {
        System.out.println("======= Pilihan Operasi =======");
        System.out.println("1. Penjumlahan Matriks.\n" + 
                            "2. Pengurangan Matriks.\n" +
                            "3. Kembali.");
        System.out.println("===============================");
        System.out.print("Masukkan Pilihan : ");
        pilihan = input.nextInt();
        input.nextLine();
        System.out.println(); 
            switch (pilihan) {
            case 1:
            penjumlahan();
            break;
            case 2:
            pengurangan();
            break;
            case 3:
            break;
            default:
            System.out.println("Input Tidak Valid.");
            System.out.println();
            break;
            }
        } while (pilihan != 3);
    }

    static void inputMatriks1 (double baris, double kolom, double[][] matriks_1) {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan Elemen Ke [" + (i + 1) + "] " + "[" + (j + 1) + "] : ");
                matriks_1[i][j] = input.nextDouble();
            }
        }
        System.out.println();
    }

    static void inputMatriks2 (double baris, double kolom, double[][] matriks_2) {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan Elemen Ke [" + (i + 1) + "] " + "[" + (j + 1) + "] : ");
                matriks_2[i][j] = input.nextDouble();
            }
        }
        input.nextLine();
        System.out.println();
    }

    static void cetakMatriks (double baris, double kolom, double[][] hasil) {
        for (int i = 0; i < baris; i++) {
            System.out.print("|   ");
            for (int j = 0; j < kolom; j++) {
                System.out.printf("%.1f   ", hasil[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
    }

    static void penjumlahan() {
        boolean ulang = true;
        do {
            System.out.println("========== Operasi Penjumlahan Matriks =========="); 
            input();
                if (baris < 1 || kolom < 1) {
                    System.out.println("Operasi Penjumlahan Matriks Tidak Dapat Dilakukan, Input Tidak Valid.\n" + 
                    "=================================================\n");
                    continue;
                }
            double[][] matriks_1 = new double[baris][kolom];
            double[][] matriks_2 = new double[baris][kolom];
            System.out.println("Elemen Matriks Pertama");
            inputMatriks1(baris, kolom, matriks_1);
            System.out.println("Elemen Matriks Kedua");
            inputMatriks2(baris, kolom, matriks_2);
            System.out.println("Matriks 1");
            cetakMatriks(baris, kolom, matriks_2);
            System.out.println("Matriks 2");
            cetakMatriks(baris, kolom, matriks_2);
            System.out.println();

            double[][] hasil = new double [baris][kolom];
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    hasil[i][j] = matriks_1[i][j] + matriks_2[i][j];
                }
            }
            System.out.println("Hasil Penjumlahan Matriks");
            cetakMatriks(baris, kolom, hasil);
            System.out.print("Apakah Ingin Lanjut Operasi Penjumlahan (Iya/Tidak) ? : ");
            next = input.nextLine();
            System.out.println();
                if (next.equalsIgnoreCase("Tidak")) {
                    ulang = false;
                    System.out.println("=================================================\n");
                    break;
                } else if (next.equalsIgnoreCase("Iya")) {
                    System.out.println("=================================================\n");
                    continue;
                }else {
                    System.out.println("Input Tidak Valid, Langsung Kembali Ke Menu Sebelumnya.");
                    System.out.println("=================================================");
                    ulang = false;
                }
            System.out.println();
        } while (ulang == true);
    }

    static void pengurangan() {
        boolean ulang = true;
        do { 
            System.out.println("========== Operasi Pengurangan Matriks ==========");
            input();
            if (baris < 1 || kolom < 1) {
                System.out.println("Operasi Penjumlahan Matriks Tidak Dapat Dilakukan, Input Tidak Valid.\n" + 
                    "=================================================\n");
                continue;
            }
            double[][] matriks_1 = new double[baris][kolom];
            double[][] matriks_2 = new double[baris][kolom];
            System.out.println("Elemen Matriks Pertama");
            inputMatriks1(baris, kolom, matriks_1);
            System.out.println("Elemen Matriks Kedua");
            inputMatriks2(baris, kolom, matriks_2);
            System.out.println("Matriks 1");
            cetakMatriks(baris, kolom, matriks_2);
            System.out.println("Matriks 2");
            cetakMatriks(baris, kolom, matriks_2);
            System.out.println();

            double[][] hasil = new double [baris][kolom];
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    hasil[i][j] = matriks_1[i][j] - matriks_2[i][j];
                }
            }

            System.out.println("Hasil Pengurangan Matriks");
            cetakMatriks(baris, kolom, hasil);
            System.out.print("Apakah Ingin Lanjut Operasi Pengurangan (Iya/Tidak) ? : ");
            next = input.nextLine();
            System.out.println();
                if (next.equalsIgnoreCase("Tidak")) {
                    ulang = false;
                    System.out.println("=================================================\n");
                    break;
                } else if (next.equalsIgnoreCase("Iya")) {
                    System.out.println("=================================================\n");
                    continue;
                }else {
                    System.out.println("Input Tidak Valid, Langsung Kembali Ke Menu Sebelumnya.");
                    System.out.println("=================================================");
                    ulang = false;
                }
            System.out.println();
        } while (ulang == true); 
    }

    static void perkalian() {
        boolean ulang = true;
        do {
            System.out.println("========== Operasi Perkalian Matriks ==========");
            System.out.println("Masukkan Ordo Matriks");
            System.out.print("Ordo Baris Matriks Pertama : ");
            int baris1 = input.nextInt();
            System.out.print("Ordo Kolom Matriks Pertama : ");
            int kolom1 = input.nextInt();
            System.out.print("Ordo Baris Matriks Kedua : ");
            int baris2 = input.nextInt();
            System.out.print("Ordo Kolom Matriks Kedua : ");
            int kolom2 = input.nextInt();
            input.nextLine();
            System.out.println();

                if (baris1 < 1 || baris2 < 1 || kolom1 < 1 || kolom2 < 1) {
                    System.out.println("Operasi Perkalian Matriks Tidak Dapat Dilakukan, Input Tidak Valid.\n" +
                    "=================================================\n");
                    continue;
                } else if (kolom1 != baris2) {
                    System.out.println("Operasi Perkalian Matriks Tidak Dapat Dilakukan, Input Tidak Valid.\n" +
                    "=================================================\n");
                    continue;
                }
            double[][] matriks_1 = new double[baris1][kolom1];
            double[][] matriks_2 = new double[baris2][kolom2];
            System.out.println("Elemen Matriks Pertama");
            inputMatriks1(baris1, kolom1, matriks_1);
            System.out.println("Elemen Matriks Kedua");
            inputMatriks2(baris2, kolom2, matriks_2);
            System.out.println("Matriks 1");
            cetakMatriks(baris1, kolom1, matriks_2);
            System.out.println("Matriks 2");
            cetakMatriks(baris2, kolom2, matriks_2);
            System.out.println();

            double[][] hasil = new double [baris1][kolom2];
            for (int i = 0; i < baris1 ; i++) {
                for (int j = 0; j < kolom2; j++) {
                    for (int k = 0; k < kolom1; k++) {
                        hasil[i][j] += matriks_1[i][k] * matriks_2[k][j]; 
                    }
                }
            }

            System.out.println("Hasil Perkalian Matriks");
            cetakMatriks(hasil.length, hasil[0].length, hasil);
            System.out.print("Apakah Ingin Lanjut Operasi Perkalian (Iya/Tidak) ? : ");
            next = input.nextLine();
            System.out.println();
                    if (next.equalsIgnoreCase("Tidak")) {
                        System.out.println("=================================================\n");
                        ulang = false;
                        break;
                    } else if (next.equalsIgnoreCase("Iya")) {
                        System.out.println("=================================================\n");
                        continue;
                    }else {
                        System.out.println("Input Tidak Valid, Langsung Kembali Ke Menu Sebelumnya.");
                        System.out.println("=================================================");
                        ulang = false;
                    }
            System.out.println();
            } while (ulang == true); 
        }

    public static double [][] prosesTranspose(double [][] matriks) {
        double[][] hasilTranspose = new double[kolom][baris];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasilTranspose[j][i] = matriks[i][j];
            }
        }
        return hasilTranspose;
    }

    public static void transpose() {
        boolean ulang = true;
        do { 
            System.out.println("========== Operasi Transpose Matriks ==========");
            input();
                if (baris < 1 || kolom < 1) {
                    System.out.println("Operasi Transpose Matriks Tidak Dapat Dilakukan, Input Tidak Valid.\n" +
                    "=================================================\n");
                    continue;
                }
            double[][] matriks = new double[baris][kolom];
            inputMatriks2(baris, kolom, matriks);
            System.out.println("Matriks Asli");
            cetakMatriks(baris, kolom, matriks);
            System.out.println();
            prosesTranspose(matriks);
            double[][] matriksTranspose = prosesTranspose(matriks);
            System.out.println("Hasil Transpose Matriks");
            cetakMatriks(kolom, baris, matriksTranspose);
            System.out.print("Apakah Ingin Lanjut Operasi Transpose (Iya/Tidak) ? : ");
            next = input.nextLine();
            System.out.println();
                    if (next.equalsIgnoreCase("Tidak")) {
                        ulang = false;
                        System.out.println("=================================================\n");
                        break;
                    } else if (next.equalsIgnoreCase("Iya")) {
                        System.out.println("=================================================\n");
                        continue;
                    }else {
                        System.out.println("Input Tidak Valid, Langsung Kembali Ke Menu Sebelumnya.");
                        ulang = false;
                        System.out.println("=================================================");
                    }
            System.out.println();
            } while (ulang == true); 
        }

    static void invers2x2() {
        boolean ulang = true;
        do {
            baris = 2; 
            kolom = 2;
            double determinan;
            double[][] invers2x2 = new double[baris][kolom];
            double[][] hasilInvers = new double[baris][kolom];
            System.out.println("========== Operasi Invers Matriks 2x2 ==========");
            inputMatriks2(baris, kolom, invers2x2);
            System.out.println("Matriks Asli");
            cetakMatriks(baris, kolom, invers2x2);
            System.out.println();
            determinan = (invers2x2[0][0] * invers2x2[1][1]) - (invers2x2[0][1] * invers2x2[1][0]);
                if (determinan == 0) {
                    System.out.println("Hasil Determinan 0, Matriks Tidak Memiliki Invers. Silahkan Input Ulang!\n" +
                    "=================================================\n");
                    continue;
                }
            hasilInvers[0][0] = invers2x2[1][1] / determinan;
            hasilInvers[0][1] = -invers2x2[0][1] / determinan;
            hasilInvers[1][0] = -invers2x2[1][0] / determinan;
            hasilInvers[1][1] = invers2x2[0][0] / determinan;
            System.out.println("Hasil Invers Matriks");
            cetakMatriks(baris, kolom, hasilInvers);
            System.out.print("Apakah Ingin Lanjut Operasi Invers (Iya/Tidak) ? : ");
            next = input.nextLine();
            System.out.println();
                    if (next.equalsIgnoreCase("Tidak")) {
                        ulang = false;
                        System.out.println("=================================================\n");
                        break;
                    } else if (next.equalsIgnoreCase("Iya")) {
                        System.out.println("=================================================\n");
                        continue;
                    }else {
                        System.out.println("Input Tidak Valid, Langsung Kembali Ke Menu Sebelumnya.");
                        ulang = false;
                        System.out.println("=================================================");
                    }
            System.out.println();
            } while (ulang == true); 
        }

    static void invers3x3() {
        boolean ulang = true; 
        do {
        baris = 3;
        kolom = 3;
        double [][] invers3x3 = new double [baris][kolom];
        double [][] adjoint = new double [baris][kolom];
        double [][] invers = new double [baris][kolom];
        System.out.println("========== Operasi Invers Matriks 3x3 ==========");
        inputMatriks2(baris, kolom, invers3x3);
        System.out.println("Matriks Asli");
        cetakMatriks(baris, kolom, invers3x3);
        System.out.println();
        double determinant = (invers3x3[0][0] * (invers3x3[1][1] * invers3x3[2][2] - invers3x3[1][2] * invers3x3[2][1])) 
                        - (invers3x3[0][1] * (invers3x3[1][0] * invers3x3[2][2] - invers3x3[1][2] * invers3x3[2][0]))
                        + (invers3x3[0][2] * (invers3x3[1][0] * invers3x3[2][1] - invers3x3[1][1] * invers3x3[2][0]));

            if (determinant == 0) {
                    System.out.println("Hasil Determinan 0, Matriks Tidak Memiliki Invers. Silahkan Input Ulang!\n" +
                    "=================================================\n");
                    continue;
            }
        adjoint[0][0] = invers3x3[1][1] * invers3x3[2][2] - invers3x3[1][2] * invers3x3[2][1];
        adjoint[0][1] = -(invers3x3[1][0] * invers3x3[2][2] - invers3x3[1][2] * invers3x3[2][0]);
        adjoint[0][2] = invers3x3[1][0] * invers3x3[2][1] - invers3x3[1][1] * invers3x3[2][0];
        adjoint[1][0] = -(invers3x3[0][1] * invers3x3[2][2] - invers3x3[0][2] * invers3x3[2][1]);
        adjoint[1][1] = invers3x3[0][0] * invers3x3[2][2] - invers3x3[0][2] * invers3x3[2][0];
        adjoint[1][2] = -(invers3x3[0][0] * invers3x3[2][1] - invers3x3[0][1] * invers3x3[2][0]);
        adjoint[2][0] = invers3x3[0][1] * invers3x3[1][2] - invers3x3[0][2] * invers3x3[1][1];
        adjoint[2][1] = -(invers3x3[0][0] * invers3x3[1][2] - invers3x3[0][2] * invers3x3[1][0]);
        adjoint[2][2] = invers3x3[0][0] * invers3x3[1][1] - invers3x3[0][1] * invers3x3[1][0];

        double [][] faktormatriks = prosesTranspose(adjoint);

        for (int i = 0; i < baris; i++){
            for (int j = 0; j < kolom; j++){
                invers[i][j] = faktormatriks[i][j]  / determinant;
            } 
        }
        System.out.println("Hasil Invers Matriks");
        cetakMatriks(baris, kolom, invers);
        System.out.print("Apakah Ingin Lanjut Operasi Invers (Iya/Tidak) ? : ");
        next = input.nextLine();
        System.out.println();
                if (next.equalsIgnoreCase("Tidak")) {
                    ulang = false;
                    System.out.println("=================================================\n");
                    break;
                } else if (next.equalsIgnoreCase("Iya")) {
                    System.out.println("=================================================\n");
                    continue;
                }else {
                    System.out.println("Input Tidak Valid, Langsung Kembali Ke Menu Sebelumnya.");
                    ulang = false;
                    System.out.println("=================================================");
                }
        System.out.println();
        } while (ulang == true); 
    }

    static void choice() {
    do {
        System.out.println("======= Pilihan Ordo Matriks =======");
        System.out.println("1. Matriks 2x2.\n" + 
                            "2. Matriks 3x3.\n" +
                            "3. Kembali.");
        System.out.println("====================================");
        System.out.print("Masukkan Pilihan : ");
        pilihan = input.nextInt();
        input.nextLine();
        System.out.println(); 
            switch (pilihan) {
            case 1:
            invers2x2();
            break;
            case 2:
            invers3x3();
            break;
            case 3:
            break;
            default:
            System.out.println("Input Tidak Valid.");
            break;
            }
        } while (pilihan != 3);
    }

    public static void main(String[] args) {
        do {
            tampilMenu();
                switch (menu) {
                    case 1:
                    pilihan();
                    break;
                    case 2:
                    perkalian();
                    break;
                    case 3:
                    transpose();
                    break;
                    case 4:
                    choice();
                    break;
                    case 5:
                    System.out.println("Terima Kasih!");
                    break;
                    default:
                    System.out.println("Pilihan Tidak Valid.");
                    break;
            }
        } while (menu != 5 );
    }
}