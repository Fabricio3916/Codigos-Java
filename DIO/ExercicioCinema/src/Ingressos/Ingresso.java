package Ingressos;

public sealed abstract class Ingresso permits MeiaEntrada, Familia, IngressoPadrao {
    protected double valor;
    protected String nomeFilme;
    protected boolean dublado;

    public Ingresso(double valor, String nomeFilme, boolean dublado) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dublado = dublado;
    }

    public abstract double getValor();

    public void exibirInformacoes() {
        System.out.println("Filme: " + nomeFilme);
        System.out.println("Tipo: " + (dublado ? "Dublado" : "Legendado"));
        System.out.printf("Valor final: R$ %.2f%n", getValor());
    }
}