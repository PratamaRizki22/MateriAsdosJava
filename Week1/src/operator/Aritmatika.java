package operator;

public class Aritmatika {
    public static void main(String[] args) {
        double a=100;
        double b=10.11111;
        double pertambahan=a+b;
        double pengurangan=a-b;
        double perkalian=a*b;
        double pembagian = a / b;
        double modulus = a % b;
        double increment = a++;
        double decrement = a--;
        double pagkat = Math.pow(a, b);
        
        String lokasi ="Semarang";
        String cuaca =" hujan";
        
        String cuacaWilayah=lokasi+cuaca;

        
        System.out.println(pertambahan);
        System.out.println(pengurangan);
        System.out.println(perkalian);
        System.out.println(pembagian);
        System.out.println(modulus);
        System.out.println(increment);
        System.out.println(decrement);
        System.out.println(pagkat);
        System.out.println(cuacaWilayah);



    }
    
}