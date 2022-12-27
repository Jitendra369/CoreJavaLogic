package interview.one;


import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Employee> employeList = EmployeService.getEmployeList();
        List<Employee> empAge = employeList.stream().filter(employee -> employee.getAge() == 30).collect(Collectors.toList());
//        empAge.stream().forEach(System.out::println);
        List<Employee> collect = empAge.stream().filter(employee -> employee.getAge() > 30).collect(Collectors.toList());
        employeList.stream().map(employee -> employee.getDept()).distinct().forEach(System.out::println);

        employeList.stream().map(employee -> employee.getName()).forEach(System.out::println);

    }
}
