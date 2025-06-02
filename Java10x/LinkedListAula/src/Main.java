import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();


        linkedList.add("Naruto");
        linkedList.add("Sasuke");
        linkedList.add("Sakura");

        System.out.println("linkedList = " + linkedList);

        linkedList.add(1,"Kakashi");

        System.out.println("linkedList = " + linkedList);

        linkedList.remove(2);
        System.out.println("linkedList = " + linkedList);




    }

}
