import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EmployeePayrollServiceTest {
    @Test
    public void given3Employees_WhenWriitenToFile_ShouldMatchEmployeeEntries() {
        EmployeePayroll[] arrayOfEmployees = {
                new EmployeePayroll(1, "Babbur Vyshnavi", 400000.00),
                new EmployeePayroll(2, "Akshar Patel", 200000.00),
                new EmployeePayroll(3, "Mahesh Mahi", 300000.00)
        };
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmployees));
        employeePayrollService.writingData(EmployeePayrollService.IOService.FILE_IO);

        long entries = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assertions.assertEquals(3, entries);
    }
}
