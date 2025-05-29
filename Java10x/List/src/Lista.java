import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        //Arrays não podem alterar de tamanho
        String[] ninjaArray = new String[3];
        ninjaArray[0] = "Naruto";
        ninjaArray[1] = "Sasuke";
        ninjaArray[2] = "Sakura";

        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");
        ninjasList.add("Kakashi Hatake");

        System.out.println("NinjasList = " + ninjasList);
        
        ninjasList.remove("Kakashi Hatake");
        System.out.println("ninjasList = " + ninjasList);
        
        ninjasList.set(3,"Hashirama Senju");
        System.out.println("ninjasList = " + ninjasList);

        System.out.println("ninjasList.size() = " + ninjasList.size());

        System.out.println("ninjasList = " + ninjasList.get(8));


    }

}
