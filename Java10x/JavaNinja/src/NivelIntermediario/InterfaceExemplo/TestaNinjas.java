package NivelIntermediario.InterfaceExemplo;

// Classe principal para testar a implementação das interfaces
public class TestaNinjas {
    public static void main(String[] args) {
        Ninja naruto = new Naruto();
        Ninja sasuke = new Sasuke();

        // Testando as técnicas dos ninjas
        naruto.usarJutsu();
        naruto.seMover();

        sasuke.usarJutsu();
        sasuke.seMover();
    }
}
