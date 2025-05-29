package Desafio5;

public abstract class ContaBancaria implements Conta{

    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public abstract void depositar(double valor);

    public void consultarSaldo(){
        System.out.println("O seu saldo é de " + saldo + " Reais");
    }

}
