import java.util.Scanner;

public class TugasAkhir {
    static Scanner sc = new Scanner(System.in);
    static String nama, kodeMatkul, namaMatkul, next, nim;
    static int menu, jumlahSks = 0, totalSks = 0;
    static String[][] arrKrs;
    static int jumlahData = 0;

    static void inputDataKrs() {
        System.out.println("--- Tambah Data KRS ---");
        System.out.print("Nama Mahasiswa : ");
        nama = sc.nextLine();
        System.out.print("NIM : ");
        nim = sc.nextLine();
            while (true) {
            System.out.print("Kode Mata Kuliah : ");
            kodeMatkul = sc.nextLine();
            System.out.print("Nama Mata Kuliah : ");
            namaMatkul = sc.nextLine(); 
            System.out.print("Jumlah SKS (1-3) : ");
            jumlahSks = sc.nextInt();
            sc.nextLine();
                if (jumlahSks < 1 || jumlahSks > 3) {
                System.out.println("Jumlah SKS Tidak Valid! SKS Harus Antara 1 Dan 3.");
                continue;
                } else if (totalSks + jumlahSks > 24) {
                System.out.println("Total SKS Yang Diambil Melebihi Batas Maksimal 24. Data tidak ditambahkan.");
                break;
                }
            System.out.println("Data Mata Kuliah Berhasil Ditambahkan. ");    
                
                arrKrs[jumlahData][0] = Integer.toString(jumlahData);
                arrKrs[jumlahData][1] = nim;
                arrKrs[jumlahData][2] = nama;
                arrKrs[jumlahData][3] = kodeMatkul;
                arrKrs[jumlahData][4] = namaMatkul;
                arrKrs[jumlahData][5] = Integer.toString(jumlahSks);
                jumlahData++;

                totalSks += jumlahSks; 

                System.out.print("Tambah Mata Kuliah Lain? (Y/T) : ");
                next = sc.nextLine();
                if (next.equalsIgnoreCase("T")) {
                    System.out.println("Total SKS Yang Diambil : " + totalSks);
                    totalSks = 0;
                    System.out.println();   
                    break;
                }
            }
    }

    static void tampilkanDataKRS() {
        String nimDicari;
        boolean ditemukan;
        System.out.println("--- Tampilkan Data KRS Mahasiswa ---");
        System.out.print("Masukkan NIM mahasiswa: ");
        nimDicari = sc.nextLine();

        ditemukan = false;
        totalSks = 0;
        System.out.println("Daftar KRS :");
        System.out.printf("%-10s %-10s %-15s %-25s %-5s\n", "NIM", "Nama", "Kode MK", "Nama Mata Kuliah", "SKS");
        for (int i = 0; i < jumlahData; i++) {
            if (arrKrs[i][1].equalsIgnoreCase(nimDicari)) {
                System.out.printf("%-10s %-10s %-15s %-25s %-5s", arrKrs[i][1],arrKrs[i][2],arrKrs[i][3],arrKrs[i][4],arrKrs[i][5]);
                ditemukan = true;
                System.out.println();
                totalSks += Integer.parseInt(arrKrs[i][5]);
            }
        }
        System.out.println("Total SKS : " + totalSks);
        System.out.println();
        if (!ditemukan) {
            System.out.println("NIM Tidak Ditemukan.");
        }
    }

    static void analisisDataMahasiswa() {
        String[] nimMhs = new String[100];
        int[] totalSKS = new int[100];
        int jumlahMahasiswa = 0;

        System.out.println("--- Analisis Data KRS ---");
        for (int i = 0; i < jumlahData; i++) {
            boolean search = false;
            jumlahSks = 0;
            nim = arrKrs[i][1];
            jumlahSks = Integer.parseInt(arrKrs[i][5]);
            for (int j = 0; j < jumlahMahasiswa; j++) {
                if (nimMhs[j].equals(nim)) {
                    totalSKS[j] += jumlahSks;
                    search = true;
                    break;
                }
            }
            if (!search) {
                nimMhs[jumlahMahasiswa] = nim;
                totalSKS[jumlahMahasiswa] = jumlahSks;
                jumlahMahasiswa++;
            }
        }

        int mahasiswaKurang20 = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (totalSKS[i] < 20) {
                mahasiswaKurang20++;
            }
        }
        System.out.println("Jumlah Mahasiswa Yang Mengambil SKS Kurang Dari 20 : " + mahasiswaKurang20);
        System.out.println();
    }

    public static void main(String[] args) {
        arrKrs = new String[200][6];
        do {
            System.out.println("=== Sistem Pemantauan KRS Mahasiswa ===");
            System.out.println("1. Tambah Data KRS.\n" + 
                                "2. Tampilkan Daftar KRS Mahasiswa.\n" + 
                                "3. Analisis Data KRS.\n" +
                                "4. Keluar.");
            System.out.println("=======================================");
            System.out.print("Masukkan Nomor Menu : ");
            menu = sc.nextInt();
            sc.nextLine();
            System.out.println();
                switch (menu) {
                    case 1:
                    inputDataKrs();
                    break;
                    case 2:
                    tampilkanDataKRS();
                    break;
                    case 3:
                    analisisDataMahasiswa();
                    break;
                    case 4:
                    System.out.println("Terima kasih!");
                    break;
                    default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (menu != 4 );
    }
}