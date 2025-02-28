import java.util.Scanner;

public class Tugas3Jobsheet9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu[] = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", 
        "Chocolate Ice"};
        
        boolean searching = false;
        String cari;
        System.out.println("================List Menu====================");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }
        System.out.println("=============================================");
        System.out.print("Masukkan Nama Menu Yang Dicari : ");
        cari = input.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                searching = true;
                break;
            }
        }
        
        if (searching) {
            System.out.println("Menu Yang Dicari Ditemukan");
        } else {
            System.out.println("Menu Yang Dicari Tidak Ditemukan");
        }           
        System.out.println("=============================================");
        input.close();
    }
}