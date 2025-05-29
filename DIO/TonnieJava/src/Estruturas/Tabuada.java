package Estruturas;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero que deseja retornar a tabuada:");
        int entrada = sc.nextInt();

        for (int i = 0; i <= 10 ; i++) {
            int resultado = entrada * i;
            System.out.println(entrada + " vezes " + i + " = " + resultado);
        }

        sc.close();
    }
}
