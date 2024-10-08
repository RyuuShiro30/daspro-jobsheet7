import java.util.Scanner;

public class ParkirKendaraan08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;

        while (true) {
            // Meminta input jenis kendaraan
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = input.nextInt();

            // Jika input jenis = 0, program menampilkan pesan dan keluar
            if (jenis == 0) {
                System.out.println("Anda keluar.");
                break;
            }

            // Validasi jenis kendaraan (hanya 1 atau 2 yang diterima)
            if (jenis == 1 || jenis == 2) {
                // Meminta input durasi parkir
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                durasi = input.nextInt();

                // Jika durasi lebih dari 5 jam, tarif tetap Rp 12.500
                if (durasi > 5) {
                    total += 12500;
                } else {
                    // Menghitung biaya berdasarkan jenis kendaraan
                    if (jenis == 1) {
                        total += durasi * 3000;  // Tarif mobil Rp 3000/jam
                    } else if (jenis == 2) {
                        total += durasi * 2000;  // Tarif motor Rp 2000/jam
                    }
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid! Masukkan 1 untuk Mobil atau 2 untuk Motor.");
            }
        }

        // Output total biaya parkir setelah keluar dari loop
        System.out.println("Total biaya parkir: Rp " + total);
        input.close();
    }
}
