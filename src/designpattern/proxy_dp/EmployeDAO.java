package designpattern.proxy_dp;

public interface EmployeDAO {
    Employes create(String client_role, Employes employes);
    void update(String client_role, int  employesID);
    void delete(String client_role, int  employesID);
}
