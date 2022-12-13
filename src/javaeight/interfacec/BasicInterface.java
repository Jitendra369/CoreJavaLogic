package javaeight.interfacec;

import javaeight.Employee;

public interface BasicInterface {
    default Employee getEmployee(){
        System.out.println("first inteface");
        return new Employee("jittu", 12, false);
    }
    public void globalMessage();
}
