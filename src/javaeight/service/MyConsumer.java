package javaeight.service;
import javaeight.Employee;
import java.util.function.Consumer;

public class MyConsumer implements Consumer<Employee> {

    @Override
    public void accept(Employee employee) {
        System.out.println(employee.getName());
    }
}
