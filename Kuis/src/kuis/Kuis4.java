public class Test{
    public static void main(String[] args){
        boolean x = true;
        boolean y = false;

        boolean c= (x|| y) ||(!x && y);
        System.out.println("Nilai C: "+c);
    }
}