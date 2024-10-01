package variabelDanTipeData;

public class Variable {
    static String varGlobal="Ini variabel global";  //nempel pada kelas
    String varNonStatic="Ini juga global tapi non static"; // harus manggil kelasnya dulu
    
    public static void main(String[] args) {
        // semua fungsi dalam main ini disebut variabel local
        var testInt= 10; 
        var testString="123";
       
        //int
        byte byteExample=12;
        short shortExample=12;
        int intExample=1;
        long longExample=1;
        //floating
        float floatExample=1;
        double doubleExample=1;
        
        //char=>unicode suatu simbol atau suatu bahasa.
        char charExample='\u00A5';  //unicode yen
        //string
        String stringExampe="joko";
        //boolean
        boolean booleanExample=true;
        
        System.out.println(testInt);
        System.out.println(testString);
        System.out.println(byteExample);
        System.out.println(shortExample);
        System.out.println(intExample);
        System.out.println(longExample);
        System.out.println(floatExample);
        System.out.println(doubleExample);
        System.out.println(charExample);
        System.out.println(stringExampe);
        System.out.println(booleanExample);
        System.out.println(varGlobal);
        
        Variable variable=new Variable();
        System.out.println(variable.varNonStatic);
                
        
    }  
}
