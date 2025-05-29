package Desafio2;

import java.util.Scanner;

public class CadastroNinja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        int index = 0;
        int limite = 10;
        String[] ninjas = new String[limite];


        while(opcao != 4){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar Ninja");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    if (index < limite){
                        System.out.println("Digite o nome do ninja:");
                        String nomeNinja = sc.nextLine();
                        ninjas[index] = nomeNinja;
                        index++;

                    } else {
                        System.out.println("a lista esta cheia");
                    }
                    break;

                case 2:
                    if(index == 0){
                        System.out.println("Nenhum ninja cadastrado");
                    }else {
                        for (int i = 0; i < index; i++) {
                            System.out.println(ninjas[i]);
                        }
                        break;
                    }
                case 3:
                    System.out.println("");
                case 4:
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        }


    }
}
