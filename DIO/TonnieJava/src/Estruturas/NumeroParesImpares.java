package Estruturas;

import java.util.Locale;
import java.util.Scanner;

public class NumeroParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Entre com o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Entre com o segundo numero: ");
        int segundoNumero = scanner.nextInt();

        if (segundoNumero < primeiroNumero){
            System.out.println("O primeiro numero é maior que o segundo");
        }else{
            System.out.println("Escolha uma opção:");
            System.out.println("1. Par");
            System.out.println("2. Impar");

            int opcao = scanner.nextInt();

            switch (opcao){
                case 1 -> {
                    for (int i = segundoNumero ; i >= primeiroNumero  ; i--) {
                        if(i % 2 == 0){
                            System.out.println(i);
                        }
                    }
                }
                case 2 ->{
                    for (int i = segundoNumero ; i >= primeiroNumero  ; i--) {
                        if(i % 2 != 0){
                            System.out.println(i);
                        }
                    }
                }
                default -> System.out.println("Opção Invalida");

            }
        }

    }
}
