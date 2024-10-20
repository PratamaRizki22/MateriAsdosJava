package kuis;

public class Kuis2 {
    static int perhitungan(int angka){
        if(angka>2){
            return angka+2;
        } else if(angka<10){
            angka=-1;
            return angka;
        }
        return angka;
    }
    
    public static void main(String[] args) {
        
        System.out.println(perhitungan(20));
    }
}
