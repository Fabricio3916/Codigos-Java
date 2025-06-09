import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 14));
        ninjas.add(new Ninja("Sasuke Uchiha", "Konoha", 47));
        ninjas.add(new Ninja("Sakura Haruno", "Konoha", 9));
        ninjas.add(new Ninja("Kakashi Hatake", "Konoha", 30));
        ninjas.add(new Ninja("Hinata Hyuga", "Konoha", 26));
        ninjas.add(new Ninja("Gaara", "Suna", 39));
        ninjas.add(new Ninja("Temari", "Suna", 57));

        //Filter - filtragem dos ninjas por vila
        ninjas.stream()
                .filter(ninja -> ninja.getVila().equals("Suna"))
                .forEach(System.out::println); //soutc

        //Sorted - Ordenação por idade
        ninjas.stream()
                .sorted((n1, n2) -> n1.getNome().compareTo(n2.getNome()))
                .forEach(System.out::println);

        // Map - mostrar e mapear um atributo
        ninjas.stream()
                .map(Ninja::getNome)
                .forEach(System.out::println);
        //Max - Filtrar por ninja mais velho

        Ninja ninjaMaisVelho = ninjas.stream()
                .max((n1,n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);

        System.out.println("ninjaMaisVelho = " + ninjaMaisVelho);


    }

}
