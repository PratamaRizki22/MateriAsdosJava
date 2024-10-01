package method;

import java.util.Scanner;

public class Method {
    Scanner scanner = new Scanner(System.in);

    static String perkenalan(String nama, int umur, String alamat) {
        return "Perkenalkan, nama saya " + nama + ", umur saya " + umur + " tahun, alamat saya " + alamat;        
    }
    
    String tanpaStatic(){
        
        String a="nama: ";
        String name = scanner.nextLine();
        String b=name;
        
        return a+b;
    }
    
    
    static int saldo(int jumlah) {
        return jumlah;
    }
    
    static String alamat() {
        return "Semarang, Jalan 123, Kabupaten 123";
    }
    
    static int tambahSaldo(int saldo, int jumlah) {
        return saldo + jumlah;
    }
    
    static int tarikSaldo(int saldo, int jumlah) {
        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi untuk menarik " + jumlah);
            return saldo;
        }
        return saldo - jumlah;
    }
    
    //tanpa return
    static void tampilkanSaldo(int saldo) {
        System.out.println("Saldo saat ini: " + saldo);
    }

    public static void main(String[] args) {
        String perkenalan = perkenalan("Jojo", 56, alamat());
        System.out.println(perkenalan);
        
        int saldoAwal = saldo(1000);
        tampilkanSaldo(saldoAwal);
        
        saldoAwal = tambahSaldo(saldoAwal, 500);
        System.out.println("Setelah menambah 500:");
        tampilkanSaldo(saldoAwal);
        
        saldoAwal = tarikSaldo(saldoAwal, 300);
        System.out.println("Setelah menarik 300:");
        tampilkanSaldo(saldoAwal);
        
        saldoAwal = tarikSaldo(saldoAwal, 1500);
        System.out.println("Setelah mencoba menarik 1500:");
        tampilkanSaldo(saldoAwal);
        
        //tanpa static
        Method method=new Method();
        method.tanpaStatic();
    }
                
}
