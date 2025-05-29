package Estruturas;

import java.util.Locale;
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double altura = 0;
        double peso = 0;

        
        System.out.println("Digite sua altura: ");
        altura = scanner.nextDouble();
        System.out.println("Digite seu peso");
        peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if(imc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9 ) {
            System.out.println("Peso ideal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35 && imc <= 39.9 ) {
            System.out.println("Obesidade Grau II");
        } else if (imc > 40) {
            System.out.println("Obersidade III");
        }

        scanner.close();
    }

}
