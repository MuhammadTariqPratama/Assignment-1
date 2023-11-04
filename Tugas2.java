package Tugas;

import java.util.Scanner;
import java.util.Random;

public class Tugas2 {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int input;
        int attempt = 0;

        while (true) {
            System.out.println("Tebak angka dari 1 sampai 10: ");
            input = scanner.nextInt();
            attempt++;

            if (input == target) {
                System.out.println("Selamat! Anda menebak angka dengan benar.");
                System.out.println("Jumlah percobaan: " + attempt);
                break;
            } else if (input < target) {
                System.out.println("Angka yang Anda tebak terlalu kecil. Coba lagi.");
            } else if (input > 10) {
                System.out.println("masukkan 1-10 saja");
            } else {
                System.out.println("Angka yang Anda tebak terlalu besar. Coba lagi.");
            }
        }
    }
}
