package Desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        int tipoNinja = 0;
        while(opcao != 4){
            System.out.println("\n=====Menu de Opções=====");
            System.out.println("1. Cadastre o ninja");
            System.out.println("2. Exibir informação de todos os ninjas");
            System.out.println("3. Atualizar habilidade especial");
            System.out.println("4. Sair do Programa");
            sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Escolha o tipo de ninja para cadastrar");

                    switch (tipoNinja){
                        case 1:
                            Uchiha ninja = new Uchiha();
                    }
                    System.out.println("1. ");
            }


        }

    }
}
