import java.util.Scanner;

public class KafeDoWhile08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namapelanggan;
        int kopi, teh, roti;
        int hargakopi = 12000;
        int hargateh = 7000;
        int hargaroti = 20000;

        do {
            System.out.println("masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namapelanggan = sc.nextLine();
            if (namapelanggan.equalsIgnoreCase("batal")) {
                System.out.println("transaksi dibatalkan");
                break;
                
            }
            System.out.print("jumlah kopi: ");
            kopi =sc.nextInt();
            System.out.print("jumlah teh: ");
            teh = sc.nextInt();
            System.out.println("jumlah roti: ");
            roti = sc.nextInt();

            double totalharga = (kopi * hargakopi) + (teh * hargateh) + (roti * hargaroti);
            System.out.println("total harga yang harus dibayar: Rp " + totalharga);
            sc.nextLine();
        } while (true);

        System.out.println("semua transaksi selesai.");

    }
}