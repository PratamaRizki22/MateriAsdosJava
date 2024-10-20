package contohPenggunaan;

public class PenyimpananBarang {
    public static void main(String[] args) {
        String[] barang = {"Buku", "Pulpen", "Penggaris", "Pensil"};
        int[] stok = {100, 50, 30, 75};

        for (int i = 0; i < barang.length; i++) {
            System.out.println("Stok " + barang[i] + ": " + stok[i] + " unit");
        }
    }
}

