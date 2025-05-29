package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adcionarEquipamentos(kunai);
        bolsaGenerica.adcionarEquipamentos(shuriken);
        bolsaGenerica.adcionarEquipamentos(pergaminho);

        System.out.println(bolsaGenerica);
    }
}
