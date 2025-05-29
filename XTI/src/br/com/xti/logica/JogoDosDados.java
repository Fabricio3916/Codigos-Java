package br.com.xti.logica;
import javax.swing.JOptionPane;
import java.util.Random;

public class JogoDosDados {
    //Jogo de advinhação
    public static void main(String[] args) {
        while(true) { //loop de repetição infinito para o jogo rodar de forma fluida
            Random r = new Random(); // função que cria objeto random
            int valorDado = r.nextInt(6) + 1; // valor do dado que é selecionado aleatoriamente graças a classe random

            String palpite = JOptionPane.showInputDialog(null, "De o seu palpite!"); // caixa de mensagem para o usuario escolher o palpite
            System.out.println("Valor do dado: " + valorDado); //exibir valor do dado no console para fins de teste
            System.out.println("Valor do palpite: " + Integer.parseInt(palpite));  //exibir valor do palpite no console para fins de teste
            System.out.println(" "); // espaçamento para melhorar formatação de msg no console
            if (valorDado == Integer.parseInt(palpite)) { // condição para verificar se o palpite e o valor do dado sao iguais
                JOptionPane.showMessageDialog(null, "Acertou!");// condição de acerto
            } else {
                JOptionPane.showMessageDialog(null, "Errou!"); // condição de erro
            }
        }
    }


}
