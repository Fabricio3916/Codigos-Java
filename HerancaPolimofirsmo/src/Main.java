//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        printEmployee(new Manager());
        printEmployee(new Salesman());
        Employee employee = new Employee();



    }

    public static void printEmployee(Employee employee){

        System.out.printf("=======%s=======\n", employee.getClass().getCanonicalName());


        switch(employee){
            case Manager manager->{
                manager.setLogin("joao");
                manager.setPassword("123456");
                employee.setName("João");
                employee.setSalary(5000);

                System.out.println(employee.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
            }
            case Salesman salesman ->{
                salesman.setCode("123");
                employee.setName("João");
                employee.setSalary(5000);

                System.out.println(employee.getName());
            }
            }


        System.out.println("===============");

    }

}