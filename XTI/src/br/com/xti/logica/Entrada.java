package br.com.xti.logica;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args){
        String nome;

        Scanner s = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        nome = s.nextLine();
        System.out.println("Vai tomar no cu senhor " + nome);
    }

}
