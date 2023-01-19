package designpattern.proxy_dp;

public class EmployeProxy implements EmployeDAO{

    EmployeDAO employeDAO;

    EmployeProxy(){
//        getting the real class object
        this.employeDAO = new EmployeDAOImple();
    }

    @Override
    public Employes create(String client_role, Employes employes) {
        if (client_role.equalsIgnoreCase("admin")){
            employeDAO.create(client_role, employes);
            System.out.println("admin is created");
        }
        return null;
    }

    @Override
    public void update(String client_role, int employesID) {
        if (client_role.equalsIgnoreCase("admin")){
            employeDAO.update(client_role, employesID);
        }

    }

    @Override
    public void delete(String client_role, int employesID) {
        if (client_role.equalsIgnoreCase("admin")){
            employeDAO.delete(client_role, employesID);
        }
    }
}
