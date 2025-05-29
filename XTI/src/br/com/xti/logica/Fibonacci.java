package br.com.xti.logica;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        int proximo = 1;
        int anterior = 0;
        System.out.println(anterior);
        while (proximo < 100){
            System.out.println(proximo);
            proximo = proximo + anterior;
            anterior = proximo - anterior;



        }
    }
}
