package Fundamentos;

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva a base do retangulo:");
        int base = sc.nextInt();

        System.out.println("Escreva a altura do retangulo:");
        int altura = sc.nextInt();

        int area = base * altura;
        System.out.println("A area do retangulo é " + area + " metros");

    }
}
