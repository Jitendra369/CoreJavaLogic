package javaeight.service;

import javaeight.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeService {

    public static List<Employee> createEmployee(){
        Employee employee1 = new Employee("jitendra",23,true);
        Employee employee2 = new Employee("pooja",20,true);
        Employee employee3 = new Employee("neetu",26,true);
        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        return list;
    }

    public List<Employee> getEmployee(){
        return createEmployee();
    }
}
