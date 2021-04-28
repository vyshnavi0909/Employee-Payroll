import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public  enum IOService{CONSOLE_TO, FILE_IO, REST_IO};
    public List<EmployeePayroll> employeePayrollList;
    public EmployeePayrollService() {
        this.employeePayrollList = new ArrayList<>();
    }

    public static void main(String[] args) {

        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        employeePayrollService.readingData();
        employeePayrollService.writingData();
    }

    private void writingData() {
        System.out.println(employeePayrollList);
    }

    private void readingData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int id = input.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = input.next();
        System.out.println("Enter Employee Salary: ");
        int salary = input.nextInt();
        employeePayrollList.add(new EmployeePayroll(id, name, salary));
    }
}
