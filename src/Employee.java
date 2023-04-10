
public class Employee {
    private String name;
    private int department;
    private double salary;
    private static int id = 101;
    private int idEmployeer;

    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.idEmployeer = id++;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getIdEmployeer() {
        return idEmployeer;
    }

    public String toString() {
        return "Ф.И.О.: " + this.name + ", Отдел: " + this.department + ", Зарплата: " + this.salary + ", ID: " + this.idEmployeer;
    }
}
