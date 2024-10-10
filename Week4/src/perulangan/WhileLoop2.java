package perulangan;

public class WhileLoop2 {
    public static void main(String[] args) {
        int a=8, b=2;
        while(a>b){
            System.out.println("Nilai a: "+a);
            a-=b;
        }  
    }
}