package operator;

/**
 *
 * @author dominepa
 */
public class Bitwise {
    public static void main(String[] args) {
        int a = 60;  // 0011 1100
        int b = 13;  // 0000 1101

        // AND bitwise
        int andResult = a & b;
        System.out.println("a & b: " + andResult);

        // OR bitwise
        int orResult = a | b;
        System.out.println("a | b: " + orResult);

        // XOR bitwise
        int xorResult = a ^ b;
        System.out.println("a ^ b: " + xorResult); 

        // NOT bitwise
        int notResult = ~a;
        System.out.println("~a: " + notResult); 

        // Shift kanan
        int rightShiftResult = a >> 2;
        System.out.println("a >> 2: " + rightShiftResult);

        // Shift kiri
        int leftShiftResult = a << 2;
        System.out.println("a << 2: " + leftShiftResult); // Output: 240=>1111 0000

        // Shift kanan tanpa tanda
        int unsignedRightShiftResult = a >>> 2;
        System.out.println("a >>> 2: " + unsignedRightShiftResult); // Output: 15=>0000 1111
    }
}