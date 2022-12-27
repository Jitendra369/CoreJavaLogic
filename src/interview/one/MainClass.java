package interview.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

//model clas
public class MainClass {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("jitendra", 30, "male", "IT"));
        employeeList.add(new Employee("pooja", 45, "Female", "Bank"));
        employeeList.add(new Employee("neetu", 45, "male", "Bank"));
        employeeList.add(new Employee("ratna", 14, "male", "Managment"));

//        print only distinct department
//        employeeList.forEach(new Consumer<Employee>() {
//            @Override
//            public void accept(Employee employee) {
//                employee.getDept();
//            }
//        });

        employeeList.stream().map(Employee::getDept).distinct().forEach(System.out::println);
//       printing the name of employee whoes name is "jitendra"
        List<String> trueEmploye = employeeList.stream().map(employee -> employee.getName()).filter(employe -> employe.equals("jitendra")).collect(Collectors.toList());
        System.out.println(trueEmploye);

//        count the employe in each department
        Map<String, Long> collectDeptEmp = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
        System.out.println(collectDeptEmp);

//        average age of male & female
        Map<String, Double> MaleFemalAgeAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(MaleFemalAgeAge);
    }

}
