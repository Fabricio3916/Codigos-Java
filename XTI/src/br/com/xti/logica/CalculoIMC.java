
package br.com.xti.logica;
import javax.swing.JOptionPane;

public class CalculoIMC {
    public static void main(String[] args){
        String alturaCampo = JOptionPane.showInputDialog("Insira sua altura (M)");
        String pesoCampo   = JOptionPane.showInputDialog("Insira seu peso (KG)");

        double altura = Double.parseDouble(alturaCampo);
        double peso = Double.parseDouble(pesoCampo);
        double imc = peso / (altura * altura);

        if(imc < 18.5){
            JOptionPane.showMessageDialog(null,"IMC: Magreza, "+ imc);
        }
        else if(imc >= 18.5 && imc <= 24.9){
            JOptionPane.showMessageDialog(null,"IMC: Normal, "+ imc);
        }
        else if(imc >= 25 && imc < 29.9){
            JOptionPane.showMessageDialog(null,"IMC: Sobrepeso, "+ imc);
        }
        else if(imc >= 30 && imc <= 39.9){
            JOptionPane.showMessageDialog(null,"IMC: Obesidade, "+ imc);
        }
        else {
            JOptionPane.showMessageDialog(null, "IMC: Obesidade Grave, " + imc);
        }

    }
}

