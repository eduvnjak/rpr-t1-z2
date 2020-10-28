package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesi n: ");
        int n = ulaz.nextInt();
        for (int i = 1; i < n; i++) {
            if(i % sumaCifara(i) == 0 ) System.out.println(i);
        }
        /*for (int i = 167; i < 172 ; i++) {
            System.out.println("Broj i: " + i + " Suma cifara: " + sumaCifara(i));
        }*/
    }

    private static int sumaCifara(int i) {
        if(i < 0) i = -i;
        int suma = 0;
        while (i != 0){
            suma += i % 10;
            i /= 10;
        }
        return suma;
    }
}
