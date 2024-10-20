package DeklarasiArray;

public class DeklarasiArray {
    public static void main(String[] args) {
        //deklarasi array dengan total panjang 10 dimulai dari index 0
        int[] deretGenap= new int[10];
        
        char[] kalimat= new char[100];
        double[] deretDecimal= new double[5];
        
        deretGenap[0]= 10;
        deretGenap[1]=11;
        System.out.println(deretGenap[0]);
        
        //deklarasi dan menulis langsung isi dari aray
        int[] deklarasiLangsung= new int[]{1,2,3,4,5 };
        
        for(int i =0; i< deklarasiLangsung.length; i++){
            System.out.println(i+": "+deklarasiLangsung[i]);
        }
        
        for(int i = deklarasiLangsung.length - 1; i >= 0; i--) {
            System.out.println(i + ": " + deklarasiLangsung[i]);
        }

    }
}
