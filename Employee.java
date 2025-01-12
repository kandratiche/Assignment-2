public class Employee extends Person {
    private String pos;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.pos = pos;
        this.salary = salary;
    }

    public String getPosition() {
        return pos;
    }

    public void setPosition(String position) {
        this.pos = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
