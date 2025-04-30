package Ingressos;

public final class IngressoPadrao extends Ingresso {

    public IngressoPadrao(double valor, String nomeFilme, boolean dublado) {
        super(valor, nomeFilme, dublado);
    }

    @Override
    public double getValor() {
        return valor;
    }
}