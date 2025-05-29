public class Main {

    public static void main(String[] args) {
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarEquipamentos(new Kunai("Kunai come cu do Gabriel Henrique Nosfa Nosf"));
        bolsaNinja.adicionarEquipamentos(new Shuriken("Shuriken come cu do Mushin"));
        bolsaNinja.adicionarEquipamentos(new Pergaminho("Aquele que leu comeu cu do mushin"));

        System.out.println("Equipamentos que comeram cu do mushin");
        System.out.println("-------------------------------------");
        bolsaNinja.mostrarEquipamentos();

        bolsaNinja.adicionarEquipamentos(new Pergaminho("Proibido namorar com age gap de 13 anos uma menor de idade"));

        bolsaNinja.mostrarEquipamentos();

    }

}
