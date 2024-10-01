package SwichCase;

public class Penerapan {
    
    static String cekKelulusan(int nilai) {
        if (nilai >= 60) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    static String cekKategoriNilai(int nilai) {
        String kategori;
        switch (nilai / 10) {
            case 10:
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
        int nilai = 75;

        String kelulusan = cekKelulusan(nilai);
        System.out.println("Nilai: " + nilai + " - " + kelulusan);
        
        String kategori = cekKategoriNilai(nilai);
        System.out.println("Kategori Nilai: " + kategori); 
    }
}
