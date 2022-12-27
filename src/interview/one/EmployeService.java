package interview.one;

import java.util.ArrayList;
import java.util.List;

public class EmployeService {

    public static List<Employee> getEmployeList(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("jitendra", 30, "male", "IT"));
        employeeList.add(new Employee("pooja", 30, "male", "Bank"));
        employeeList.add(new Employee("neetu", 30, "male", "Bank"));
        employeeList.add(new Employee("ratna", 30, "male", "Managment"));
        return  employeeList;
    }

}
