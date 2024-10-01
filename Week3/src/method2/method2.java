package method2;

public class method2 {
    
    static void tampilkanPesan() {
        System.out.println("Halo, selamat datang di program Java!");
    }
    
    static int jumlah(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        tampilkanPesan();
        
        int hasil = jumlah(5, 10);
        System.out.println("Jumlah: " + hasil);
    }
}
