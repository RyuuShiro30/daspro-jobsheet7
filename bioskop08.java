import java.util.Scanner;

public class bioskop08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahTiket;
        double hargaPerTiket = 50000;  // Harga per tiket Rp 50.000
        double totalHarga;
        String lanjut;

        do {
            totalHarga = 0;
            System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
            jumlahTiket = input.nextInt();

            // Menghitung total harga tanpa diskon
            totalHarga = jumlahTiket * hargaPerTiket;

            // Penerapan diskon berdasarkan jumlah tiket
            if (jumlahTiket > 10) {
                totalHarga -= totalHarga * 0.15;  // Diskon 15% jika beli lebih dari 10 tiket
            } else if (jumlahTiket > 4) {
                totalHarga -= totalHarga * 0.10;  // Diskon 10% jika beli lebih dari 4 tiket
            }

            // Menampilkan hasil
            System.out.println("Total tiket yang dibeli: " + jumlahTiket);
            System.out.println("Total harga setelah diskon: Rp " + totalHarga);

            // Menanyakan apakah pelanggan ingin melanjutkan pembelian
            System.out.print("Apakah Anda ingin melakukan pembelian lagi? (ya/tidak): ");
            lanjut = input.next();

        } while (lanjut.equalsIgnoreCase("ya"));

        System.out.println("Terima kasih telah membeli tiket!");
        input.close();
    }
}
