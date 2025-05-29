package br.com.xti.logica;
import javax.swing.JOptionPane;

public class exemploSwitch {
    public static void main(String[] args){
        while(true) {
            String sexo = JOptionPane.showInputDialog(null, "Qual seu genero?");
            switch (sexo) {
                case "M":
                    JOptionPane.showMessageDialog(null, "Homem");
                    break;
                case "F":
                    JOptionPane.showMessageDialog(null, "Mulher");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Outro");
                    break;
            }
        }
    }
}
