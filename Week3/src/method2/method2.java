package method2;

public class method2 {
    
    static void tampilkanPesan() {
        System.out.println("Halo, selamat datang di program Java!");
    }
    
    static int jumlah(int a, int b) {
        return a + b;
    }
    // buat method bagi, kali, kurang
    static int bagi(int a, int b){
        return a/b;
    }
  
    static int kali(int a, int b){
        return a*b;
    }
    
    static int kurang(int a, int b){
        return a-b;
    }
    public static void main(String[] args) {
        tampilkanPesan();
        
        int bagi=bagi(4, 2);
        int kali= kali(2, 5);
        int kurang = kurang(10, 3);
        int tambah = jumlah(5, 10);
        System.out.println("a+b: " + tambah);
        System.out.println("a/b: " + bagi);
        System.out.println("a-b: " + kurang);
        System.out.println("a*b: " + kali);        
    }
}
