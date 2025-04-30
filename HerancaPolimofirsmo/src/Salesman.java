public final class Salesman extends Employee {
    private double percentPerSold;

    public Salesman(String code, String address, String name, int age, double salary, double percentPerSold) {
        super(code, address, name, age, salary);
        this.percentPerSold = percentPerSold;
    }

    public Salesman() {
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }
}
