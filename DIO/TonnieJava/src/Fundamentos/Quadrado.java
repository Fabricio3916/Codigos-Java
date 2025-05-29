package Fundamentos;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o lado do quadrado:");
        int lado = sc.nextInt();
        int area = lado * lado;

        System.out.println("A área do quadrado é " + area +" metros");
        sc.close();

    }

}
