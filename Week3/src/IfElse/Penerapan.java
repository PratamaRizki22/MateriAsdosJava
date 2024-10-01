package IfElse;


public class Penerapan {
    
    static String cekKedewasaan(int umur) {
            if (umur <= 18 && umur >0) {
                return "Anda belum dewasa.";
            } else if (umur <49){
                return "Anda sudah dewasa.";
            } else if ( umur<110){
                return "anda sudah tua";
            } else{
                return "umur anda tidak masuk akal";
            }
        

    }
    
    public static void main(String[] args) {
        int umur = 56;
        String hasil = cekKedewasaan(umur);
        System.out.println("Umur: " + umur + " - " + hasil);
    }
}
