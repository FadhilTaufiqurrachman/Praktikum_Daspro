
import java.util.Scanner;

public class SistemKRS {

    static String[][] dataKRS = new String[100][5]; // [nama, nim, kodeMK, namaMK, sks]
    static int jumlahData = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Sistem Pemantauan KRS Mahasiswa ===");
            System.out.println("1. Tambah Data KRS");
            System.out.println("2. Tampilkan Daftar KRS Mahasiswa");
            System.out.println("3. Analisis Data KRS");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    tambahDataKRS(scanner);
                    break;
                case 2:
                    tampilkanKRS(scanner);
                    break;
                case 3:
                    analisisDataKRS();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);

        scanner.close();
    }

    static void tambahDataKRS(Scanner scanner) {
        System.out.println("\n--- Tambah Data KRS ---");
        System.out.print("Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        int totalSKS = 0;

        while (true) {
            System.out.print("Kode Mata Kuliah: ");
            String kodeMK = scanner.nextLine();
            System.out.print("Nama Mata Kuliah: ");
            String namaMK = scanner.nextLine();
            System.out.print("Jumlah SKS (1-3): ");
            int sks = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            if (sks < 1 || sks > 3) {
                System.out.println("Jumlah SKS tidak valid! SKS harus antara 1 dan 3.");
                continue;
            }

            if (totalSKS + sks > 24) {
                System.out.println("Total SKS yang diambil melebihi batas maksimal 24. Data tidak ditambahkan.");
                break;
            }

            dataKRS[jumlahData][0] = nama;
            dataKRS[jumlahData][1] = nim;
            dataKRS[jumlahData][2] = kodeMK;
            dataKRS[jumlahData][3] = namaMK;
            dataKRS[jumlahData][4] = Integer.toString(sks);
            jumlahData++;
            totalSKS += sks;

            System.out.println("Data mata kuliah berhasil ditambahkan.");
            System.out.print("Tambah mata kuliah lain? (y/t): ");
            String pilihan = scanner.nextLine();
            if (pilihan.equalsIgnoreCase("t")) {
                break;
            }
        }

        System.out.println("Total SKS yang diambil: " + totalSKS);
    }

    static void tampilkanKRS(Scanner scanner) {
        System.out.println("\n--- Tampilkan Daftar KRS Mahasiswa ---");
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();

        boolean found = false;
        int totalSKS = 0;

        System.out.println("\nDaftar KRS:");
        System.out.printf("%-10s %-10s %-10s %-25s %-5s\n", "NIM", "Nama", "Kode MK", "Nama Mata Kuliah", "SKS");
        for (int i = 0; i < jumlahData; i++) {
            if (dataKRS[i][1].equals(nim)) {
                found = true;
                System.out.printf("%-10s %-10s %-10s %-25s %-5s\n", dataKRS[i][1], dataKRS[i][0], dataKRS[i][2], dataKRS[i][3], dataKRS[i][4]);
                totalSKS += Integer.parseInt(dataKRS[i][4]);
            }
        }

        if (found) {
            System.out.println("Total SKS: " + totalSKS);
        } else {
            System.out.println("Data KRS tidak ditemukan untuk NIM tersebut.");
        }
    }

    static void analisisDataKRS() {
        System.out.println("\n--- Analisis Data KRS ---");
        String[] mahasiswaNIM = new String[100];
        int[] totalSKSMahasiswa = new int[100];
        int jumlahMahasiswa = 0;

        for (int i = 0; i < jumlahData; i++) {
            String nim = dataKRS[i][1];
            int sks = Integer.parseInt(dataKRS[i][4]);
            boolean found = false;

            for (int j = 0; j < jumlahMahasiswa; j++) {
                if (mahasiswaNIM[j].equals(nim)) {
                    totalSKSMahasiswa[j] += sks;
                    found = true;
                    break;
                }
            }
            if (!found) {
                mahasiswaNIM[jumlahMahasiswa] = nim;
                totalSKSMahasiswa[jumlahMahasiswa] = sks;
                jumlahMahasiswa++;
            }

        }

        int mahasiswaKurangDari20SKS = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (totalSKSMahasiswa[i] < 20) {
                mahasiswaKurangDari20SKS++;
            }
        }

        System.out.println("Jumlah mahasiswa yang mengambil SKS kurang dari 20: " + mahasiswaKurangDari20SKS);
    }
}
