package NivelIntermediario.InterfaceExemplo;

// Classe Sasuke que também implementa a interface Ninja
public class Sasuke implements Ninja {
    @Override
    public void usarJutsu() {
        System.out.println("Sasuke usa o Chidori!");
    }

    @Override
    public void seMover() {
        System.out.println("Sasuke se move com o Shunshin no Jutsu!");
    }
}