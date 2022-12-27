package javaeight.streamapi;

import interview.one.Employee;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("jitendra", 30, "male", "IT"));
        employeeList.add(new Employee("pooja", 30, "male", "Bank"));
        employeeList.add(new Employee("neetu", 30, "male", "Bank"));
        employeeList.add(new Employee("ratna", 30, "male", "Managment"));

//        System.out.println(employeeList.stream().distinct());
        List<Integer> integerList = List.of(2, 4, 5, 7, 8);

        List<Integer> intList = new ArrayList<>();
        intList.add(47);
        intList.add(14);
        intList.add(45);
        intList.add(74);
        intList.add(78);

//        List<Integer> newListA = Arrays.asList(12, 45, 78, 41, 47);

//        regular method
        List<Integer> listEven = new ArrayList<>();
        for(Integer i : integerList){
            if (i%2==0){
                listEven.add(i);
            }
        }
        System.out.println(listEven);

//        Method 2:
        integerList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if (integer%2==0){
                    System.out.println(integer);
                }
            }
        });

//        using streaAPI
        Stream<Integer> stream = integerList.stream();
        List<Integer> newList = stream.filter(value -> value % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);

//        TODO: stream supplier
//        https://www.baeldung.com/java-stream-operated-upon-or-closed-exception
        Stream<Integer> stream2 = integerList.stream();
        List<Integer> newListGreaterThan = stream2.filter(value -> value > 10).collect(Collectors.toList());
        System.out.println(newListGreaterThan);


    }
}
