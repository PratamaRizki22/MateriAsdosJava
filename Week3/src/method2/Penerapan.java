package method2;
import java.util.Scanner;

public class Penerapan {

    static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    static double hitungKelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    static double hitungKelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    static double hitungKelilingLingkaran(double jariJari) {
        return 2 * Math.PI * jariJari;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan sisi persegi: ");
        double sisi = scanner.nextDouble();
        System.out.println("Luas Persegi: " + hitungLuasPersegi(sisi));
        System.out.println("Keliling Persegi: " + hitungKelilingPersegi(sisi));

        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();
        System.out.println("Luas Persegi Panjang: " + hitungLuasPersegiPanjang(panjang, lebar));
        System.out.println("Keliling Persegi Panjang: " + hitungKelilingPersegiPanjang(panjang, lebar));

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();
        System.out.println("Luas Lingkaran: " + hitungLuasLingkaran(jariJari));
        System.out.println("Keliling Lingkaran: " + hitungKelilingLingkaran(jariJari));
        
        scanner.close();
    }
}
