package DeklarasiArray;

public class MengisidanMembaca {
    public static void main(String[] args) {
        int[] DeretPositif= new int[5];
        
        DeretPositif[0]=0;
        DeretPositif[1]=10;
        DeretPositif[2]=20;
        DeretPositif[3]=30;
        DeretPositif[4]=40;
        
//        System.err.println("Indeks ke-0 :" + DeretPositif[0]);
//        System.err.println("Indeks ke-1 :" + DeretPositif[1]);
//        System.err.println("Indeks ke-2 :" + DeretPositif[2]);
//        System.err.println("Indeks ke-3 :" + DeretPositif[3]);
//        System.err.println("Indeks ke-4 :" + DeretPositif[0]);
        
        
        System.out.println("\nPangkat2 \n");
        for (int i = 0; i < DeretPositif.length; i++) {
            DeretPositif[i] = (int) Math.pow(DeretPositif[i], 2);
        }

        for (int value : DeretPositif) {
            System.out.println(value);
        }
    }
        
    }
    
    
            
}
