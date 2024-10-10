package perulangan;

public class NestedLoop {
    public static void main(String[] args){
        int JumlahBaris = 3;
        int JumlahKolom=4;
        
        for(int i=0; i<=JumlahBaris; i++){
            for(int j=0; j<=JumlahKolom; j++){
                System.out.println("["+i+","+j+"]");
            }
            System.out.println();
        }
    }
}
