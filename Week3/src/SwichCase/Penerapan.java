package SwichCase;

public class Penerapan {
    

    static String cekKategoriNilai(int nilai) {
        String kategori;
        switch (nilai / 10) {
            case 10:
                if (nilai > 100) {
                    kategori = "Nilai tidak valid";
                    break;
                }
            case 9:
                kategori = "A";
                break;
            case 8:
                kategori = "B";
                break;
            case 7:
                kategori = "C";
                break;
            case 6:
                kategori = "D";
                break;
            default:
                kategori = "E";
                break;
        }
        return kategori;
    }

    public static void main(String[] args) {
        int nilai = 101;
        
        String kategori = cekKategoriNilai(nilai);
        System.out.println("Kategori Nilai: " + kategori); 
    }
}
