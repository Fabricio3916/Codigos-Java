public class Main {
    public static void main(String[] args) {
        var male = new Person();
        male.name = "João";
        male.age = 12;
        var female = new Person();
        female.age = 15;
        female.name = "Maria";

        System.out.println("Male name: " + male.name);

    }
}