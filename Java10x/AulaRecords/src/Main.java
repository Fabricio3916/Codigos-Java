import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Ninja cadastro = new Ninja("Naruto", "naruto@gmail", 231241);

        NinjaRecord sasuke = new NinjaRecord("Sasuke Uchiha", "sasuke@email", 123123123);



        Stack<Object> ninjaStack = new Stack<>();
        ninjaStack.push(sasuke);
        ninjaStack.push(cadastro);
        System.out.println(ninjaStack.size());
        Stack<Object> ninjaStack2 = new Stack<>();
        ninjaStack2.pop();

    }
}
