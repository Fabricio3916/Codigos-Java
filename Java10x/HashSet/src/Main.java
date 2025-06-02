import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<String> aldeias = new HashSet<>();

        // Adicionando aldeias
        aldeias.add("Konoha");
        aldeias.add("Suna");
        aldeias.add("Kiri");
        aldeias.add("Mizu"); // Tentativa de duplicata


        // Exibindo as aldeias
        System.out.println("Aldeias participantes:");
        for (String aldeia : aldeias) {
            System.out.println(aldeia);
        }

        // Verificando se uma aldeia está presente
        System.out.println("Konoha está no torneio? " + aldeias.contains("Konoha"));

        // Removendo uma aldeia
        aldeias.remove("Kiri");
        System.out.println("Após remover Kiri: " + aldeias);

        // LinkedHashSet: Ordem de inserção
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Naruto");
        linkedHashSet.add("Sasuke");
        linkedHashSet.add("Sakura");
        linkedHashSet.add("Kakashi");

        System.out.println("LinkedHashSet (Ordem de Inserção):");
        System.out.println(linkedHashSet);

        // TreeSet: Ordem natural
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Naruto");
        treeSet.add("Sasuke");
        treeSet.add("Sakura");
        treeSet.add("Kakashi");

        System.out.println("\nTreeSet (Ordem Natural):");
        System.out.println(treeSet);

    }
}