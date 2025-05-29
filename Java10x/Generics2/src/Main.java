public class Main {

    public static void main(String[] args) {
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramentas(new Kunai("Kunai Explosiva"));
        bolsaNinja.adicionarFerramentas(new Shuriken(3));
        bolsaNinja.adicionarFerramentas(new Pergaminho("Invocação do Sapo"));
        bolsaNinja.adicionarFerramentas(new Pergaminho("Invocação da Aguia"));

        System.out.println("Itens da bolsa ninja:");
        bolsaNinja.mostrarFerramentas();



    }

}
