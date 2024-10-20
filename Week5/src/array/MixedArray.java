package array;

public class MixedArray {
    public static void main(String[] args) {
        Object[] mixedArray = new Object[5];

        mixedArray[0] = "Java";
        mixedArray[1] = 100;
        mixedArray[2] = 45.67;
        mixedArray[3] = true;
        mixedArray[4] = 'A'; 

        for (int i = 0; i < mixedArray.length; i++) {
            System.out.println("Index " + i + ": " + mixedArray[i]);
        }
    }
}
