package Desafio5;

public class BancoKonoha {
    public static void main(String[] args) {
        ContaBancaria contaSasuke = new ContaCorrente(100);
        ContaBancaria contaNaruto = new ContaPoupança(10);

        contaSasuke.consultarSaldo();
        contaSasuke.depositar(20);
        contaSasuke.consultarSaldo();


    }
}
