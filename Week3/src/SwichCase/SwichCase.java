import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka (1-5) untuk hari: ");
        int hari = scanner.nextInt();
        
        switch (hari) {
            case 1:
                System.out.println("Hari pertama adalah Senin.");
                break; //menghentikan program ketika case sesuai
            case 2:
                System.out.println("Hari kedua adalah Selasa.");
                break;
            case 3:
                System.out.println("Hari ketiga adalah Rabu.");
                break;
            case 4:
                System.out.println("Hari keempat adalah Kamis.");
                break;
            case 5:
                System.out.println("Hari kelima adalah Jumat.");
                break;
            default: // jalan ketika tidak ada case yang sesuai
                System.out.println("Masukkan angka tidak valid.");
                break;
        }
        
        scanner.close();
    }
}
