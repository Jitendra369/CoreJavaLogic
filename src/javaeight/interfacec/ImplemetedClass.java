package javaeight.interfacec;

import javaeight.Employee;

public class ImplemetedClass implements  BasicInterface, SecondInterface{
    @Override
    public Employee getEmployee() {
        return BasicInterface.super.getEmployee();
    }

    @Override
    public void globalMessage() {

    }

    public void classInfor(){
        System.out.println("this is ImplemetedClass");
    }
}
