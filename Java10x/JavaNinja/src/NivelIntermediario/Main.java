package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
       Uchiha sasuke = new Uchiha();
       sasuke.nome = "Sasuke Uchiha";
       sasuke.idade = 18;
       sasuke.aldeia = "Konoha";
       sasuke.ShariganAtivado();

       Uzumaki naruto = new Uzumaki();
       naruto.nome = "Naruto Uzumaki";
       naruto.idade = 17;
       naruto.aldeia = "Konoha";
       naruto.ModoSabioAtivado();

       Haruno sakura = new Haruno();
       sakura.nome = "Sakura Haruno";
       sakura.idade = 18;
       sakura.aldeia = "Konoha";
       sakura.ativarCura();

       Hyuga hinata = new Hyuga();
       hinata.nome = "Hinata Hyuga";
       hinata.idade = 16;
       hinata.aldeia = "Konoha";
       hinata.ativarByakugan();

       Boruto boruto = new Boruto();
       boruto.nome = "Boruto Hyuga Uzumaki";
       boruto.aldeia = "Aldeia da Folha";
       boruto.idade = 13;
       boruto.ativarJougan();
       boruto.ModoSabioAtivado();

    }
}
