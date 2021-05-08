public class EmployeePayroll {

    private int id;
    private String name;
    private double salary;

    public EmployeePayroll(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "Employee ID: " + id + ", Name: " + name + ", Salary: Rs." + salary + "/-";
    }
}
