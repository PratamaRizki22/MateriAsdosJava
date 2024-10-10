package IfElse;

import java.util.Scanner;

public class HitungNilai {
    static String perhitungan(int nilai){
        if(nilai>80 && nilai <100){
            return "A";
        } else if(nilai>60 && nilai <100){
            return "B";
        } else if(nilai>40 && nilai < 100){
            return "c";
        } else if(nilai >20 && nilai <100){
            return "D";
        } else if (nilai >0 && nilai <100){
            return "E";
        } else{
            return "nilai salah";
        }
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inputkan nilai anda: ");
        int nilai=scanner.nextInt();
        String nilaiSaya=perhitungan(nilai);
        
        System.out.println(nilaiSaya);
    }
}
