// MeiaEntrada.java
package Ingressos;

public final class MeiaEntrada extends Ingresso {

    public MeiaEntrada(double valor, String nomeFilme, boolean dublado) {
        super(valor, nomeFilme, dublado);
    }

    @Override
    public double getValor() {
        return valor / 2;
    }
}
