package operator;

public class Logika {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean andResult = a && b;
        System.out.println("a && b: " + andResult); 

        
        boolean orResult = a || b;
        System.out.println("a || b: " + orResult); 

        boolean xorResult = a ^ b;
        System.out.println("a ^ b: " + xorResult);

        boolean notResultA = !a;
        boolean notResultB = !b;
        System.out.println("!a: " + notResultA);
        System.out.println("!b: " + notResultB);
    }
}

            