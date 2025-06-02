import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Ninja> listDeNinjas = new LinkedList<>();

        listDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Temari", 18, "Areia"));

        for (Ninja ninjas : listDeNinjas){
            System.out.println(ninjas);
        }

        System.out.println("---------------------------------");
        listDeNinjas.addFirst(new Ninja("Tobirama Senhu",45,"Konoha"));


        for (Ninja ninjas : listDeNinjas){
            System.out.println(ninjas);
        }

        listDeNinjas.add(3, new Ninja("Boruto Uzumaki" , 14, "Konoha"));

        System.out.println("---------------------------------");

        for (Ninja ninjas : listDeNinjas){
            System.out.println(ninjas);
        }

    }




}
