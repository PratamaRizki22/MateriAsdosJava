package implementasi;

public class SegitigaSiku {
    public static void main(String[] args) {
        int N=6;
        
        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
