public sealed abstract class Employee permits Manager, Salesman{

    private String code;
    private String address;
    private String name;
    private int age;
    private double salary;


    public Employee(String code, String address, String name, int age, double salary) {
        this.code = code;
        this.address = address;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
