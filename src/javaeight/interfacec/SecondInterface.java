package javaeight.interfacec;

import javaeight.Employee;

public interface SecondInterface {
    default Employee getEmployee(){
        System.out.println("second inteface");
        return new Employee("jittu", 12, false);
    }
}
