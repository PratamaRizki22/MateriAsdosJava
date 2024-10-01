package scanner;

import java.util.Scanner;

public class ScannerTutorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();

        System.out.println("Nama Anda adalah: " + name);

        scanner.close();
    }
}