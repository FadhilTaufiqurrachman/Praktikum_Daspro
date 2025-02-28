import java.util.Scanner;
public class Tugas2Dan3Jobsheet11 {
    static Scanner sc = new Scanner(System.in);
    static String menu[];

    static String[] inputMenu(int jumlahMenu){
        String array[] = new String[jumlahMenu];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan Nama Menu Ke-"+(i+1)+" : ");
            array[i] = sc.nextLine();
        }
        return array;
    }
    static void tampilMenu(String... listMenu){
        System.out.println();
        System.out.println("================= List Menu ==================");
        for (int i = 0; i < listMenu.length; i++) {
            System.out.println((i+1)+". "+listMenu[i]);
        }
        System.out.println("==============================================");
    }
    static int[][] inputData(int x,int y){
        int penjualanArr [][] = new int[x][y];
        for (int i = 0; i < penjualanArr.length; i++) {
            System.out.printf("Penjualan Menu %s\n",menu[i]);
            for (int j = 0; j < penjualanArr[i].length; j++) {
                System.out.printf("Masukkan Penjualan Hari Ke-%s: ",j+1);
                penjualanArr[i][j] = sc.nextInt();
            }
            System.out.println("==============================================");
        }
        return penjualanArr;
    }
    static void printArr(int arr[][] ){
        System.out.println("==============================================");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Hasil Penjualan Menu "+menu[i]+" : ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Hari ke-"+(j+1)+" : "+arr[i][j]);
            }
            System.out.println("");
        }
    }
    static void penjualanTertinggi(int arr[][]){
        int tertinggi = 0;
        int indexMenu = 0;
        int indexHari = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>tertinggi) {
                    tertinggi = arr[i][j];
                    indexMenu = i;
                    indexHari = j;
                }
            }
        }
        System.out.println("Menu Dengan Penjualan Tertinggi Adalah "+menu[indexMenu]);
        System.out.println("Dengan Jumlah Penjualan "+arr[indexMenu][indexHari]+" Pada Hari Ke-"+(indexHari+1));
        System.out.println("==============================================");
    }
    static void rataPenjualan(int arr [][]){
        for (int i = 0; i < arr.length; i++) {
            double total = 0;
            double rata = 0;
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
            rata = total / arr[i].length;
            System.out.println("Rata-Rata Penjualan Pada Menu "+menu[i]+" : "+rata);
        }
        System.out.println("==============================================");
    }
    public static void main(String[] args) {
        System.out.print("Masukkan Jumlah Menu Yang Tersedia : ");
        int jumlahMenu = sc.nextInt();
        System.out.print("Masukkan Jumlah Hari Penjualan : ");
        int jmlHari = sc.nextInt();
        sc.nextLine();

        menu = inputMenu(jumlahMenu);
        tampilMenu(menu);
        int dataPenjualan[][] = inputData(jumlahMenu, jmlHari);
        printArr(dataPenjualan);
        penjualanTertinggi(dataPenjualan);
        rataPenjualan(dataPenjualan);

        sc.close();
    }
}