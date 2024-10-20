package contohPenggunaan;

import java.util.Scanner;

public class PenyimpananBarang2 {

    public static void main(String[] args) {
        String[] barang = {"Buku", "Pulpen", "Penggaris", "Pensil"};
        int[] stok = {100, 50, 30, 75};

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n==== Sistem Gudang ====");
            System.out.println("1. Tampilkan Stok Barang");
            System.out.println("2. Tambah Barang Baru");
            System.out.println("3. Perbarui Stok Barang");
            System.out.println("4. Hapus Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1: 
                    tampilkanStok(barang, stok);
                    break;
                case 2: 
                    barang = tambahBarang(barang);
                    stok = tambahStok(stok);
                    break;
                case 3:
                    perbaruiStok(barang, stok);
                    break;
                case 4: 
                    barang = hapusBarang(barang, stok);
                    stok = hapusStok(stok);
                    break;
                case 5:
                    running = false;
                    System.out.println("Keluar dari sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
        scanner.close();
    }

    // Menampilkan stok barang
    public static void tampilkanStok(String[] barang, int[] stok) {
        System.out.println("\nDaftar Stok Barang:");
        for (int i = 0; i < barang.length; i++) {
            System.out.println("Stok " + barang[i] + ": " + stok[i] + " unit");
        }
    }

    // Menambah barang baru
    public static String[] tambahBarang(String[] barang) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama barang baru: ");
        String barangBaru = scanner.nextLine();
        
        String[] barangBaruArray = new String[barang.length + 1];
        System.arraycopy(barang, 0, barangBaruArray, 0, barang.length);
        barangBaruArray[barang.length] = barangBaru;
        
        System.out.println("Barang " + barangBaru + " berhasil ditambahkan.");
        return barangBaruArray;
    }

    // Menambah stok untuk barang baru
    public static int[] tambahStok(int[] stok) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah stok barang baru: ");
        int stokBaru = scanner.nextInt();
        
        int[] stokBaruArray = new int[stok.length + 1];
        System.arraycopy(stok, 0, stokBaruArray, 0, stok.length);
        stokBaruArray[stok.length] = stokBaru;

        return stokBaruArray;
    }

    // Memperbarui stok barang
    public static void perbaruiStok(String[] barang, int[] stok) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama barang yang akan diperbarui: ");
        String namaBarang = scanner.next();

        boolean found = false;
        for (int i = 0; i < barang.length; i++) {
            if (barang[i].equalsIgnoreCase(namaBarang)) {
                System.out.print("Masukkan stok baru untuk " + namaBarang + ": ");
                stok[i] = scanner.nextInt();
                System.out.println("Stok " + namaBarang + " berhasil diperbarui menjadi " + stok[i] + " unit.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Barang tidak ditemukan.");
        }
    }

    // Menghapus barang dan stok
    public static String[] hapusBarang(String[] barang, int[] stok) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama barang yang akan dihapus: ");
        String namaBarang = scanner.next();

        boolean found = false;
        String[] barangBaru = new String[barang.length - 1];
        int index = 0;

        for (int i = 0; i < barang.length; i++) {
            if (barang[i].equalsIgnoreCase(namaBarang)) {
                found = true;
                continue; // Lanjutkan loop tanpa menambahkan barang yang dihapus
            }
            barangBaru[index++] = barang[i];
        }

        if (found) {
            System.out.println("Barang " + namaBarang + " berhasil dihapus.");
            return barangBaru;
        } else {
            System.out.println("Barang tidak ditemukan.");
            return barang;
        }
    }

    // Menghapus stok barang yang sesuai
    public static int[] hapusStok(int[] stok) {
        int[] stokBaru = new int[stok.length - 1];
        System.arraycopy(stok, 0, stokBaru, 0, stokBaru.length);
        return stokBaru;
    }
}
