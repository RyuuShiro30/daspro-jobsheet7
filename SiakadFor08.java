import java.util.Scanner;

public class SiakadFor08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       double nilai, tertinggi = 0, terendah = 100;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("masukkan nilai mahasiswa ke-" + i + ":");
            nilai = input.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;       
                
            } 
            if (nilai < terendah) {
                terendah = nilai;
                
            }
        }
        System.out.println("nilai tertinggi: " + tertinggi);
        System.out.println("nilai terendah: " + terendah);
    }
}