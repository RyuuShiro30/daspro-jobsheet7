import java.util.Scanner;

public class ParkirKendaraan08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis, durasi, total = 0;

        do {
            System.out.println("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            jenis = input.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.println("Masukkan durasi parkir (jam): ");
                durasi = input.nextInt();

                if (durasi > 5) {
                    total += 12500;
                    break;
                }

                else if (jenis == 1) {
                    total += durasi * 3000;
                    break;
                }

                else if (jenis == 2) {
                    total += durasi * 2000;
                    break;
                }
            }

        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp " + total);
    }
}
