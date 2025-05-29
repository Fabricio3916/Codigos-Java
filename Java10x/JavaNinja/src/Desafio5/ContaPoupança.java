package Desafio5;

public class ContaPoupança extends ContaBancaria{


    public ContaPoupança(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        double valorDescontado = valor * 0.99;
        super.saldo -= valorDescontado;
        System.out.println("O valor depositado na sua conta foi de: " + valorDescontado );
    }
}
