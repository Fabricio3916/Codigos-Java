import functionalities.*;

public class Iphone  implements AparelhoTelefonico, ReprodutorMusical, NavegadorWeb {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {

    }

    @Override
    public void exibirPagina() {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPAgina() {

    }

    @Override
    public void tocar() {

    }

    @Override
    public void pauser() {

    }

    @Override
    public void selecionarMusica(String musica) {

    }
}
