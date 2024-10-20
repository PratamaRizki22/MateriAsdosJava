// public class Test {
//     public static void main(String[] args) {
//         int x = 8;
//         int y = 3;
//         int result = x % y;
//         System.out.println("Hasil: " + result);
//     }
// }

public class Test{
    static String PushUp(int Value){
    if(Value>=40){
        return "Good";
    } else if(Value>=20){
        return "Not Bad";
    }
    return "Bad";
    }

    public static void main(String[] args) {
        PushUp(50);
    }
}