package aulaarrays;

import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int quantNumeros;
        int numero;
        int quantPares=0, quantImpares = 0;

        System.out.println("quantidade de numeros: ");
        quantNumeros = scan.nextInt();

        int count=0;
        do {
            System.out.println("numero : ");
            numero = scan.nextInt();

            if (numero% 2== 0 ) quantPares++;
            else quantImpares++;

            count ++;
        } while (count< quantNumeros);
        System.out.println("pares quant :"+ quantPares);
        System.out.println("impar  quant :" + quantImpares);

    }
}