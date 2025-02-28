import java.util.Scanner; 
public class Tugas3 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        String kategori, merk;
        double ukuran, harga = 0;

        System.out.print("Masukkan Merk Sepatu Yang Dibeli : ");
        merk = input08.nextLine();
        System.out.print("Masukkan Kategori Sepatu Yang Dibeli : ");
        kategori = input08.nextLine();
        System.out.print("Masukkan Ukuran Sepatu Yang Dibeli : ");
        ukuran = input08.nextDouble();

        if ( merk.equalsIgnoreCase("Specs") ) {
            if ( kategori.equalsIgnoreCase("Slip On") ) {
                if ( ukuran >= 36 ) {
                    if ( ukuran <= 40 ) {
                        harga = 800000;
                    } else {
                        System.out.println("Ukuran Tidak Tersedia");
                    }
                } else {
                    System.out.println("Ukuran Tidak Tersedia");
                }
            } else if ( kategori.equalsIgnoreCase("High Top") ) {
                if ( ukuran >= 40 ) {
                    if ( ukuran <= 44 ) {
                        harga = 1200000;
                    } else {
                        System.out.println("Ukuran Tidak Tersedia");
                    }
                } else {
                    System.out.println("Ukuran Tidak Tersedia");
                }
            } else {
                System.out.println("Kategori Tidak Tersedia");
            }
        } if ( merk.equalsIgnoreCase("910") ) {
            if ( kategori.equalsIgnoreCase("Woman") ) {
                if ( ukuran >= 36 ) {
                    if ( ukuran <= 41 ) {
                        harga = 1000000;
                    } else {
                        System.out.println("Ukuran Tidak Tersedia");
                    }
                } else {
                    System.out.println("Ukuran Tidak Tersedia");
                }
            } else if ( kategori.equalsIgnoreCase("Man") ) {
                if ( ukuran >= 41 ) {
                    if ( ukuran <= 44 ) {
                        harga = 1800000;
                    } else {
                        System.out.println("Ukuran Tidak Tersedia");
                    }
                } else {
                    System.out.println("Ukuran Tidak Tersedia");
                }
            } else {
                System.out.println("Kategori Tidak Tersedia");
            }
        } if ( merk.equalsIgnoreCase("Ortus") ) {
            if ( kategori.equalsIgnoreCase("Kids") ) {
                if ( ukuran >= 36 ) {
                    if ( ukuran <= 40 ) {
                        harga = 750000;
                    } else {
                        System.out.println("Ukuran Tidak Tersedia");
                    }
                } else {
                    System.out.println("Ukuran Tidak Tersedia");
                }
            } else if ( kategori.equalsIgnoreCase("Adult") ) {
                if ( ukuran >= 40 ) {
                    if ( ukuran <= 44 ) {
                        harga = 1500000;
                    } else {
                        System.out.println("Ukuran Tidak Tersedia");
                    }
                } else {
                    System.out.println("Ukuran Tidak Tersedia");
                }
            } else {
                System.out.println("Kategori Tidak Tersedia");
            }
        } else {
            System.out.println("Merk Tidak Tersedia");
        }

        System.out.println("Harga Sepatu Yang Anda Beli Adalah Rp." + harga);

        input08.close();
    }
}