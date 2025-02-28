import java.util.Scanner;

public class Kuis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Elemen Matriks Ordo 2x2 :");
        double[][] arrayMatriks = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemen [" + (i+1) + "]" + "[" + (j+1) + "] : ");
                arrayMatriks[i][j] = sc.nextDouble();
            }
        }
        System.out.println();
        System.out.println("Matriks Asli : ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.printf("|\t %s \t", arrayMatriks[i][j]);
            }
            System.out.printf( "%s \t| \n", arrayMatriks[i][1]);
        }

        System.out.println();
        System.out.println("Transpose Matriks : ");
        for (int i = 0; i < arrayMatriks[0].length; i++) {
            System.out.print("|\t" );
            for (int j = 0; j < arrayMatriks.length; j++){
                System.out.print(" " + arrayMatriks[j][i] + " ");
                System.out.print("\t" );
            }
            System.out.print("|" );
            System.out.println(" ");
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
            }
        }

    }
}