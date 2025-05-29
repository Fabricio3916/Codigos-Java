package Desafio3;

public class Uchiha extends Ninja {

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("Minha habilidade especial é o " + habilidadeEspecial);
    }


    public void mostrarInformacoes(){
        System.out.println("Meu nome é " + nome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha missão é " + missao);
        System.out.println("e o status dela esta" + statusMissao);
        mostrarHabilidadeEspecial();
    }
}
