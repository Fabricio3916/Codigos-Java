package Ingressos;

public class TesteCinema {
    public static void main(String[] args) {
        IngressoPadrao ingressoPadrao = new IngressoPadrao(30.0, "Matrix", true);
        MeiaEntrada meiaEntrada = new MeiaEntrada(30.0, "Matrix", true);
        Familia ingressoFamilia1 = new Familia(3, 30.0, "Matrix", true);
        Familia ingressoFamilia2 = new Familia(5, 30.0, "Matrix", false);

        System.out.println("=== Ingresso Padrão ===");
        ingressoPadrao.exibirInformacoes();

        System.out.println("\n=== Meia Entrada ===");
        meiaEntrada.exibirInformacoes();

        System.out.println("\n=== Ingresso Família (3 pessoas) ===");
        ingressoFamilia1.exibirInformacoes();

        System.out.println("\n=== Ingresso Família (5 pessoas, com desconto) ===");
        ingressoFamilia2.exibirInformacoes();
    }
}
