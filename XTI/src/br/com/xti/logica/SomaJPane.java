package br.com.xti.logica;
import javax.swing.JOptionPane;
public class SomaJPane {
    public static void main(String[] args){
        String um = JOptionPane.showInputDialog(null, "Digite o primeiro numero: ");
        String dois = JOptionPane.showInputDialog(null, "Digite o segundo numero: ");
        int umNum = Integer.parseInt(um);
        int doisNum = Integer.parseInt(dois);
        int resultado =  umNum + doisNum;

        JOptionPane.showMessageDialog(null, umNum + " + " +  doisNum + " = " + resultado);
    }
}
