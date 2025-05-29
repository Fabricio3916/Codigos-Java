package Fundamentos;

import java.util.Scanner;

public class DiferençaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = sc.nextInt();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = sc.nextInt();

        int diferenca = Math.abs(idade1 - idade2);

        System.out.println("A diferença de idade é de " + diferenca + " anos.");

        sc.close();
    }
}
