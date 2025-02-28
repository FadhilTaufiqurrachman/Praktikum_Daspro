public class SegitigaSoal4 {
    public static void main (String[] args) {
        char[] arr = new char[15];
        char abjad = 'A';
        int index = 0;

        System.out.println("===== Program Membuat Segitiga =====");
        for (int i = 1; i <= 5; i++) {
            for (int j = 10 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                arr[index] = abjad;
                abjad++;
                System.out.print(arr[index]);
                index++;
            }
            System.out.println();
        }
        System.out.println("=====================================");
    }
}    
