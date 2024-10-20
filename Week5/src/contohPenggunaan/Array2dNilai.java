package contohPenggunaan;


public class Array2dNilai {
    public static void main(String[] args) {
        int[][] nilai = {
            {85, 90, 78},
            {88, 76, 92},
            {90, 88, 84},
        };

        String[] namaMahasiswa = {"Ali", "Budi", "Cici"};

        String[] mataPelajaran = {"Matematika", "Fisika", "Kimia"};

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai " + namaMahasiswa[i] + ":");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.println("  " + mataPelajaran[j] + ": " + nilai[i][j]);
            }
        }
    }
}

