// Familia.java
package Ingressos;

public final class Familia extends Ingresso {
    private int numeroDePessoasNaFamilia;

    public Familia(int numeroDePessoasNaFamilia, double valor, String nomeFilme, boolean dublado) {
        super(valor, nomeFilme, dublado);
        this.numeroDePessoasNaFamilia = numeroDePessoasNaFamilia;
    }

    @Override
    public double getValor() {
        double total = valor * numeroDePessoasNaFamilia;
        if (numeroDePessoasNaFamilia > 3) {
            total *= 0.95; // desconto de 5%
        }
        return total;
    }
}
