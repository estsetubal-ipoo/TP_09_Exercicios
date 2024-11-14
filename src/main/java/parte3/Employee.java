package parte3;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        if(salary < 0) throw new IllegalArgumentException("Salary cannot be < 0.");

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setSalary(int salary) {
        if(salary < 0) throw new IllegalArgumentException("Salary cannot be < 0.");

        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        if(percent < 0) throw new IllegalArgumentException("Percent cannot be < 0.");

        salary = (int)(salary * (1 + percent/100.0));

        return salary;
    }

    public String toString() {
        return String.format("Employee[id=%d, name=%s, salary=%d]",
                id, getName(), salary);
    }
}
