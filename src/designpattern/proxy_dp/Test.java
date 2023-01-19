package designpattern.proxy_dp;

public class Test {
    public static void main(String[] args) {
        EmployeDAO employeDAO = new EmployeProxy();
        employeDAO.create("admin", new Employes());
        System.out.println("operation sucessfull");
    }
}
