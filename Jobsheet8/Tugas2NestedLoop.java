import java.util.Scanner;
public class Tugas2NestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int jmlCabor,jmlAtlit=5,jmlInstansi; 
        String namaCabor, namaAtlet,namaInstansi; 
 
        System.out.print("Masukkan Jumlah Politeknik Yang Mendaftar : "); 
        jmlInstansi = sc.nextInt(); 
        System.out.print("Masukkan Jumlah Cabor : "); 
        jmlCabor = sc.nextInt(); 
        sc.nextLine(); 
        
        for (int i = 1; i <= jmlInstansi; i++) {          
            System.out.print("Masukkan Nama Instansi Politeknik Ke-" + i + " : "); 
            namaInstansi = sc.nextLine(); 
            for (int j = 1; j <= jmlCabor; j++) { 
                System.out.print("Masukkan Nama Cabor Ke-" + j + " : "); 
                namaCabor = sc.nextLine(); 
                for (int k = 1; k <= jmlAtlit; k++) { 
                    System.out.print("Masukkan Nama Atlet Ke-" + k + " : "); 
                    namaAtlet = sc.nextLine(); 
                }
                System.out.println();
            } 
        } 
        sc.close(); 
    } 
}