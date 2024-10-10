package implementasi;

import java.util.Scanner;

public class PemilihanMenu {
    
    public static void main(String[] args) {
        int pilih;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Menu Utama");
            System.out.println("1. Menu 1");
            System.out.println("2. Menu 2");
            System.out.println("3. Menu 3");
            System.out.println("4. Menu 4");
            System.out.println("5. Keluar");
            
            System.out.print("Pilih Menu: ");
            pilih= sc.nextInt();
            
            switch(pilih){
            case 1: 
                System.err.println("Menu 1 dipilih \n"); 
                break;
            case 2:
                System.err.println("Menu 2 dipilih \n");
                break;
            case 3:
                System.err.println("Menu 3 dipilih \n");
                break;
            case 4:
                System.err.println("Menu 4 dipilih \n");
                break;
            case 5:
                System.out.println("Keluar");
                break;
            default:
                System.err.println("Menu tidak ada");
        }
     
    }while (pilih!=5);
}
}
