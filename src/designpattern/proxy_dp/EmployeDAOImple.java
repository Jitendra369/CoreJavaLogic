package designpattern.proxy_dp;

public class EmployeDAOImple implements  EmployeDAO{

    @Override
    public Employes create(String client_role, Employes employes) {
        System.out.println("creating employe");
        return new Employes();
    }

    @Override
    public void update(String client_role, int employesID) {
        System.out.println("updating employe");
    }

    @Override
    public void delete(String client_role, int employesID) {
        System.out.println("deleting  employe");

    }
}
